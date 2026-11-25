package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Facture {

    private int idFacture;
    private String reference;
    private Reservation reservation;
    private Client client;
    private Utilisateur utilisateur;
    private LocalDateTime dateFacture;
    private LocalDate dateEcheance;
    private String statut;
    private String remarques;

    // Constructeur vide
    public Facture() {
    }

    // Constructeur complet
    public Facture(int idFacture, String reference, Reservation reservation,
                   Client client, Utilisateur utilisateur, LocalDateTime dateFacture,
                   LocalDate dateEcheance, String statut, String remarques) {
        this.idFacture = idFacture;
        this.reference = reference;
        this.reservation = reservation;
        this.client = client;
        this.utilisateur = utilisateur;
        this.dateFacture = dateFacture;
        this.dateEcheance = dateEcheance;
        this.statut = statut;
        this.remarques = remarques;
    }

    // Getters et Setters
    public int getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(int idFacture) {
        this.idFacture = idFacture;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public LocalDateTime getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(LocalDateTime dateFacture) {
        this.dateFacture = dateFacture;
    }

    public LocalDate getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(LocalDate dateEcheance) {
        this.dateEcheance = dateEcheance;
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