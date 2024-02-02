package TP3;

public class Commande extends Paiement{

    /*• Créez une classe Commande qui représente une transaction d'achat.
    • Ajoutez un attribut pour le montant de la commande et un attribut pour le moyen
    de paiement (CarteCredit ou PayPal), de type Paiement.

    • Implémentez une méthode, par exemple processPayment(), qui utilise le
    polymorphisme pour effectuer le paiement, indépendamment du type de moyen
    de paiement.*/
    private String typePaiement;

    public Commande(double paiement, int nrTrx, double montant,double Moy, String typePaiement) {
        super(paiement, nrTrx, montant,Moy);
        this.typePaiement = typePaiement;
    }
    public String processPayment(){
        return typePaiement;
    }

}
