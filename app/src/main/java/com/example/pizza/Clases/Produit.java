package com.example.pizza.Clases;

import com.example.pizza.R;

public class Produit {
    private int id=0;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String detaislngred;
    private String description;
    private String preparation;
    private static int comp;

    public Produit(){}
    public Produit(String nom, int nbrIngredients, int photo, String duree, String detaislngred, String description, String preparation) {
        this.nom = nom;
        this.id=comp++;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detaislngred = detaislngred;
        this.description = description;
        this.preparation = preparation;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }
    public String
    getDuree() {
        return duree;
    }
    public String getDetaislngred() {
        return detaislngred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }

    public int getComp() {
        return comp;
    }


    public int getId() {
        return id;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setDetaislngred(String detaislngred) {
        this.detaislngred = detaislngred;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detaislngred='" + detaislngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
    public int getAlarme(){
        return R.drawable.alarme;
    }
    public int getMan(){
        return R.drawable.man;
    }
}
