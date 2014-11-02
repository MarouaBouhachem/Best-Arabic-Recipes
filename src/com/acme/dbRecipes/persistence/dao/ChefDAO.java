/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.persistence.dao;

import com.acme.dbRecipes.persistence.model.Chef;
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
public class ChefDAO implements IChefDAO {

    private Connection connection = DataSource.getInstance().getConnection();
    private static final String SQL_FIND = "SELECT * FROM chef WHERE IDChef=?";
    private static final String SQL_SAVE = "INSERT INTO chef(IDUtilisateur,IDChef,Pseudo,Password,Nom,Prenom,DateNaiss,LieuNaiss,AdresseMail,noteGlobale,cv)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
     private static final String SQL_UPDATE = "UPDATE chef SET IDUtilisateur=?,Pseudo=?,Password=? ,Nom=?, "
             + "Prenom=?, DateNaiss=?,LieuNaiss=?,AdresseMail=?,noteGlobale=?,cv=? where IDChef=?";
     private static final String SQL_DELETE = "DELETE FROM chef WHERE IDChef=?";
     private static final String SQL_FIND_ALL = "SELECT * FROM chef";
    @Override
    public void save(Chef chef) {
        if (findById(chef.getIDChef()) == null) {
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(SQL_SAVE);
                pstmt.setInt(1, chef.getIDUtilisateur());
                pstmt.setInt(2, chef.getIDChef());
                pstmt.setString(3, chef.getPseudo());
                pstmt.setInt(4, chef.getPassword());
                pstmt.setString(5, chef.getNom());
                pstmt.setString(6, chef.getPrenom());
                pstmt.setDate(7, chef.getDateNaiss());
                pstmt.setString(8, chef.getLieuNaiss());
                pstmt.setString(9, chef.getAdresseMail());
                pstmt.setInt(10, chef.getNoteGlobale());
                pstmt.setString(11, chef.getCv());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ChefDAO.class.getName()).log(Level.SEVERE, "save failed", ex);
            }
        }
    }

    @Override
    public Chef findById(int ID) {
        Chef found = null;

        PreparedStatement pstmt = null;
        ResultSet rs = null;//recuperer de la base de données


        try {

            pstmt = connection.prepareStatement(SQL_FIND);
            pstmt.setInt(1, ID);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                int utilisateurID=rs.getInt("IDUtilisateur");
                int chefID = rs.getInt("IDChef");
                String chefPseudo=rs.getString("Pseudo");
                int chefPassword = rs.getInt("password");
                String chefNom = rs.getString("Nom");
                String chefPrenom = rs.getString("Prenom");
                Date chefDateNaiss = rs.getDate("DateNaiss");
                String chefLieuNaiss = rs.getString("LieuNaiss");
                String chefAdresseMail = rs.getString("AdresseMail");
                int chefNoteGlobale = rs.getInt("noteGlobale");
                String chefCv = rs.getString("cv");
                found = new Chef(utilisateurID,chefID,chefPseudo, chefPassword, chefNom, chefNom, chefDateNaiss, chefLieuNaiss, chefAdresseMail,chefNoteGlobale,chefCv);
            }
            System.out.println(found);
        } catch (SQLException ex) {
            Logger.getLogger(ChefDAO.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }

    @Override
     public void update(Chef chef) {
        if(findById(chef.getIDChef()) != null) {
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(SQL_UPDATE);
                pstmt.setInt(2, chef.getIDChef());//appel réseau: 1 => premier pt d'interrogation de SQL_SAVE
                pstmt.setInt(1, chef.getIDUtilisateur());
                pstmt.setString(3, chef.getPseudo());
                pstmt.setInt(4, chef.getPassword());
                pstmt.setString(5, chef.getNom());
                pstmt.setString(6, chef.getPrenom());
                pstmt.setDate(7, chef.getDateNaiss());
                pstmt.setString(8, chef.getLieuNaiss());
                pstmt.setString(9, chef.getAdresseMail());
                pstmt.setInt(10, chef.getNoteGlobale());
                pstmt.setString(11, chef.getCv());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ChefDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            }
        }}
    @Override
    public void delete(Chef chef) {
         if(findById(chef.getIDChef()) != null) {
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(SQL_DELETE);
                pstmt.setInt(1, chef.getIDChef());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ChefDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
            }
        } }


    @Override
    public List<Chef> findAll() {
        List <Chef> all = new ArrayList <Chef>();//tableau dynamique avec constructeur employee

        Statement stmt = null;
        ResultSet rs = null;//recuperer de la base de données


        try {

            stmt = connection.createStatement();
            
            rs = stmt.executeQuery(SQL_FIND_ALL);
            while (rs.next()) {//tant qu'il existe une ligne j'avance dans le tableau
                int utilisateurID=rs.getInt("IDUtilisateur");
                int chefID = rs.getInt("IDChef");
                String chefPseudo=rs.getString("Pseudo");
                int chefPassword = rs.getInt("password");
                String chefNom = rs.getString("Nom");
                String chefPrenom = rs.getString("Prenom");
                Date chefDateNaiss = rs.getDate("DateNaiss");
                String chefLieuNaiss = rs.getString("LieuNaiss");
                String chefAdresseMail = rs.getString("AdresseMail");
                int chefNoteGlobale = rs.getInt("noteGlobale");
                String chefCv = rs.getString("cv");
                Chef found = new Chef (utilisateurID,chefID,chefPseudo, chefPassword, chefNom, chefNom, chefDateNaiss, chefLieuNaiss, chefAdresseMail,chefNoteGlobale,chefCv);
                all.add(found);// a chaque fois on rajoute à la liste ce qu'on a trouvé

            }
        } catch (SQLException ex) {
            Logger.getLogger(ChefDAO.class.getName()).log(Level.SEVERE, "find all failed", ex);
        }
        return all;
    }
}
