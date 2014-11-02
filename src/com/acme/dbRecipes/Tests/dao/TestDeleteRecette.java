/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests.dao;

import com.acme.dbRecipes.persistence.dao.RecetteDAO;
import com.acme.dbRecipes.persistence.model.Recette;

/**
 *
 * @author User
 */
public class TestDeleteRecette {
    public static void main(String[] args) {
       RecetteDAO recetteDAO= new RecetteDAO();
       Recette recette= new Recette();
       recette.setIDRecette(1);
       recetteDAO.delete(recette);
    }
    
}
