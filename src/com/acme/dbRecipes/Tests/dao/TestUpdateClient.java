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

public class TestUpdateClient {
    public static void main(String[] args) {
        IClientDAO clientDAO= new ClientDAO();
        Client Amir= clientDAO.findById(8);
        Amir.setLieuNaiss("MontPlaisir");
        clientDAO.update(Amir);
    }
    
}
