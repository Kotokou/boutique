/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import tg.univlome.epl.boutique2.entites.Achat;

/**
 *
 * @author papdav
 */
public class AchatService {

    private static AchatService instance;
    private static List<Achat> liste;

    private final EmployeService employeService;
    private final ClientService clientService;

    private AchatService() {
        liste = new ArrayList<>();
        employeService = EmployeService.getInstance();
        clientService = ClientService.getInstance();
    }

    public static AchatService getInstance() {
        if (instance == null) {
            instance = new AchatService();
        }

        return instance;
    }

    public List<Achat> lister() {
        return liste;
    }

    public Achat recuperer(Long id) {
        for (Achat e : liste) {
            if (Objects.equals(e.getId(), id)) {
                return e;
            }
        }
        return null;
    }

    public int compter() {
        return liste.size();
    }

    public void ajouter(Achat e) {
        if (e != null) {
            liste.add(e);
        }
    }

    public void modifier(Achat e) {
        if (liste.contains(e)) {
            liste.set(liste.indexOf(e), e);
        }
    }

    public void supprimer(Long id) {
        liste.remove(id.intValue());
    }
}
