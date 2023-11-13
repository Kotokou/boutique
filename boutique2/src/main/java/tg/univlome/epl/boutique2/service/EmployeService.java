/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import tg.univlome.epl.boutique2.entites.Employe;

/**
 *
 * @author papdav
 */
public class EmployeService {

    private static EmployeService instance;
    private static List<Employe> liste;

    private EmployeService() {
        liste = new ArrayList<>();
    }

    public static EmployeService getInstance() {
        if (instance == null) {
            instance = new EmployeService();
        }

        return instance;
    }

    public List<Employe> lister() {
        return liste;
    }

    public Employe recuperer(Long id) {
        for (Employe e : liste) {
            if (Objects.equals(e.getId(), id)) {
                return e;
            }
        }
        return null;
    }

    public int compter() {
        return liste.size();
    }

    public void ajouter(Employe e) {
        liste.add(e);
    }

    public void modifier(Employe e) {
        if (liste.contains(e)) {
            liste.set(liste.indexOf(e), e);
        }
    }

    public void supprimer(Long id) {
        liste.remove(id.intValue());
    }
}
