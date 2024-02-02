package TP6;

public class Livre implements Empruntable{
   private String titre;
   private String auteur;
   private boolean etat;

    public Livre(String titre, String auteur, boolean etat) {
        this.titre = titre;
        this.auteur = auteur;
        this.etat = etat;
    }

    @Override
    public void emprunter() {
        if(etat){
            System.out.println("Le livre '" + titre + "' par " + auteur + " a été emprunté.");
                } else {
            System.out.println("Le livre '" + titre + "' est déjà emprunté.");

        }
    }

    @Override
    public void retourner() {
        if (!etat) {
            System.out.println("Le livre '" + titre + "' par " + auteur + " a été retourné.");
        } else {
            System.out.println("Le livre '" + titre + "' n'est pas emprunté.");
        }
    }
}
