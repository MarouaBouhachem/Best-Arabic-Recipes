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
public class Chef extends Utilisateur{
    private int IDChef;
    private int noteGlobale;
    private String cv;

    /**
     *
     * @param IDUtilisateur
     * @param IDChef
     * @param Pseudo
     * @param Password
     * @param Nom
     * @param Prenom
     * @param DateNaiss
     * @param LieuNaiss
     * @param AdresseMail
     */
    public Chef( int IDUtilisateur,int IDChef, String Pseudo, int Password, String Nom, String Prenom, Date DateNaiss, String LieuNaiss, String AdresseMail,int noteGlobale,String cv) {
        super(IDUtilisateur, Pseudo, Password, Nom, Prenom, DateNaiss, LieuNaiss, AdresseMail);
        this.IDChef = IDChef;
        this.noteGlobale=noteGlobale;
        this.cv=cv;
    }

    public Chef() {
      }
    

    public int getIDChef() {
        return IDChef;
    }

    public void setIDChef(int IDChef) {
        this.IDChef = IDChef;
    }

    public int getNoteGlobale() {
        return noteGlobale;
    }

    public void setNoteGlobale(int noteGlobale) {
        this.noteGlobale = noteGlobale;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return super.toString()+ "Chef{" + "IDChef=" + IDChef + ", noteGlobale=" + noteGlobale + ", cv=" + cv + '}';
    }

    
}
