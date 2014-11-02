/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class TestCreateConnection {
    public static void main (String[] args){
    String url="jdbc:mysql://localhost:3306/dbRecipes";
    String user="root";
    String password="";
    try{
        Connection connection= DriverManager.getConnection(url, user, password);
        System.out.println("CONNECTION ESTABLISHED");
    }
    catch (SQLException ex){
        System.out.println("PROBLEM OCCURED: "+ex.getMessage());
            }
   } 
}
