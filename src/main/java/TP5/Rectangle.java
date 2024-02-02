package TP5;

public class Rectangle extends Figure{

    private double longueur;
    private double largeur;
    public Rectangle(String nom , double largeur,double longueur) {
        super(nom);
        this.longueur=longueur;
        this.largeur=largeur;
    }

    @Override
    public double calculeAire() {
        double res=(longueur*largeur);
        return res;
    }

    @Override
    public double calculePerimetre() {
        double res =(2*(longueur+largeur));
        return res;
    }
    @Override
    public String afficherDetails() {
        return super.afficherDetails()+" ,largeur: "+largeur+",longueur: "+longueur+"\n"
                +"Perimetre:"+calculePerimetre()+"\n"
                +"Aire:"+calculeAire();
    }

}
