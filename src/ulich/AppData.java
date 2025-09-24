/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulich;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */


public class AppData {
    private static final AppData instance = new AppData();
    private final List<Utilisateur> users= new ArrayList<>();
    
    private AppData(){
        users.add(new Utilisateur("GNASSOUNOU","Denise","Admin","Admin123"));
        users.add(new Utilisateur("SODJI","Jean","Secrétaire","Secre123"));
    }
    
    public static AppData getInstance(){
        return instance;
    }
    
    public void addUser(Utilisateur u){
        users.add(u);
    }
    public Utilisateur findUser(String nom, String prenom){
        for(Utilisateur u: users){
            if(u.getNom().equalsIgnoreCase(nom)&&u.getPrenom().equalsIgnoreCase(prenom)){
                return u;
            }
        }
        return null;
    }
}
