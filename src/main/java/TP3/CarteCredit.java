package TP3;

public class CarteCredit extends Paiement{
      /*• Chaque classe dérivée peut ajouter des attributs spécifiques, tels que le numéro
    de carte pour CarteCredit ou l'adresse email pour PayPal.
            • Implémentez la méthode effectuerPaiement(double montant) dans chaque
    classe dérivée pour simuler le processus de paiement en affichant un message
    approprié.*/
    private long NrCompte;

    public CarteCredit(double paiement, int nrTrx, double montant,double Moy, long nrCompte) {
        super(paiement, nrTrx, montant,Moy);
        NrCompte = nrCompte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("paiment d un Crte credit:"+montant);
    }
}
