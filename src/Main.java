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

        A_b.addEquipement(arsenal[0]);
        System.out.println(A_b.);

    }
}