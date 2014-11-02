/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests.dao;

import com.acme.dbRecipes.persistence.dao.ChefDAO;
import com.acme.dbRecipes.persistence.dao.IChefDAO;
import com.acme.dbRecipes.persistence.model.Chef;

/**
 *
 * @author User
 */

public class TestUpdateChef {
    public static void main(String[] args) {
        IChefDAO chefDAO= new ChefDAO();
        Chef A= chefDAO.findById(2);
        A.setLieuNaiss("Bizerte");
        chefDAO.update(A);
    }
    
}
