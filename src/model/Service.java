package model;

public class Service {

    private int idService;
    private String nomService;
    private String description;
    private double prix;
    private Integer dureeMinutes;
    private String statut;
    private CategorieService categorieService;

    // Constructeur vide
    public Service() {
    }

    // Constructeur complet
    public Service(int idService, String nomService, String description,
                   double prix, Integer dureeMinutes, String statut,
                   CategorieService categorieService) {
        this.idService = idService;
        this.nomService = nomService;
        this.description = description;
        this.prix = prix;
        this.dureeMinutes = dureeMinutes;
        this.statut = statut;
        this.categorieService = categorieService;
    }

    // Getters et Setters
    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNomService() {
        return nomService;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Integer getDureeMinutes() {
        return dureeMinutes;
    }

    public void setDureeMinutes(Integer dureeMinutes) {
        this.dureeMinutes = dureeMinutes;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public CategorieService getCategorieService() {
        return categorieService;
    }

    public void setCategorieService(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
}