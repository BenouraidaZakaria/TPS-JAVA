package ma.education.tp1.introduction;

public class Salle {
    /*   attributs  de classe */
    protected long id;
    protected String nom;

    /*  constructeur de classe  */
    Salle(){}
    public Salle(String nom){
        this.nom=nom;
    }
    public Salle(long id, String nom){
        this.id=id;
        this.nom=nom;
    }
}
