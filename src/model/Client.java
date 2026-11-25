package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Client {

    private int idClient;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private LocalDate dateNaissance;
    private String nationalite;
    private String typePieceIdentite;
    private String numeroPieceIdentite;
    private String adresse;
    private LocalDateTime dateCreation;

    // Constructeur vide
    public Client() {
    }

    // Constructeur complet
    public Client(int idClient, String nom, String prenom, String email,
                  String telephone, LocalDate dateNaissance, String nationalite,
                  String typePieceIdentite, String numeroPieceIdentite,
                  String adresse, LocalDateTime dateCreation) {

        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
        this.nationalite = nationalite;
        this.typePieceIdentite = typePieceIdentite;
        this.numeroPieceIdentite = numeroPieceIdentite;
        this.adresse = adresse;
        this.dateCreation = dateCreation;
    }

    // Getters et Setters
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTypePieceIdentite() {
        return typePieceIdentite;
    }

    public void setTypePieceIdentite(String typePieceIdentite) {
        this.typePieceIdentite = typePieceIdentite;
    }

    public String getNumeroPieceIdentite() {
        return numeroPieceIdentite;
    }

    public void setNumeroPieceIdentite(String numeroPieceIdentite) {
        this.numeroPieceIdentite = numeroPieceIdentite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }
}