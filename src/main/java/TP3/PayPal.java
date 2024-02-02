package TP3;

public class PayPal extends Paiement{

    private String adresse;
    private String email;

    public PayPal(double paiement, int nrTrx, double montant,double Moy, String adresse, String email) {
        super(paiement, nrTrx, montant,Moy);
        this.adresse = adresse;
        this.email = email;
    }

    @Override
    public void effectuerPaiement(double montant) {
     System.out.println("paiment d un paypale ,Montant:"+montant);
    }
}
