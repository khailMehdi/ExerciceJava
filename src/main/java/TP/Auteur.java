package TP;

public class Auteur extends Personne{
    private String nomAteur;

    public Auteur(String nom, String prenom, String email, String tel, int age, String nomAteur) {
        super(nom, prenom, email, tel, age);
        this.nomAteur = nomAteur;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nomAteur='" + nomAteur + '\'' +
                '}';
    }
}
