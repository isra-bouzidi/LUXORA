package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class InformationHotel {

    private int idHotel;
    private String nomHotel;
    private String description;
    private String adresse;
    private String ville;
    private String pays;
    private String telephone;
    private String email;
    private String siteWeb;
    private LocalTime heureCheckin;
    private LocalTime heureCheckout;
    private String devise;
    private LocalDateTime dateCreation;

    // Constructeur vide
    public InformationHotel() {
    }

    // Constructeur complet
    public InformationHotel(int idHotel, String nomHotel, String description,
                            String adresse, String ville, String pays,
                            String telephone, String email, String siteWeb,
                            LocalTime heureCheckin, LocalTime heureCheckout,
                            String devise, LocalDateTime dateCreation) {
        this.idHotel = idHotel;
        this.nomHotel = nomHotel;
        this.description = description;
        this.adresse = adresse;
        this.ville = ville;
        this.pays = pays;
        this.telephone = telephone;
        this.email = email;
        this.siteWeb = siteWeb;
        this.heureCheckin = heureCheckin;
        this.heureCheckout = heureCheckout;
        this.devise = devise;
        this.dateCreation = dateCreation;
    }

    // Getters et Setters
    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public LocalTime getHeureCheckin() {
        return heureCheckin;
    }

    public void setHeureCheckin(LocalTime heureCheckin) {
        this.heureCheckin = heureCheckin;
    }

    public LocalTime getHeureCheckout() {
        return heureCheckout;
    }

    public void setHeureCheckout(LocalTime heureCheckout) {
        this.heureCheckout = heureCheckout;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }
}