package ca.qc.bdeb.info202.personnage;

public class Juif extends Personnage {
    public Juif(char sexe, String nom) {
        super("Juif", sexe, nom);

        this.maxHP = 50;
        this.HP = this.maxHP;

        this.maxMP = 200;
        this.MP = this.maxMP;

        this.DMG = 200;
        this.DEF = 0;
        this.carryCapacity = 6;
    }
}
