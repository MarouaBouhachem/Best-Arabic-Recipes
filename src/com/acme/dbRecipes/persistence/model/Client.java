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
public class Client extends Utilisateur{
    private int IDClient;

    /**
     *
     * @param IDUtilisateur
     * @param IDClient
     * @param Pseudo
     * @param Password
     * @param Nom
     * @param Prenom
     * @param DateNaiss
     * @param LieuNaiss
     * @param AdresseMail
     */
    public Client( int IDUtilisateur,int IDClient, String Pseudo, int Password, String Nom, String Prenom, Date DateNaiss, String LieuNaiss, String AdresseMail) {
        super(IDUtilisateur, Pseudo, Password, Nom, Prenom, DateNaiss, LieuNaiss, AdresseMail);
        this.IDClient = IDClient;
    }

    public Client() {
      }
    

    public int getIDClient() {
        return IDClient;
    }

    public void setIDClient(int IDClient) {
        this.IDClient = IDClient;
    }

    @Override
    public String toString() {
        return super.toString()+"Client{" + "IDClient=" + IDClient + '}';
    }
}
