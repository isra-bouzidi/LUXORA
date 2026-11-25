package model;

import java.time.LocalDateTime;

public class JournalActivite {

    private int idActivite;
    private Utilisateur utilisateur;
    private String action;
    private String description;
    private String tableConcernee;
    private Integer idElement;
    private String adresseIp;
    private LocalDateTime dateActivite;

    // Constructeur vide
    public JournalActivite() {
    }

    // Constructeur complet
    public JournalActivite(int idActivite, Utilisateur utilisateur,
                           String action, String description,
                           String tableConcernee, Integer idElement,
                           String adresseIp, LocalDateTime dateActivite) {
        this.idActivite = idActivite;
        this.utilisateur = utilisateur;
        this.action = action;
        this.description = description;
        this.tableConcernee = tableConcernee;
        this.idElement = idElement;
        this.adresseIp = adresseIp;
        this.dateActivite = dateActivite;
    }

    // Getters et Setters
    public int getIdActivite() {
        return idActivite;
    }

    public void setIdActivite(int idActivite) {
        this.idActivite = idActivite;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTableConcernee() {
        return tableConcernee;
    }

    public void setTableConcernee(String tableConcernee) {
        this.tableConcernee = tableConcernee;
    }

    public Integer getIdElement() {
        return idElement;
    }

    public void setIdElement(Integer idElement) {
        this.idElement = idElement;
    }

    public String getAdresseIp() {
        return adresseIp;
    }

    public void setAdresseIp(String adresseIp) {
        this.adresseIp = adresseIp;
    }

    public LocalDateTime getDateActivite() {
        return dateActivite;
    }

    public void setDateActivite(LocalDateTime dateActivite) {
        this.dateActivite = dateActivite;
    }
}