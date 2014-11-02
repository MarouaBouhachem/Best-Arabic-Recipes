/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests.dao;

import com.acme.dbRecipes.persistence.dao.RecetteDAO;
import com.acme.dbRecipes.persistence.dao.IRecetteDAO;
import com.acme.dbRecipes.persistence.model.Recette;
import java.util.List;

/**
 *
 * @author User
 */
public class TestFindAllRecettes {
    public static void main(String[] args) {
         List <Recette> chefs=null;
         IRecetteDAO chefDAO=new RecetteDAO();
         chefs =chefDAO.findAll();
         for(Recette chf:chefs){
             System.out.println(chf);
         }
    }
    
}
