package TP2;


public class Moto extends Vehicule {
    private String marque;
    private double puissance;

    public Moto(String nom, double prix, String marque, double puissance) {
        super(nom, prix);
        this.marque = marque;
        this.puissance = puissance;
    }

    @Override
    public void emettreSon() {
        System.out.println("La moto rugit.");
    }
}

