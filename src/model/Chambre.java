package model;

public class Chambre {

    private int idChambre;
    private String numero;
    private int etage;
    private String statut;
    private TypeChambre typeChambre;

    // Constructeur vide
    public Chambre() {
    }

    // Constructeur complet
    public Chambre(int idChambre, String numero, int etage, String statut, TypeChambre typeChambre) {
        this.idChambre = idChambre;
        this.numero = numero;
        this.etage = etage;
        this.statut = statut;
        this.typeChambre = typeChambre;
    }

    // Getters et Setters
    public int getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(int idChambre) {
        this.idChambre = idChambre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public TypeChambre getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(TypeChambre typeChambre) {
        this.typeChambre = typeChambre;
    }
}