package TP2;

public class Avion extends Vehicule {
   /* Avion : une classe qui hérite de Vehicule et a les attributs supplémentaires
    compagnie, vitesseMax, et redéfinit la méthode emettreSon() pour afficher "L'avion
    fait un bruit de moteur puissant.".*/
    private String compagnie;
    private double vitesseMax;

    public Avion(String nom, double prix, String compagnie, double vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void emettreSon() {
        System.out.println("\"L'avion fait un bruit de moteur puissant.\"");
    }
}
