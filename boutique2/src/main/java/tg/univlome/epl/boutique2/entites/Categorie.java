/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.entites;

/**
 *
 * @author papdav
 */
public class Categorie {

    private int id;
    private String libelle;
    private String description;

    public Categorie() {
    }

    public Categorie(String libelle, String description) {
        this.libelle = libelle;
        this.description = description;
    }

    public Categorie(int id, String libelle, String description) {
        this.id = id;
        this.libelle = libelle;
        this.description = libelle;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categorie other = (Categorie) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", libelle=" + libelle + ", description=" + description + '}';
    }
}
