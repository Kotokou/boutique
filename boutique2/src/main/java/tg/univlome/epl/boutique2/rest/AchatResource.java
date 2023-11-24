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
//import jakarta.ws.rs.Produces;
import tg.univlome.epl.boutique2.entites.Achat;
import java.util.List;
import tg.univlome.epl.boutique2.service.AchatService;

/**
 *
 * @author papdav
 */
@Path("/achat")
public class AchatResource {

    final private AchatService achatService = AchatService.getInstance();

//    @Produces({"application/json", "application/xml"})
    @GET
    @Path("/all")
    public List<Achat> lister() {
        return this.achatService.lister();
    }

    @GET
    @Path("/{id}")
    public Achat recuperer(@PathParam("id") Long id) {
        return this.achatService.recuperer(id);
    }

    @GET
    @Path("/total")
    public int compter() {
        return this.achatService.compter();
    }

    @POST
    public void ajouter(Achat e) {
        this.achatService.ajouter(e);
    }

    @PUT
    public void modifier(Achat e) {
        this.achatService.modifier(e);
    }

    @DELETE
    @Path("/{id}")
    public void supprimer(@PathParam("id") Long id) {
        this.achatService.supprimer(id);
    }
}
