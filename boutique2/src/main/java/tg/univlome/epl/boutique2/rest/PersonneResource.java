/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.rest;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import tg.univlome.epl.boutique2.entites.Personne;
import java.util.List;
import tg.univlome.epl.boutique2.service.PersonneService;

/**
 *
 * @author boris
 */
@Path("personne")
public class PersonneResource {

    final private PersonneService personneService = PersonneService.getInstance();

    @GET
    public List<Personne> lister() {
        return this.personneService.lister();
    }

    @GET
    @Path("{id}")
    public Personne recuperer(@PathParam("id") Long id) {
        return this.personneService.recuperer(id);
    }

    @GET
    @Path("total")
    public int compter() {
        return this.personneService.compter();
    }

    @POST
    public void ajouter(Personne e) {
        this.personneService.ajouter(e);
    }

    @PUT
    public void modifier(Personne e) {
        this.personneService.modifier(e);
    }

    @DELETE
    @Path("{id}")
    public void supprimer(@PathParam("id") Long id) {
        this.personneService.supprimer(id);
    }
}
