package Salle;

import java.util.List;

public class Salle {

    // déclaration de variables d'instance

    private final int i;
    private final List<String> places;

    // constructeur

    /**
     * Spécification du constructeur
     * @param i capacité de la salle
     * @param places nombre de place
     */
    public Salle(int i, List<String> places) {
        this.i = i;
        this.places = places;
    }

    public int getI() {
        return i;
    }

    public List<String> getPlaces() {
        return places;
    }
}
