/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.Tests.dao;

import com.acme.dbRecipes.persistence.dao.ClientDAO;
import com.acme.dbRecipes.persistence.dao.IClientDAO;
import com.acme.dbRecipes.persistence.model.Client;
import com.sun.xml.internal.ws.message.saaj.SAAJHeader;
import java.util.List;

/**
 *
 * @author User
 */
public class TestFindAllClients {
    public static void main(String[] args) {
         List <Client> clients=null;
         IClientDAO clientDAO=new ClientDAO();
         clients =clientDAO.findAll();
         for(Client clt:clients){//pour chaque employé dns la liste employés
             System.out.println(clt);
         }
    }
    
}
