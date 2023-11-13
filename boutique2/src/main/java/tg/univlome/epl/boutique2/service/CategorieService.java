/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import tg.univlome.epl.boutique2.entites.Categorie;

/**
 *
 * @author papdav
 */
public class CategorieService {

    private static CategorieService instance;
    private static List<Categorie> liste;

    private CategorieService() {
        liste = new ArrayList<>();
    }

    public static CategorieService getInstance() {
        if (instance == null) {
            instance = new CategorieService();
        }

        return instance;
    }

    public List<Categorie> lister() {
        return liste;
    }

    public Categorie recuperer(Long id) {
        for (Categorie e : liste) {
            if (Objects.equals(e.getId(), id)) {
                return e;
            }
        }
        return null;
    }

    public int compter() {
        return liste.size();
    }

    public void ajouter(Categorie e) {
        if (e != null) {
            liste.add(e);
        }
    }

    public void modifier(Categorie e) {
        if (liste.contains(e)) {
            liste.set(liste.indexOf(e), e);
        }
    }

    public void supprimer(Long id) {
        liste.remove(recuperer(id));
    }
}
