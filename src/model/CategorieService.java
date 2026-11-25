package model;

public class CategorieService {

    private int idCategorie;
    private String nomCategorie;
    private String description;
    private String statut;

    // Constructeur vide
    public CategorieService() {
    }

    // Constructeur complet
    public CategorieService(int idCategorie, String nomCategorie, String description, String statut) {
        this.idCategorie = idCategorie;
        this.nomCategorie = nomCategorie;
        this.description = description;
        this.statut = statut;
    }

    // Getters et Setters
    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}