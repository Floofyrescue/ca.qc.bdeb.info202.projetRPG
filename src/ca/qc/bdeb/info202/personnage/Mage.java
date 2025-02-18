package ca.qc.bdeb.info202.personnage;

public class Mage extends Personnage {
    public Mage(char sexe, String nom) {
        super("Mage", sexe, nom);

        this.maxHP = 70;
        this.HP = this.maxHP;

        this.maxMP = 100;
        this.MP = this.maxMP;

        this.DMG = 2;
        this.DEF = 2;
        this.carryCapacity = 2;
    }
}
