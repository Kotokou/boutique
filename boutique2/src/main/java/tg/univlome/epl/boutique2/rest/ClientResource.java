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
import tg.univlome.epl.boutique2.entites.Client;
import java.util.List;
import tg.univlome.epl.boutique2.service.ClientService;

/**
 *
 * @author papdav
 */
@Path("/client")
public class ClientResource {

    final private ClientService clientService = ClientService.getInstance();

    @GET
    @Path("/all")
    public List<Client> lister() {
        return this.clientService.lister();
    }

    @GET
    @Path("/{id}")
    public Client recuperer(@PathParam("id") Long id) {
        return this.clientService.recuperer(id);
    }

    @GET
    @Path("/total")
    public int compter() {
        return this.clientService.compter();
    }

    @POST
    public void ajouter(Client e) {
        this.clientService.ajouter(e);
    }

    @PUT
    public void modifier(Client e) {
        this.clientService.modifier(e);
    }

    @DELETE
    @Path("/{id}")
    public void supprimer(@PathParam("id") Long id) {
        this.clientService.supprimer(id);
    }
}
