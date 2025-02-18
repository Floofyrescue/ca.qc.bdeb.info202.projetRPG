package ca.qc.bdeb.info202.equipement;

public class AttackEquipement extends Equipement {
    private int DMG;

    public AttackEquipement(String nom, String description, String rarete, int DMG) {
        super(nom, description, rarete);
        this.DMG = DMG;
    }

    public int getMP() {
        return 0;
    }

    @Override
    public int getDMG() {
        return this.DMG;
    }

    @Override
    public int getDEF() {
        return 0;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String getRarete() {
        return this.rarete;
    }
}
