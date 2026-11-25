package model;

public class ReservationClient {

    private int idReservationClient;
    private Reservation reservation;
    private Client client;
    private String roleClient;

    // Constructeur vide
    public ReservationClient() {
    }

    // Constructeur complet
    public ReservationClient(int idReservationClient, Reservation reservation,
                             Client client, String roleClient) {
        this.idReservationClient = idReservationClient;
        this.reservation = reservation;
        this.client = client;
        this.roleClient = roleClient;
    }

    // Getters et Setters
    public int getIdReservationClient() {
        return idReservationClient;
    }

    public void setIdReservationClient(int idReservationClient) {
        this.idReservationClient = idReservationClient;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getRoleClient() {
        return roleClient;
    }

    public void setRoleClient(String roleClient) {
        this.roleClient = roleClient;
    }
}