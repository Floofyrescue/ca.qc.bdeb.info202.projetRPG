package ca.qc.bdeb.info202.personnage;
import ca.qc.bdeb.info202.equipement.Equipement;
import java.util.ArrayList;

public class Personnage {
    protected String nom;
    protected char sexe;
    protected String type;

    protected int HP;
    protected int maxHP;

    protected int MP;
    protected int maxMP;

    protected int DMG;
    protected int DEF;
    protected int carryCapacity;

    protected ArrayList<Equipement> equipement = new ArrayList<Equipement>();

    public Personnage(String type,char sexe,String nom) {
        this.type = type;
        this.sexe = sexe;
        this.nom = nom;
    }

   public void addEquipement(Equipement equipment) {
        if (equipement.size() == this.carryCapacity) {
            System.out.println("Erreur");
        } else {
            equipement.add(equipment);
            this.maxMP += equipment.getMP();
            this.MP += this.maxMP;

            this.maxHP += equipment.getDEF();
            this.HP += this.maxHP;

            this.DMG += equipment.getDMG();
        }
   }

    public String getNom() {
        return nom;
    }

    public char getSexe() {
        return sexe;
    }

    public String getType() {
        return type;
    }

    public int getHP() {
        return HP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getMP() {
        return MP;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public int getDMG() {
        return DMG;
    }

    public int getDEF() {
        return DEF;
    }

    public int getCarryCapacity() {
        return carryCapacity;
    }
}
