package model;

import java.time.LocalDateTime;

public class ReservationService {

    private int idReservationService;
    private Reservation reservation;
    private Service service;
    private int quantite;
    private double prixUnitaire;
    private double montantTotal;
    private LocalDateTime dateService;
    private String statut;
    private String remarques;

    // Constructeur vide
    public ReservationService() {
    }

    // Constructeur complet
    public ReservationService(int idReservationService, Reservation reservation,
                              Service service, int quantite, double prixUnitaire,
                              double montantTotal, LocalDateTime dateService,
                              String statut, String remarques) {
        this.idReservationService = idReservationService;
        this.reservation = reservation;
        this.service = service;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.montantTotal = montantTotal;
        this.dateService = dateService;
        this.statut = statut;
        this.remarques = remarques;
    }

    // Getters et Setters
    public int getIdReservationService() {
        return idReservationService;
    }

    public void setIdReservationService(int idReservationService) {
        this.idReservationService = idReservationService;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public LocalDateTime getDateService() {
        return dateService;
    }

    public void setDateService(LocalDateTime dateService) {
        this.dateService = dateService;
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