package ma.education.tp1.introduction;

public class Salle {
    /*   attributs  de classe */
    public long id;
    public String nom;

    /*  constructeur de classe  */
    public Salle(String nom){
        this.nom=nom;
    }
    public Salle(long id, String nom){
        this.id=id;
        this.nom=nom;
    }
    Salle(){}
}
