/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import tg.univlome.epl.boutique2.entites.Client;

/**
 *
 * @author papdav
 */
public class ClientService {

    private static ClientService instance;
    private static List<Client> liste;

    private ClientService() {
        liste = new ArrayList<>();
    }

    public static ClientService getInstance() {
        if (instance == null) {
            instance = new ClientService();
        }

        return instance;
    }

    public List<Client> lister() {
        return liste;
    }

    public Client recuperer(Long id) {
        for (Client e : liste) {
            if (Objects.equals(e.getId(), id)) {
                return e;
            }
        }
        return null;
    }

    public int compter() {
        return liste.size();
    }

    public void ajouter(Client e) {
        liste.add(e);
    }

    public void modifier(Client e) {
        if (liste.contains(e)) {
            liste.set(liste.indexOf(e), e);
        }
    }

    public void supprimer(Long id) {
        liste.remove(id.intValue());
    }
}
