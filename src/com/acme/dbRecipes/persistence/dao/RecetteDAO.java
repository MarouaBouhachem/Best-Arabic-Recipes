/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.persistence.dao;

import com.acme.dbRecipes.persistence.model.Recette;
import java.sql.Connection;
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
public class RecetteDAO implements IRecetteDAO {

    private Connection connection = DataSource.getInstance().getConnection();
    private static final String SQL_FIND = "SELECT * FROM recette WHERE IDRecette=?";
    private static final String SQL_SAVE = "INSERT INTO recette (`IDRecette`, `NomRecette`, "
            + "`Origine`, `Categorie`,`Ingredients` ,`Preparation`, `Duree`, `Difficulte`, `Photo`, `noteRecetteGlobale`)"
            + "VALUES(?,?,?,?,?,?,?,?,?,?)";
     private static final String SQL_UPDATE = "UPDATE recette SET NomRecette=?,Origine=? ,Categorie=?, "
             + "Ingredients=?,Preparation=?, Duree=?,Difficulte=?,Photo=?,noteRecetteGlobale=? where IDRecette=?";
     private static final String SQL_DELETE = "DELETE FROM recette WHERE IDRecette=?";
     private static final String SQL_FIND_ALL = "SELECT * FROM recette";
    @Override
    public void save(Recette recette) {
        if (findById(recette.getIDRecette()) == null) {
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(SQL_SAVE);
                pstmt.setInt(1, recette.getIDRecette());
                pstmt.setString(2, recette.getNomRecette());
                pstmt.setString(3, recette.getOrigine());
                pstmt.setString(4, recette.getCategorie());
                pstmt.setString(5, recette.getIngredients());
                pstmt.setString(5, recette.getPreparation());
                pstmt.setString(6, recette.getDuree());
                pstmt.setString(7, recette.getDifficulte());
                pstmt.setString(8, recette.getPhoto());
                pstmt.setInt(9, recette.getNoteRecetteGlobale());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(RecetteDAO.class.getName()).log(Level.SEVERE, "save failed", ex);
            }
        }
    }

    @Override
    public Recette findById(int ID) {
        Recette found = null;

        PreparedStatement pstmt = null;
        ResultSet rs = null;//recuperer de la base de données


        try {

            pstmt = connection.prepareStatement(SQL_FIND);
            pstmt.setInt(1, ID);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                int recetteIDRecette=rs.getInt("IDRecette");
                String recetteNomRecette=rs.getString("NomRecette");
                String recetteOrigine = rs.getString("Origine");
                String recetteCategorie = rs.getString("Categorie");
                String recetteIngredients = rs.getString("Ingredients");
                String recettePreparation= rs.getString("Preparation");
                String recetteDuree = rs.getString("Duree");
                String recetteDifficulte = rs.getString("Difficulte");
                String recettePhoto = rs.getString("Photo");
                int recetteNoteRecetteGlobale = rs.getInt("noteRecetteGlobale");
                found = new Recette(recetteIDRecette,recetteNomRecette, recetteOrigine, recetteCategorie,recetteIngredients,recettePreparation,recetteDuree, recetteDifficulte, recettePhoto, recetteNoteRecetteGlobale);
            }
            System.out.println(found);
        } catch (SQLException ex) {
            Logger.getLogger(RecetteDAO.class.getName()).log(Level.SEVERE, "find failed", ex);
        }
        return found;
    }

    @Override
     public void update(Recette recette) {
        if(findById(recette.getIDRecette()) != null) {
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(SQL_UPDATE);
                pstmt.setInt(1, recette.getIDRecette());
                pstmt.setString(2, recette.getNomRecette());
                pstmt.setString(3, recette.getOrigine());
                pstmt.setString(4, recette.getCategorie());
                pstmt.setString(5, recette.getIngredients());
                pstmt.setString(6, recette.getPreparation());
                pstmt.setString(7, recette.getDuree());
                pstmt.setString(8, recette.getDifficulte());
                pstmt.setString(9, recette.getPhoto());
                pstmt.setInt(10, recette.getNoteRecetteGlobale());
               
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(RecetteDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            }
        }}
    @Override
    public void delete(Recette recette ) {
         if(findById(recette.getIDRecette()) != null) {
            PreparedStatement pstmt = null;
            try {
                pstmt = connection.prepareStatement(SQL_DELETE);
                pstmt.setInt(1, recette.getIDRecette());
                pstmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(RecetteDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
            }
        } }


    @Override
    public List<Recette> findAll() {
        List <Recette> all = new ArrayList <Recette>();//tableau dynamique avec constructeur employee

        Statement stmt = null;
        ResultSet rs = null;//recuperer de la base de données


        try {

            stmt = connection.createStatement();
            
            rs = stmt.executeQuery(SQL_FIND_ALL);
            while (rs.next()) {//tant qu'il existe une ligne j'avance dans le tableau
                int recetteIDRecette=rs.getInt("IDRecette");
                String recetteNomRecette=rs.getString("NomRecette");
                String recetteOrigine = rs.getString("Origine");
                String recetteCategorie = rs.getString("Categorie");
                String recetteIngredients = rs.getString("Ingredients");
                String recettePreparation= rs.getString("Preparation");
                String recetteDuree = rs.getString("Duree");
                String recetteDifficulte = rs.getString("Difficulte");
                String recettePhoto = rs.getString("Photo");
                int recetteNoteRecetteGlobale = rs.getInt("noteRecetteGlobale");
                Recette found = new Recette(recetteIDRecette,recetteNomRecette, recetteOrigine, recetteCategorie,recetteIngredients,recettePreparation,recetteDuree, recetteDifficulte, recettePhoto, recetteNoteRecetteGlobale);
                all.add(found);// a chaque fois on rajoute à la liste ce qu'on a trouvé

            }
        } catch (SQLException ex) {
            Logger.getLogger(RecetteDAO.class.getName()).log(Level.SEVERE, "find all failed", ex);
        }
        return all;
    }
}
