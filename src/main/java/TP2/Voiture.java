package TP2;

public class Voiture extends Vehicule {
    /*Voiture : une classe qui hérite de Vehicule et a les attributs supplémentaires modele,
    annee, et redéfinit la méthode emettreSon() pour afficher "La voiture vrombit.".*/
  private String module;
  private int annee;

    public Voiture(String nom, double prix, String module, int annee) {
        super(nom, prix);
        this.module = module;
        this.annee = annee;
    }

    @Override
    public void emettreSon() {
        System.out.println("La voiture vrombit.");
    }
}
