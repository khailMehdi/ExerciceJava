package TP6;

public class Dvd implements Empruntable{
    private String titre;
    private String realisateur;
    private boolean etat;

    public Dvd(String titre, String realisateur, boolean etat) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.etat = etat;
    }

    @Override
    public void emprunter() {
        if (etat) {

            System.out.println("Le DVD '" + titre + "' réalisé par " + realisateur + " a été emprunté.");
        } else {
            System.out.println("Le DVD '" + titre + "' est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (!etat) {

            System.out.println("Le DVD '" + titre + "' réalisé par " + realisateur + " a été retourné.");
        } else {
            System.out.println("Le DVD '" + titre + "' n'est pas emprunté.");
        }
    }
}
