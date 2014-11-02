/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.persistence.dao;

import com.acme.dbRecipes.persistence.model.Client;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ClientDAO implements IClientDAO {

    private Connection connection = DataSource.getInstance().getConnection();
    private static final String SQL_FIND = "SELECT * FROM client WHERE IDClient=?";
    private static final String SQL_SAVE = "INSERT INTO client (IDUtilisateur,IDClient,Pseudo,Password,Nom,Prenom,DateNaiss,LieuNaiss,AdresseMail)"
            + "VALUES(?,?,?,?,?,?,?,?,?)";
     private static final String SQL_UPDATE = "UPDATE client SET IDUtilisateur=?,Pseudo=?,Password=? ,Nom=?, "
             + "Prenom=?, DateNaiss=?,LieuNaiss=?,AdresseMail=? where IDClient=?";
     private static final String SQL_DELETE = "DELETE FROM client WHERE IDClient=?";
     private static final String SQL_FIND_ALL = "SELECT * FROM Client";
    @Override
    public void save(Client client) {
        if (findById(client.getIDClient()) == null) {
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(SQL_SAVE);
                pstmt.setInt(1, client.getIDUtilisateur());
                pstmt.setInt(2, client.getIDClient());
                pstmt.setString(3, client.getPseudo());
                pstmt.setInt(4, client.getPassword());
                pstmt.setString(5, client.getNom());
                pstmt.setString(6, client.getPrenom());
                pstmt.setDate(7, client.getDateNaiss());
                pstmt.setString(8, client.getLieuNaiss());
                pstmt.setString(9, client.getAdresseMail());

                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "save failed", ex);
            }
        }
    }

    @Override
    public Client findById(int ID) {
        Client found = null;

        PreparedStatement pstmt = null;
        ResultSet rs = null;//recuperer de la base de données


        try {

            pstmt = connection.prepareStatement(SQL_FIND);
            pstmt.setInt(1, ID);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                int utilisateurID=rs.getInt("IDUtilisateur");
                int clientID = rs.getInt("IDClient");
                String clientPseudo=rs.getString("Pseudo");
                int clientPassword = rs.getInt("password");
                String clientNom = rs.getString("Nom");
                String clientPrenom = rs.getString("Prenom");
                Date clientDateNaiss = rs.getDate("DateNaiss");
                String clientLieuNaiss = rs.getString("LieuNaiss");
                String clientAdresseMail = rs.getString("AdresseMail");
                found = new Client(utilisateurID,clientID,clientPseudo, clientPassword, clientNom, clientNom, clientDateNaiss, clientLieuNaiss, clientAdresseMail);
            }
            System.out.println(found);
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }

    @Override
     public void update(Client client) {
        if(findById(client.getIDClient()) != null) {
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(SQL_UPDATE);
                pstmt.setInt(2, client.getIDClient());//appel réseau: 1 => premier pt d'interrogation de SQL_SAVE
                pstmt.setInt(1, client.getIDUtilisateur());
                pstmt.setString(3, client.getPseudo());
                pstmt.setInt(4, client.getPassword());
                pstmt.setString(5, client.getNom());
                pstmt.setString(6, client.getPrenom());
                pstmt.setDate(7, client.getDateNaiss());
                pstmt.setString(8, client.getLieuNaiss());
                pstmt.setString(9, client.getAdresseMail());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            }
        }}
    @Override
    public void delete(Client client ) {
         if(findById(client.getIDClient()) != null) {
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(SQL_DELETE);
                pstmt.setInt(1, client.getIDClient());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
            }
        } }


    @Override
    public List<Client> findAll() {
        List <Client> all = new ArrayList <Client>();//tableau dynamique avec constructeur employee

        Statement stmt = null;
        ResultSet rs = null;//recuperer de la base de données


        try {

            stmt = connection.createStatement();
            
            rs = stmt.executeQuery(SQL_FIND_ALL);
            while (rs.next()) {//tant qu'il existe une ligne j'avance dans le tableau
                int cientID = rs.getInt("IDClient");
                int utilisateurID=rs.getInt("IDUtilisateur");
                int clientID = rs.getInt("IDClient");
                String clientPseudo=rs.getString("Pseudo");
                int clientPassword = rs.getInt("password");
                String clientNom = rs.getString("Nom");
                String clientPrenom = rs.getString("Prenom");
                Date clientDateNaiss = rs.getDate("DateNaiss");
                String clientLieuNaiss = rs.getString("LieuNaiss");
                String clientAdresseMail = rs.getString("AdresseMail");
                Client found = new Client(clientID,utilisateurID,clientPseudo, clientPassword, clientNom, clientNom, clientDateNaiss, clientLieuNaiss, clientAdresseMail);
                all.add(found);// a chaque fois on rajoute à la liste ce qu'on a trouvé

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "find all failed", ex);
        }
        return all;
    }
}
