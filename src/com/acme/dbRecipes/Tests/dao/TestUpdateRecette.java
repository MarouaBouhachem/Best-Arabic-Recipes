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

public class TestUpdateRecette {
    public static void main(String[] args) {
        IRecetteDAO recetteDAO= new RecetteDAO();
        Recette A= recetteDAO.findById(1);
        A.setIngredients("50 g de sucre en poudre, 200 g de farine, 80 g de beurre mou,1 œuf,1/2 cuillerée à café de bicarbonate de soude,1 sachet de sucre vanillé, Sel");
        recetteDAO.update(A);
    }
    
}
