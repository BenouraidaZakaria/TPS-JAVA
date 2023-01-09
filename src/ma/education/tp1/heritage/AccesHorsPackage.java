package ma.education.tp1.heritage;

import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle {
    public static void main(String[] args) {
        Salle s1 = new Salle("Salle B");
//        System.out.println(s1.id );
//        System.out.println(s1.nom );
    }
    public void afficher(Salle s) {
//        System.out.println(s.id );
//        System.out.println(s.nom );
        System.out.println(id );
        System.out.println(nom );}
}
//il faut utilser super dans le constructeur sinon il n'auras pas acces au attribut.