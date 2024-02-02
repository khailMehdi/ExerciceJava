package TP4;

public class main {
    public static void main(String[] args) {
//        Créez une application qui contient une méthode main() pour tester les différentes
//        classes, dans laquelle :
//— déclarez et intentiez un ingénieur ;
//— déclarez et intentiez un manager ;
//— affichez les informations de l’ingénieur et du manager (nom, prénom, salaire,
         Employe Ing=new Ingénieur("mehdi","moha","@MOHA.com","0655665","ingnieur") ;
    Employe mng=new Manager("man","mml","@gmail.com","6566855","Manager");

   System.out.println(Ing.calculerSalire());
   System.out.println(mng.calculerSalire());

    }








}
