import ca.qc.bdeb.info202.personnage.*;
import ca.qc.bdeb.info202.equipement.*;


public class Main {
    public static void main(String[] args) {
        Barbare A_b = new Barbare('I',"Conan");
        Juif A_j = new Juif('M',"Raziel");
        Mage A_m = new Mage('F',"Uriel");
        Voleur A_v = new Voleur('F',"Sophie");

        Equipement[] arsenal = {
          new AttackEquipement("Épée","Une épée","Commun",10),
          new DefenseEquipement("Bouclier","Un bouclier","Commun",15),
          new ManaEquipement("Baguette","Une baguette","Rare",30)
        };

        System.out.println(A_b.getDMG());
        A_b.addEquipement(arsenal[0]);
        System.out.println(A_b.getDMG());

        fight(A_b,A_j);

    }

    public static void fight(Personnage p1, Personnage p2) {
        int p1h = p1.getHP();
        int p2h = p2.getHP();
        boolean isdead1 = false;
        boolean isdead2 = false;


        System.out.println("Combat entre: " + p1.getNom() + " et " + p2.getNom());

        do {
            System.out.println("PdV restant: " + p1h + " et " + p2h);

            System.out.println(p1.getNom() + " inflige " + p1.getDMG());
            p2h -= p1.getDMG();

            if(p2h <= 0) {
                isdead2 = true;
                System.out.println("Mort de: " + p2.getNom());
                break;
            }

            System.out.println(p2.getNom() + " inflige " + p2.getDMG());

            if(p2.containsEquipement() > -1){
                p2.getEquipement().get(p2.containsEquipement());
            }

            p1h -= p2.getDMG();

            if(p1h <= 0) {
                isdead1 = true;
                System.out.println("Mort de: " + p1.getNom());
                break;
            }
        } while (!(isdead1 && isdead2));

        int p1m = p1.getMP();
        int p2m = p2.getMP();

        if(isdead1) {
            if((p1m + p2m) > p2.getMaxMP()){
                p2.setMP(p2.getMaxMP());
            } else {
                p2.setMP(p1m + p2m);
            }

            System.out.println("Nouveau mana: " + p2.getMP());
        } else if (isdead2){
            if((p2m + p1m) > p1.getMaxMP()){
                p1.setMP(p1.getMaxMP());
            } else {
                p1.setMP(p2m + p1m);
            }

            System.out.println("Nouveau mana: " + p1.getMP());
        }
    }
}