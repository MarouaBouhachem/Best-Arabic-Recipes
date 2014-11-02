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
public class TestFindRecetteById {
    public static void main(String[] args) {
        IRecetteDAO recetteDAO= new RecetteDAO();
        Recette R0= recetteDAO.findById(1);
        System.out.println(R0);
    }
    
}
