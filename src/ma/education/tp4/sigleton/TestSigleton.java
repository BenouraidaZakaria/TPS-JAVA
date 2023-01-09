package ma.education.tp4.sigleton;

public class TestSigleton {
    public static void main(String[] args) {
        Terre t1= Terre.getInstance(1000, 2000);
        Terre t2= Terre.getInstance(4000, 5000);

        System.out.println(t1.distanceToSoleil+"|"+t1.surface);
        System.out.println(t2.distanceToSoleil+"|"+t2.surface);
//le nombre d'objets crees et un seul objet car on a limite la creation de plusieurs objet.
    }
}
