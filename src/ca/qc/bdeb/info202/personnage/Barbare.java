package ca.qc.bdeb.info202.personnage;

public class Barbare extends Personnage {
    public Barbare(char sexe, String nom) {
        super("Barbare", sexe, nom);

        this.maxHP = 120;
        this.HP = this.maxHP;

        this.maxMP = 0;
        this.MP = this.maxMP;

        this.DMG = 10;
        this.DEF = 5;
        this.carryCapacity = 3;
    }
}
