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
public class Utilisateur {
    private int IDUtilisateur;
    private String Pseudo;
    private int Password;	
    private String Nom;	
    private String Prenom;	
    private Date DateNaiss;	
    private String LieuNaiss;	
    private String AdresseMail;

    public Utilisateur() {
    }

    public Utilisateur(int IDUtilisateur, String Pseudo, int Password, String Nom, String Prenom, Date DateNaiss, String LieuNaiss, String AdresseMail) {
        this.IDUtilisateur = IDUtilisateur;
        this.Pseudo = Pseudo;
        this.Password = Password;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.DateNaiss = DateNaiss;
        this.LieuNaiss = LieuNaiss;
        this.AdresseMail = AdresseMail;
    }

    public int getIDUtilisateur() {
        return IDUtilisateur;
    }

    public void setIDUtilisateur(int IDUtilisateur) {
        this.IDUtilisateur = IDUtilisateur;
    }

    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String Pseudo) {
        this.Pseudo = Pseudo;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int Password) {
        this.Password = Password;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public Date getDateNaiss() {
        return DateNaiss;
    }

    public void setDateNaiss(Date DateNaiss) {
        this.DateNaiss = DateNaiss;
    }

    public String getLieuNaiss() {
        return LieuNaiss;
    }

    public void setLieuNaiss(String LieuNaiss) {
        this.LieuNaiss = LieuNaiss;
    }

    public String getAdresseMail() {
        return AdresseMail;
    }

    public void setAdresseMail(String AdresseMail) {
        this.AdresseMail = AdresseMail;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "IDUtilisateur=" + IDUtilisateur + ", Pseudo=" + Pseudo + ", Password=" + Password + ", Nom=" + Nom + ", Prenom=" + Prenom + ", DateNaiss=" + DateNaiss + ", LieuNaiss=" + LieuNaiss + ", AdresseMail=" + AdresseMail + '}';
    }
    
    
    
}
