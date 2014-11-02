/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class TestCreateChef {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dbRecipes";
        String user = "root";
        String password = "";
        Connection connection = null;
        Statement stmt = null;
        String sql = "INSERT INTO chef (IDUtilisateur,IDChef,Pseudo,Password,Nom,Prenom,DateNaiss,LieuNaiss,AdresseMail,noteGlobale,cv)"
                + "VALUES(21,2,'Master',4567,'Beji','Salim',14/08/1968,'Elriadh','salim.baji@gmail.com',4,'Chef cuisinier a monofood')";
    try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("CONNECTION ESTABLISHED");
            stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("PROBLEM OCCURED: " + ex.getMessage());
            ex.printStackTrace();//accèlèrer l'execution
            
        }
    }
    
}
