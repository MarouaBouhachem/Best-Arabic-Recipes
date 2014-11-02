/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests.dao;

import com.acme.dbRecipes.persistence.dao.ClientDAO;
import com.acme.dbRecipes.persistence.dao.IClientDAO;
import com.acme.dbRecipes.persistence.model.Client;

/**
 *
 * @author User
 */
public class TestSaveClient {
    public static void main(String[] args) {
        Client c = new Client(11, 17, "med", 169, "salah", "mohamed", null, "gabes", "mohamedsalah@gmail.com");
        IClientDAO clientDAO= new ClientDAO();
        clientDAO.save(c);   
    }
    
}
