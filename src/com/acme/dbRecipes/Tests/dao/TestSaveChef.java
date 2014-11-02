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
public class TestSaveChef {
    public static void main(String[] args) {
        Chef ch = new Chef(21, 8, "Moumou", 195, "Bouzid", "Mohamed", null, "Nabeul", "Bouzid@gmail.com",3,"Chef Restaurant à MutuelleVille Tunis");
        IChefDAO chefDAO= new ChefDAO();
        chefDAO.save(ch);   
    }
    
}
