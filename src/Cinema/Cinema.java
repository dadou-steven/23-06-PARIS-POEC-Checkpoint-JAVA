package Cinema;

import Film.Film;
import Salle.Salle;
import Seance.Seance;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cinema {

    // déclaration de variables d'instance

    private final String cineplex;
    private final String s;

    // constructeur

    /**
     * Spécification du cinéma
     * @param cineplex le nom du cinéma
     * @param s les éléments constitutifs du cinéma
     */
    public Cinema(String cineplex, String s) {
        this.cineplex = cineplex;
        this.s = s;
    }

    // méthodes accesseur (getter) et mutateur (setter)

    public String getCineplex() {
        return cineplex;
    }

    public String getS() {
        return s;
    }

    // méthodes concrètes

    /**
     * Spécification de la méthode addSalle
     * @param salle de réservation
     */
    public void addSalle(Salle salle) {
    }

    /**
     * Spécification de la méthode addFilm
     * @param film le film prévu
     */
    public void addFilm(Film film) {
    }

    /**
     * Spécification de la méthode scheduleSeance
     * @param film1 le titre du film
     * @param date la date de sortie
     * @param time la durée du film
     * @param salle1 la salle de réservation
     */
    public void scheduleSeance(Film film1, Date date, Time time, Salle salle1) {
    }

    /**
     * Spécification de la méthode getAllSeancesForFilmOnDate
     * @param film1 le nom du film intéressé
     * @param date la date de sortie du film
     * @return la liste
     */
    public List<Seance> getAllSeancesForFilmOnDate(Film film1, Date date) {
        return new ArrayList<>();
    }
}
