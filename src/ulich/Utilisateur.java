/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulich;

/**
 *
 * @author HP
 */
public class Utilisateur {
    
    private String nom;
    private String prenom;
    private String fonction;
    private String motDePasse;

//Constructeur
    public Utilisateur(String nom, String prenom, String fonction, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.motDePasse = motDePasse;
    }

//Guetter
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getFonction() {
        return fonction;
    }

//Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setfonction(String fonction){
        this.fonction = fonction;
    }
      
}
