package model;

public class TypeChambre {

    private int idType;
    private String nomType;
    private String description;
    private int capacite;
    private double superficie;
    private double prixNuit;
    private String statut;

    // Constructeur vide
    public TypeChambre() {
    }

    // Constructeur complet
    public TypeChambre(int idType, String nomType, String description,
                       int capacite, double superficie, double prixNuit, String statut) {
        this.idType = idType;
        this.nomType = nomType;
        this.description = description;
        this.capacite = capacite;
        this.superficie = superficie;
        this.prixNuit = prixNuit;
        this.statut = statut;
    }

    // Getters et Setters
    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getNomType() {
        return nomType;
    }

    public void setNomType(String nomType) {
        this.nomType = nomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrixNuit() {
        return prixNuit;
    }

    public void setPrixNuit(double prixNuit) {
        this.prixNuit = prixNuit;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}