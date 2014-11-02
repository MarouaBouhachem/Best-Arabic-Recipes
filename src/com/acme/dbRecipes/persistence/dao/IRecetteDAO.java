/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.persistence.dao;

import com.acme.dbRecipes.persistence.model.Recette;
import java.util.List;

/**
 *
 * @author User
 */
public interface IRecetteDAO {
    public abstract void save (Recette Recette);
    public Recette findById(int ID);
    void update (Recette recette);
    void delete (Recette recette);
    List<Recette> findAll();
    
}
