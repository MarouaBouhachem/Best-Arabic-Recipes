/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests.dao;

import com.acme.dbRecipes.persistence.dao.RecetteDAO;
import com.acme.dbRecipes.persistence.dao.IRecetteDAO;
import com.acme.dbRecipes.persistence.model.Recette;

/**
 *
 * @author User
 */
public class TestSaveRecette {
    public static void main(String[] args) {
        Recette R = new Recette(1,"Coeurs sablés au chocolat blanc","Tunisie","Recette Classique","Tunisie","aa","bb","50min","recette.jpg",5);
        IRecetteDAO recetteDAO= new RecetteDAO();
        recetteDAO.save(R);   
    }
    
}
