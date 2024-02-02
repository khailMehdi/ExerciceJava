package TP5;

public class Cercle extends Figure {
    private double rayon;

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }


    @Override
    public double calculeAire() {
        double res=3.14*Math.pow(rayon, 2);
        return res;
    }

    @Override
    public double calculePerimetre() {
        double res=(2*3.14*rayon);
        return res;
    }



    @Override
    public String afficherDetails() {
        return super.afficherDetails()+"\n"
                +"Perimetre:"+calculePerimetre()+"\n"
                +"Aire:"+calculeAire();
    }
}
