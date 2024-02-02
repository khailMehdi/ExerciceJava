package TP5;

public class Main {
    public static void main(String[] args) {
        Figure Cr=new Cercle("Cercle",3);
        System.out.println(Cr.afficherDetails());
        Figure Rc=new Rectangle("Rectangle",2,3);
        System.out.println("******************************");
        System.out.println(Rc.afficherDetails());
    }
}
