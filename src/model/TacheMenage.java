package model;

import java.time.LocalDateTime;

public class TacheMenage {

    private int idTache;
    private Chambre chambre;
    private Employe employe;
    private String typeTache;
    private LocalDateTime dateCreation;
    private LocalDateTime datePlanifiee;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private String statut;
    private String remarques;

    // Constructeur vide
    public TacheMenage() {
    }

    // Constructeur complet
    public TacheMenage(int idTache, Chambre chambre, Employe employe,
                       String typeTache, LocalDateTime dateCreation,
                       LocalDateTime datePlanifiee, LocalDateTime dateDebut,
                       LocalDateTime dateFin, String statut, String remarques) {
        this.idTache = idTache;
        this.chambre = chambre;
        this.employe = employe;
        this.typeTache = typeTache;
        this.dateCreation = dateCreation;
        this.datePlanifiee = datePlanifiee;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.statut = statut;
        this.remarques = remarques;
    }

    // Getters et Setters
    public int getIdTache() {
        return idTache;
    }

    public void setIdTache(int idTache) {
        this.idTache = idTache;
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

    public String getTypeTache() {
        return typeTache;
    }

    public void setTypeTache(String typeTache) {
        this.typeTache = typeTache;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDateTime getDatePlanifiee() {
        return datePlanifiee;
    }

    public void setDatePlanifiee(LocalDateTime datePlanifiee) {
        this.datePlanifiee = datePlanifiee;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
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