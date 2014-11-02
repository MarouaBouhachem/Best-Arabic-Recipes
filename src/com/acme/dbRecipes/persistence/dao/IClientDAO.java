/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.persistence.dao;

import com.acme.dbRecipes.persistence.model.Client;
import java.util.List;

/**
 *
 * @author User
 */
public interface IClientDAO {
    public abstract void save (Client client);
    public Client findById(int ID);
    void update (Client client);
    void delete (Client client);
    List<Client> findAll();
    
}
