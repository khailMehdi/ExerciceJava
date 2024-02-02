package TP;

public class Livre extends Personne{
    private int id ;
    private String titre;
    private Auteur auteur;


    public Livre(String nom, String prenom, String email, String tel, int age, int id, String titre, Auteur auteur) {
        super(nom, prenom, email, tel, age);
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return super.toString()+"Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur=" + auteur +
                '}';
    }
}




