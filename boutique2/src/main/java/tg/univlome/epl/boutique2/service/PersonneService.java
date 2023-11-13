/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import tg.univlome.epl.boutique2.entites.Personne;

/**
 *
 * @author papdav
 */
public class PersonneService {

    private static PersonneService instance;
    private static List<Personne> liste;

    private PersonneService() {
        liste = new ArrayList<>();
    }

    public static PersonneService getInstance() {
        if (instance == null) {
            instance = new PersonneService();
        }

        return instance;
    }

    public List<Personne> lister() {
        return liste;
    }

    public Personne recuperer(Long id) {
        for (Personne e : liste) {
            if (Objects.equals(e.getId(), id)) {
                return e;
            }
        }
        return null;
    }

    public int compter() {
        return liste.size();
    }

    public void ajouter(Personne e) {
        liste.add(e);
    }

    public void modifier(Personne e) {
        if (liste.contains(e)) {
            liste.set(liste.indexOf(e), e);
        }
    }

    public void supprimer(Long id) {
        liste.remove(id.intValue());
    }
}
