/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.dbRecipes.persistence.model;

import java.util.List;

/**
 *
 * @author User
 */
public class Recette {
    
private int IDRecette;
private String NomRecette;
private String	Origine;
private String Categorie;
private String Ingredients;
private String Preparation;
private String Duree;
private String Difficulte;
private String Photo;
private int noteRecetteGlobale;
private List <Commentaire> Coms;

    public int getIDRecette() {
        return IDRecette;
    }

    public void setIDRecette(int IDRecette) {
        this.IDRecette = IDRecette;
    }

   
    public String getNomRecette() {
        return NomRecette;
    }

    public void setNomRecette(String NomRecette) {
        this.NomRecette = NomRecette;
    }

    public String getOrigine() {
        return Origine;
    }

    public void setOrigine(String Origine) {
        this.Origine = Origine;
    }

    public String getCategorie() {
        return Categorie;
    }

    public void setCategorie(String  Categorie) {
        this.Categorie = Categorie;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setIngredients(String Ingredients) {
        this.Ingredients = Ingredients;
    }

    public String getPreparation() {
        return Preparation;
    }

    public void setPreparation(String Preparation) {
        this.Preparation = Preparation;
    }

    public String getDuree() {
        return Duree;
    }

    public void setDuree(String Duree) {
        this.Duree = Duree;
    }

   

    public String getDifficulte() {
        return Difficulte;
    }

    public void setDifficulte(String Difficulte) {
        this.Difficulte = Difficulte;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public int getNoteRecetteGlobale() {
        return noteRecetteGlobale;
    }

    public void setNoteRecetteGlobale(int noteRecetteGlobale) {
        this.noteRecetteGlobale = noteRecetteGlobale;
    }

    public List<Commentaire> getComs() {
        return Coms;
    }

    public void setComs(List<Commentaire> Coms) {
        this.Coms = Coms;
    }

    public Recette() {
      }
    
    public Recette(int IDRecette, String NomRecette, String Origine, String Categorie, String Ingredients, String Preparation, String Duree, String Difficulte, String Photo, int noteRecetteGlobale) {
        this.IDRecette = IDRecette;
        this.NomRecette = NomRecette;
        this.Origine = Origine;
        this.Categorie = Categorie;
        this.Ingredients = Ingredients;
        this.Preparation = Preparation;
        this.Duree = Duree;
        this.Difficulte = Difficulte;
        this.Photo = Photo;
        this.noteRecetteGlobale = noteRecetteGlobale;
        
    }

    @Override
    public String toString() {
        return "Recette{" + "IDRecette=" + IDRecette + ", NomRecette=" + NomRecette + ", Origine=" + Origine + ", Categorie=" + Categorie + ", Ingredients=" + Ingredients + ", Preparation=" + Preparation + ", Duree=" + Duree + ", Difficulte=" + Difficulte + ", Photo=" + Photo + ", noteRecetteGlobale=" + noteRecetteGlobale + '}';
    }

   
    

 
}
