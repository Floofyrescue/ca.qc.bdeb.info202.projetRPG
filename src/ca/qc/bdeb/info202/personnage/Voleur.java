package ca.qc.bdeb.info202.personnage;

public class Voleur extends Personnage {
    public Voleur(char sexe, String nom) {
        super("Voleur", sexe, nom);

        this.maxHP = 90;
        this.HP = this.maxHP;

        this.maxMP = 30;
        this.MP = this.maxMP;

        this.DMG = 5;
        this.DEF = 2;
        this.carryCapacity = 5;
    }
}
