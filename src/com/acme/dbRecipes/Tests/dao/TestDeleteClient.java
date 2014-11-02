/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests.dao;

import com.acme.dbRecipes.persistence.dao.ClientDAO;
import com.acme.dbRecipes.persistence.model.Client;

/**
 *
 * @author User
 */
public class TestDeleteClient {
    public static void main(String[] args) {
       ClientDAO clientDAO= new ClientDAO();
       Client client= new Client();
       client.setIDClient(5);
       clientDAO.delete(client);
    }
    
}
