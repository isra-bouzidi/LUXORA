package model;

import java.time.LocalDate;

public class Employe {

    private int idEmploye;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String adresse;
    private String poste;
    private LocalDate dateEmbauche;
    private double salaire;
    private Departement departement;

    // Constructeur vide
    public Employe() {
    }

    // Constructeur complet
    public Employe(int idEmploye, String nom, String prenom, String email,
                   String telephone, String adresse, String poste,
                   LocalDate dateEmbauche, double salaire, Departement departement) {

        this.idEmploye = idEmploye;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.poste = poste;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
        this.departement = departement;
    }

    // Getters et Setters
    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}