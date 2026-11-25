package model;

import java.time.LocalDateTime;

public class Paiement {

    private int idPaiement;
    private Facture facture;
    private double montant;
    private String modePaiement;
    private LocalDateTime datePaiement;
    private String referenceTransaction;
    private String statut;
    private String remarques;

    // Constructeur vide
    public Paiement() {
    }

    // Constructeur complet
    public Paiement(int idPaiement, Facture facture, double montant,
                    String modePaiement, LocalDateTime datePaiement,
                    String referenceTransaction, String statut, String remarques) {
        this.idPaiement = idPaiement;
        this.facture = facture;
        this.montant = montant;
        this.modePaiement = modePaiement;
        this.datePaiement = datePaiement;
        this.referenceTransaction = referenceTransaction;
        this.statut = statut;
        this.remarques = remarques;
    }

    // Getters et Setters
    public int getIdPaiement() {
        return idPaiement;
    }

    public void setIdPaiement(int idPaiement) {
        this.idPaiement = idPaiement;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public LocalDateTime getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDateTime datePaiement) {
        this.datePaiement = datePaiement;
    }

    public String getReferenceTransaction() {
        return referenceTransaction;
    }

    public void setReferenceTransaction(String referenceTransaction) {
        this.referenceTransaction = referenceTransaction;
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