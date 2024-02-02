package TP;

public class Main {
    public static void main(String[] args) {
        Personne per = new Personne("N1","N2", "nnn@gamail.com","065655",40);
     System.out.println(per);
       Auteur At =new Auteur("n2","n2","@gmail.com","40456585",40,"jilali");
      System.out.println(At);
      Adherent Ad =new Adherent("n5","n5","fffnn@gmail.com","54",56,"nnn");
        System.out.println(Ad);
        Livre lv=new Livre("opp","op1","op1@gmail.com","56656",70,55,"titre",At);
        System.out.println(lv);
    }
    }
