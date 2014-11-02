/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests;

import com.acme.dbRecipes.persistence.dao.ClientDAO;
import com.acme.dbRecipes.persistence.dao.IClientDAO;
import com.acme.dbRecipes.persistence.model.Client;

/**
 *
 * @author User
 */
public class TestFindClientById {
    public static void main(String[] args) {
        IClientDAO clientDAO= new ClientDAO();
        Client c0= clientDAO.findById(6);
        System.out.println(c0);
    }
    
}
