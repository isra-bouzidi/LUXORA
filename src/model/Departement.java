package model;

public class Departement {

    private int idDepartement;
    private String nomDepartement;
    private String description;

    // Constructeur vide
    public Departement() {
    }

    // Constructeur complet
    public Departement(int idDepartement, String nomDepartement, String description) {
        this.idDepartement = idDepartement;
        this.nomDepartement = nomDepartement;
        this.description = description;
    }

    // Getters et Setters
    public int getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(int idDepartement) {
        this.idDepartement = idDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}