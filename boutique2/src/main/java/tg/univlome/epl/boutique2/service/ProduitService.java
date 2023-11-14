/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;

import java.util.List;
import java.util.ArrayList;
import tg.univlome.epl.boutique2.entites.Produit;
import java.time.LocalDate;
import java.util.Objects;
import tg.univlome.epl.boutique2.entites.Categorie;

/**
 *
 * @author papdav
 */
public class ProduitService {

    private static ProduitService instance;
    private static List<Produit> liste;

    private ProduitService() {
        liste = new ArrayList<>();

        Categorie c1 = new Categorie(1, "Savon", "");
        Categorie c2 = new Categorie(2, "Boisson", "");

        liste.add(new Produit(1, "Fanico", 200, LocalDate.of(2025, 5, 1), c1));
        liste.add(new Produit(2, "Kdo", 500, LocalDate.of(2024, 12, 1), c1));
        liste.add(new Produit(3, "Awouyo", 650, LocalDate.of(2035, 12, 4), c2));
        liste.add(new Produit(4, "Sodabi", 1200, LocalDate.of(2035, 12, 4), c2));
        liste.add(new Produit(5, "Tchoucoutchou", 100, LocalDate.of(2035, 12, 4), c2));
    }

    public synchronized static ProduitService getInstance() {
        if (instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }

    public void ajouter(Produit e) {
        if (e != null) {
            liste.add(e);
        }
    }

    public Produit modifier(Long id, Produit e) {
        if (liste.contains(e)) {
            return liste.set(liste.indexOf(e), e);
        }

        return null;
    }

    public Produit modifier(Produit e) {
        if (liste.contains(e)) {
            return liste.set(liste.indexOf(e), e);
        }

        return null;
    }

    public List<Produit> lister() {
        return liste;
    }

    public Produit recuperer(Long id) {
        for (Produit e : liste) {
            if (Objects.equals(e.getId(), id)) {
                return e;
            }
        }
        return null;
    }

    public int compter() {
        return liste.size();
    }

    public void supprimer(Long id) {
        liste.remove(id.intValue());
    }
}
