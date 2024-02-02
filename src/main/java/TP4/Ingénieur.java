package TP4;

public class Ingénieur extends Employe {


    String spécialité;

    public Ingénieur(String nom, String prenom, String email, String telephone, String spécialité) {
        super(nom, prenom, email, telephone );
        this.spécialité = spécialité;
    }

    @Override
    public double calculerSalire() {

        double rus=getSalaire()+(super.calculerSalire()*15)/100;
        return rus;
    }
}
