/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author folli
 */
public class DatabaseConnection {

    //variable qui indique l'emplacement du fichier de la base de donnee
    private static final String URL = "jdbc:mysql://localhost:3306/ulich";
    //on creer le nom et le mot de passe pour acceder ici y'a pas car j'ai pas mis dans mysql
    private static final String USER = "root";
    private static final String PASSWORD = "";

    //et on accede a la base de données avec le root et le mot de passe
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
