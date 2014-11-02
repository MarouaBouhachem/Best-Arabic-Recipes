/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.persistence.model;

/**
 *
 * @author User
 */
public class Administrateur extends Utilisateur{
    private int IDAdmin;

    public Administrateur() {
    }

    public int getIDAdmin() {
        return IDAdmin;
    }

    public void setIDAdmin(int IDAdmin) {
        this.IDAdmin = IDAdmin;
    }

     @Override
    public String toString() {
        return super.toString()+"Administrateur{" + "IDAdmin=" + IDAdmin + '}';
    }
 
}
