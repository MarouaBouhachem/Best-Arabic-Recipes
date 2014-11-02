/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.persistence.dao;

import com.acme.dbRecipes.persistence.model.Chef;
import java.util.List;

/**
 *
 * @author User
 */
public interface IChefDAO {
    public abstract void save (Chef chef);
    public Chef findById(int ID);
    void update (Chef chef);
    void delete (Chef chef);
    List<Chef> findAll();
    
}
