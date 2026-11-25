package model;

public class Utilisateur {

    private int idUtilisateur;
    private String username;
    private String password;
    private String statut;
    private Role role;
    private Employe employe;

    // Constructeur vide
    public Utilisateur() {
    }

    // Constructeur complet
    public Utilisateur(int idUtilisateur, String username, String password,
                       String statut, Role role, Employe employe) {
        this.idUtilisateur = idUtilisateur;
        this.username = username;
        this.password = password;
        this.statut = statut;
        this.role = role;
        this.employe = employe;
    }

    // Getters et Setters
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}