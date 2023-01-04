package ma.education.tp1.heritage;

import ma.education.tp1.introduction.Salle;

public class Laboratoire extends Salle {
    String type;

    public Laboratoire(long id, String nom, String type) {
        super(id, nom);
        this.type = type;
    }
}
