package ma.education.tp4.sigleton;

public class Terre {
    public double distanceToSoleil;
    public double surface;
    private static Terre instance;
    private Terre(double distanceToSoleil, double surface) {
        this.distanceToSoleil = distanceToSoleil;
        this.surface = surface;
    }

    public static Terre getInstance(double distanceToSoleil, double surface) {
        if (instance == null)
            instance = new Terre(distanceToSoleil, surface);
        return instance;
    }

}
