package Client;

import Reservation.Reservation;
import Salle.Salle;
import Seance.Seance;

public class Client {

    // déclaration de variables d'instance

    private final String johnDoe;
    private final String mail;

    // constructeur

    /**
     * Spécification du constructeur
     * @param johnDoe le nom du client
     * @param mail les coordonnées du client
     */
    public Client(String johnDoe, String mail) {
        this.johnDoe = johnDoe;
        this.mail = mail;
    }

    public String getJohnDoe() {
        return johnDoe;
    }

    public String getMail() {
        return mail;
    }

    public Reservation reserve(Seance seance, Salle salle, String place) {
        return null;
    }
}
