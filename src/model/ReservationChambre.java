package model;

public class ReservationChambre {

    private int idReservationChambre;
    private Reservation reservation;
    private Chambre chambre;
    private double prixNuit;
    private int nombreNuits;
    private double montantTotal;

    // Constructeur vide
    public ReservationChambre() {
    }

    // Constructeur complet
    public ReservationChambre(int idReservationChambre, Reservation reservation,
                              Chambre chambre, double prixNuit,
                              int nombreNuits, double montantTotal) {
        this.idReservationChambre = idReservationChambre;
        this.reservation = reservation;
        this.chambre = chambre;
        this.prixNuit = prixNuit;
        this.nombreNuits = nombreNuits;
        this.montantTotal = montantTotal;
    }

    // Getters et Setters
    public int getIdReservationChambre() {
        return idReservationChambre;
    }

    public void setIdReservationChambre(int idReservationChambre) {
        this.idReservationChambre = idReservationChambre;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public double getPrixNuit() {
        return prixNuit;
    }

    public void setPrixNuit(double prixNuit) {
        this.prixNuit = prixNuit;
    }

    public int getNombreNuits() {
        return nombreNuits;
    }

    public void setNombreNuits(int nombreNuits) {
        this.nombreNuits = nombreNuits;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }
}