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
import jakarta.ws.rs.Produces;
import tg.univlome.epl.boutique2.entites.Categorie;
import tg.univlome.epl.boutique2.service.CategorieService;
import java.util.List;

/**
 *
 * @author papdav
 */
@Path("categorie")
public class CategorieResource {

    final private CategorieService service = CategorieService.getInstance();

    @Produces({"application/json", "application/xml"})
    @GET
    public List<Categorie> lister() {
        return this.service.lister();
    }

    @GET
    @Path("{id}")
    public Categorie recuperer(@PathParam("id") int id) {
        return this.service.recuperer(id);
    }

    @GET
    @Path("total")
    public int compter() {
        return this.service.compter();
    }

    @POST
    public void ajouter(Categorie e) {
        this.service.ajouter(e);
    }

    @PUT
    public void modifier(Categorie e) {
        this.service.modifier(e);
    }

    @DELETE
    public void supprimer(int id) {
        this.service.supprimer(id);
    }
}
