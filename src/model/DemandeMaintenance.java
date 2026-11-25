package model;

import java.time.LocalDateTime;

public class DemandeMaintenance {

    private int idDemande;
    private Chambre chambre;
    private Employe employe;
    private String titre;
    private String description;
    private String priorite;
    private String statut;
    private LocalDateTime dateCreation;
    private LocalDateTime dateDebut;
    private LocalDateTime dateResolution;
    private Double cout;

    // Constructeur vide
    public DemandeMaintenance() {
    }

    // Constructeur complet
    public DemandeMaintenance(int idDemande, Chambre chambre, Employe employe,
                              String titre, String description, String priorite,
                              String statut, LocalDateTime dateCreation,
                              LocalDateTime dateDebut, LocalDateTime dateResolution,
                              Double cout) {
        this.idDemande = idDemande;
        this.chambre = chambre;
        this.employe = employe;
        this.titre = titre;
        this.description = description;
        this.priorite = priorite;
        this.statut = statut;
        this.dateCreation = dateCreation;
        this.dateDebut = dateDebut;
        this.dateResolution = dateResolution;
        this.cout = cout;
    }

    // Getters et Setters
    public int getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(int idDemande) {
        this.idDemande = idDemande;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateResolution() {
        return dateResolution;
    }

    public void setDateResolution(LocalDateTime dateResolution) {
        this.dateResolution = dateResolution;
    }

    public Double getCout() {
        return cout;
    }

    public void setCout(Double cout) {
        this.cout = cout;
    }
}