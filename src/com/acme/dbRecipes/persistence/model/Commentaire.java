/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.persistence.model;

import java.sql.Date;

/**
 *
 * @author User
 */
public class Commentaire {
    Date date;
    String Objet;

    public Commentaire(Date date, String Objet) {
        this.date = date;
        this.Objet = Objet;
    }
    
    
}
