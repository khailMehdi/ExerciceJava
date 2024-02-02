package TP6;

public class Utlisateur {
    private String nom;

    public Utlisateur(String nom) {
        this.nom = nom;
    }

    public void emprunterObjet(Empruntable object){
        object.emprunter();
    }
}
