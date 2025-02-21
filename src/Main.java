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
          new ManaEquipement("Baguette","Une baguette","Rare",30/2)
        };

        System.out.println(A_b.getDMG());
        A_b.addEquipement(arsenal[0]);
        System.out.println(A_b.getDMG());

        System.out.println(A_j.getMP());
        A_j.addEquipement(arsenal[2]);
        System.out.println(A_j.getMP());

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

            p1h -= p2.getDMG();

            if(p1h <= 0) {
                isdead1 = true;
                System.out.println("Mort de: " + p1.getNom());
                break;
            }
        } while (!(isdead1 && isdead2));
    }
}