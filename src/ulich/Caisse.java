/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulich;

/**
 *
 * @author HP
 */
public class Caisse {

    private double solde;
    
    public Caisse() {
        this.solde = 0.0;
    }
    
    public Caisse(double soldeInitial) {
        this.solde = soldeInitial;
    }
    
    // LOGIQUE MÉTIER
    public boolean effectuerAjout(double montant) {
        if (montant <= 0) return false;
        this.solde += montant;
        return true;
    }
    
    public boolean effectuerRetrait(double montant) {
        if (montant <= 0 || montant > this.solde) return false;
        this.solde -= montant;
        return true;
    }
    
    public boolean effectuerOperation(String typeOperation, double montant) {
        if ("Entrée".equalsIgnoreCase(typeOperation)) {
            return effectuerAjout(montant);
        } else if ("Sortie".equalsIgnoreCase(typeOperation)) {
            return effectuerRetrait(montant);
        }
        return false;
    }
    
    // GETTERS
    public double getSolde() { return this.solde; }
    public String getSoldeFormate() { 
        return String.format("%.2f FCFA", this.solde); 
    }
}
    

