package model;

import java.time.LocalDateTime;

public class Planning {

    private int idPlanning;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private String typeShift;
    private String statut;
    private Employe employe;

    // Constructeur vide
    public Planning() {
    }

    // Constructeur complet
    public Planning(int idPlanning, LocalDateTime dateDebut, LocalDateTime dateFin,
                    String typeShift, String statut, Employe employe) {
        this.idPlanning = idPlanning;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.typeShift = typeShift;
        this.statut = statut;
        this.employe = employe;
    }

    // Getters et Setters
    public int getIdPlanning() {
        return idPlanning;
    }

    public void setIdPlanning(int idPlanning) {
        this.idPlanning = idPlanning;
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

    public String getTypeShift() {
        return typeShift;
    }

    public void setTypeShift(String typeShift) {
        this.typeShift = typeShift;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}