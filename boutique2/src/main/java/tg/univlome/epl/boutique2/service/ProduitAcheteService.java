/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import tg.univlome.epl.boutique2.entites.ProduitAchete;

/**
 *
 * @author papdav
 */
public class ProduitAcheteService {

    private static ProduitAcheteService instance;
    private static List<ProduitAchete> liste;
    private final AchatService achatService;
    private final ProduitService produitService;

    private ProduitAcheteService() {
        liste = new ArrayList<>();
        this.achatService = AchatService.getInstance();
        this.produitService = ProduitService.getInstance();
    }

    public static ProduitAcheteService getInstance() {
        if (instance == null) {
            instance = new ProduitAcheteService();
        }

        return instance;
    }

    public List<ProduitAchete> lister() {
        return liste;
    }

    public ProduitAchete recuperer(Long achat_id, Long produit_id) {
        for (ProduitAchete e : liste) {
            if (Objects.equals(e.getAchat().getId(), achat_id) && Objects.equals(e.getProduit().getId(), produit_id)) {
                return e;
            }
        }
        return null;
    }

    public int compter() {
        return liste.size();
    }

    public void ajouter(ProduitAchete e) {
        liste.add(e);
    }

    public void modifier(ProduitAchete e) {
        if (liste.contains(e)) {
            liste.set(liste.indexOf(e), e);
        }
    }

    public void supprimer(Long achat_id, Long produit_id) {
        for (ProduitAchete e : liste) {
            if (Objects.equals(e.getAchat().getId(), achat_id) && Objects.equals(e.getProduit().getId(), produit_id)) {
                liste.remove(e);
            }
        }
    }
}
