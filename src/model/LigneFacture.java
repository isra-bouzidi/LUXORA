package model;

public class LigneFacture {

    private int idLigne;
    private Facture facture;
    private String description;
    private int quantite;
    private double prixUnitaire;
    private double montantTotal;

    // Constructeur vide
    public LigneFacture() {
    }

    // Constructeur complet
    public LigneFacture(int idLigne, Facture facture, String description,
                        int quantite, double prixUnitaire, double montantTotal) {
        this.idLigne = idLigne;
        this.facture = facture;
        this.description = description;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.montantTotal = montantTotal;
    }

    // Getters et Setters
    public int getIdLigne() {
        return idLigne;
    }

    public void setIdLigne(int idLigne) {
        this.idLigne = idLigne;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}