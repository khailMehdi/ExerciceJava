package TP5;

public abstract class  Figure {
    public String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double calculeAire();
    public abstract double calculePerimetre();

    public String afficherDetails() {
        return "Nom:" +nom;
    }
}
