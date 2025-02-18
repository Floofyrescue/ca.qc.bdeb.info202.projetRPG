package ca.qc.bdeb.info202.equipement;

public abstract class Equipement {
    protected String nom;
    protected String description;
    protected String rarete;

    protected Equipement(String nom, String description, String rarete) {
        this.nom = nom;
        this.description = description;
        this.rarete = rarete;
    }

    public abstract String getNom();

    public abstract String getDescription();

    public abstract String getRarete();

    public abstract int getMP();

    public abstract int getDMG();

    public abstract int getDEF();
}
