package ma.education.tp1.heritage;

import ma.education.tp1.introduction.Salle;

public class TestHeritage {
    public static void main(String[] args) {
        Salle s1=new SalleCours(1,"Salle 1",20);
        SalleCours s2=new SalleCours(2,"Salle 2",20);
//      SalleCours s3=s1; cette ligne donne une erreur car s1 a ete declare avec la classe Salle donce il faut utuliser le cast.
        SalleCours s3=(SalleCours)s1;
        SalleCours s4=s2;

        Salle s5=new Laboratoire(2,"LABO","CHIMIE");
        SalleCours s6= new SalleCours(2,"Salle 2",20);
//      SalleCours s7=s5;cette ligne donne une erreur car s1 a ete declare avec la classe Salle ,mais le cast explicite ne marchera pas a cause de la diference dan les constructeur.
        SalleCours s8=s6;
    }
}
