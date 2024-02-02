package TP2;

public class Test {
    public static void main(String[] args) {

        Voiture voiture = new Voiture("Voiture A", 25000.0, "Modèle X", 2023);
        Moto moto = new Moto("Moto B", 12000.0, "Marque Y", 750);
        Avion avion = new Avion("Avion C", 1500000.0, "Compagnie Z", 1000.0);

        voiture.emettreSon();
        System.out.println(voiture.afficherInformations());

        moto.emettreSon();
        System.out.println(moto.afficherInformations());

        avion.emettreSon();
        System.out.println(avion.afficherInformations());
    }
}
