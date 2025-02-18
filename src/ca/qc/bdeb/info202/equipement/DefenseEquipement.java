package ca.qc.bdeb.info202.equipement;

public class DefenseEquipement extends Equipement {
    private int DEF;

    public DefenseEquipement(String nom, String description, String rarete, int DEF) {
        super(nom, description, rarete);
        this.DEF = DEF;
    }

    public int getMP() {
        return 0;
    }

    @Override
    public int getDMG() {
        return 0;
    }

    @Override
    public int getDEF() {
        return this.DEF;
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
