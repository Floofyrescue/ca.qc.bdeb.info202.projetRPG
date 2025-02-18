package ca.qc.bdeb.info202.equipement;

public class ManaEquipement extends Equipement {
    private int MP;

    public ManaEquipement(String nom, String description, String rarete, int MP) {
        super(nom, description, rarete);
        this.MP = MP;
    }

    public int getMP() {
        return MP;
    }

    @Override
    public int getDMG() {
        return 0;
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
