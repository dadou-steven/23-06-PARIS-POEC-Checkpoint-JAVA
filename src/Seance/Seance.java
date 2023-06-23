package Seance;

import Film.Film;
import Salle.Salle;

import java.sql.Time;
import java.util.Date;

public class Seance {

    // déclaration de variables d'instance

    private final Film film1;
    private final Date date;
    private final Time time;
    private final Salle salle1;

    // constructeur

    public Seance(Film film1, Date date, Time time, Salle salle1) {

        this.film1 = film1;
        this.date = date;
        this.time = time;
        this.salle1 = salle1;
    }

    /**
     * Spécification de la méthode addReservation
     * @param reservation la réservation
     */
    public void addReservation(Reservation reservation) {
    }
}
