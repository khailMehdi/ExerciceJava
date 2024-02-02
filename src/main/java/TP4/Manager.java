package TP4;

public class Manager extends Employe{


    String service;

    public Manager(String nom, String prenom, String email, String telephone,String srvice) {
        super(nom, prenom, email, telephone);
        this.service=service;
    }

    @Override
    public double calculerSalire() {
        return getSalaire()+(super.calculerSalire()*20)/100;
    }
}
