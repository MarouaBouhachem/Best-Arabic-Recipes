/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests.dao;

import com.acme.dbRecipes.persistence.dao.ChefDAO;
import com.acme.dbRecipes.persistence.dao.IChefDAO;
import com.acme.dbRecipes.persistence.model.Chef;
import java.util.List;

/**
 *
 * @author User
 */
public class TestFindAllChefs {
    public static void main(String[] args) {
         List <Chef> chefs=null;
         IChefDAO chefDAO=new ChefDAO();
         chefs =chefDAO.findAll();
         for(Chef chf:chefs){
             System.out.println(chf);
         }
    }
    
}
