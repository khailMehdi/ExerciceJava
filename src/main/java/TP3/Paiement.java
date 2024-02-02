package TP3;

public class Paiement {
   private double paiement;
   private int NrTrx;
   private double montant;
   private double Moy;

   public Paiement(double paiement, int nrTrx, double montant,double Moy) {
      this.paiement = paiement;
      NrTrx = nrTrx;
      this.montant = montant;
      this.Moy=Moy;
   }

   public void effectuerPaiement(double montant){
     System.out.println("paiment inconnu ,Montant:"+montant);
   }


}
