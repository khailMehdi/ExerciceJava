package TP4;

public abstract class  Employe {

   private String nom, prenom, email, telephone ;
   private final double salaire=5000;

    public double getSalaire() {
        return salaire;
    }

    public Employe(String nom, String prenom, String email, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;

    }

    public double calculerSalire(){
     return salaire ;
    }


}
