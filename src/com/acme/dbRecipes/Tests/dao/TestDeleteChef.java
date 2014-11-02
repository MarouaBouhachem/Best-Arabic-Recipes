/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests.dao;

import com.acme.dbRecipes.persistence.dao.ChefDAO;
import com.acme.dbRecipes.persistence.model.Chef;

/**
 *
 * @author User
 */
public class TestDeleteChef {
    public static void main(String[] args) {
       ChefDAO chefDAO= new ChefDAO();
       Chef chef= new Chef();
       chef.setIDChef(2);
       chefDAO.delete(chef);
     
    }
    
}
