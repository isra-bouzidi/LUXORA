package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservation {

    private int idReservation;
    private String reference;
    private LocalDateTime dateReservation;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;
    private int nombreAdultes;
    private int nombreEnfants;
    private String statut;
    private String demandesSpeciales;
    private Utilisateur utilisateur;

    // Constructeur vide
    public Reservation() {
    }

    // Constructeur complet
    public Reservation(int idReservation, String reference, LocalDateTime dateReservation,
                       LocalDate dateArrivee, LocalDate dateDepart, int nombreAdultes,
                       int nombreEnfants, String statut, String demandesSpeciales,
                       Utilisateur utilisateur) {

        this.idReservation = idReservation;
        this.reference = reference;
        this.dateReservation = dateReservation;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
        this.nombreAdultes = nombreAdultes;
        this.nombreEnfants = nombreEnfants;
        this.statut = statut;
        this.demandesSpeciales = demandesSpeciales;
        this.utilisateur = utilisateur;
    }

    // Getters et Setters
    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDateTime getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDateTime dateReservation) {
        this.dateReservation = dateReservation;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(LocalDate dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }

    public int getNombreAdultes() {
        return nombreAdultes;
    }

    public void setNombreAdultes(int nombreAdultes) {
        this.nombreAdultes = nombreAdultes;
    }

    public int getNombreEnfants() {
        return nombreEnfants;
    }

    public void setNombreEnfants(int nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDemandesSpeciales() {
        return demandesSpeciales;
    }

    public void setDemandesSpeciales(String demandesSpeciales) {
        this.demandesSpeciales = demandesSpeciales;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}