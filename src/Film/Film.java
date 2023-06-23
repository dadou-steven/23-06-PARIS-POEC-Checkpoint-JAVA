package Film;

import java.util.Date;

public class Film {

    // déclaration de variables d'instance

    private final String titanic;
    private final String unBateauQuiCoule;
    private final Date date;

    // constructeur

    /**
     * Spécification du constructeur
     * @param titanic le titre ou nom du film
     * @param unBateauQuiCoule le synopsis ou description du film
     * @param date la date de sortie du film
     */
    public Film(String titanic, String unBateauQuiCoule, Date date) {
        this.titanic = titanic;
        this.unBateauQuiCoule = unBateauQuiCoule;
        this.date = date;
    }

    public String getTitanic() {
        return titanic;
    }

    public String getUnBateauQuiCoule() {
        return unBateauQuiCoule;
    }

    public Date getDate() {
        return date;
    }
}
