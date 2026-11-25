package model;

import java.time.LocalDateTime;

public class Sejour {

    private int idSejour;
    private Reservation reservation;
    private LocalDateTime dateCheckin;
    private LocalDateTime dateCheckout;
    private String statut;
    private String remarques;

    // Constructeur vide
    public Sejour() {
    }

    // Constructeur complet
    public Sejour(int idSejour, Reservation reservation, LocalDateTime dateCheckin,
                  LocalDateTime dateCheckout, String statut, String remarques) {
        this.idSejour = idSejour;
        this.reservation = reservation;
        this.dateCheckin = dateCheckin;
        this.dateCheckout = dateCheckout;
        this.statut = statut;
        this.remarques = remarques;
    }

    // Getters et Setters
    public int getIdSejour() {
        return idSejour;
    }

    public void setIdSejour(int idSejour) {
        this.idSejour = idSejour;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public LocalDateTime getDateCheckin() {
        return dateCheckin;
    }

    public void setDateCheckin(LocalDateTime dateCheckin) {
        this.dateCheckin = dateCheckin;
    }

    public LocalDateTime getDateCheckout() {
        return dateCheckout;
    }

    public void setDateCheckout(LocalDateTime dateCheckout) {
        this.dateCheckout = dateCheckout;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }
}