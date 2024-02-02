package TP6;

public class GestionBibliothequeApp {
    public static void main(String[] args) {
  Livre livre=new Livre("livre1","mohmed",true);
  Utlisateur util=new Utlisateur("Mehdi");
  util.emprunterObjet(livre);
  Dvd dvd=new Dvd("dvd1","mohamed",false);
  dvd.retourner();
  util.emprunterObjet(dvd);
    }
}
