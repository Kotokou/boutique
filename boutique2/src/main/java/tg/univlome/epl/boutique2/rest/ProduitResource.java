/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.rest;

//import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
//import jakarta.ws.rs.Produces;
import tg.univlome.epl.boutique2.entites.Produit;
import tg.univlome.epl.boutique2.service.ProduitService;
import java.util.List;

/**
 *
 * @author papdav
 */
@Path("/produit")
public class ProduitResource {

    final private ProduitService service = ProduitService.getInstance();

//    @Produces({"application/json", "application/xml"})
//    @Consumes({"application/json", "application/xml"})
    @GET
    @Path("/all")
    public List<Produit> lister() {
        return this.service.lister();
    }

    @GET
    @Path("/{id}")
    public Produit recuperer(@PathParam("id") Long id) {
        return this.service.recuperer(id);
    }

    @GET
    @Path("/total")
    public int compter() {
        return this.service.compter();
    }

    @POST
    public void ajouter(Produit p) {
        this.service.ajouter(p);
    }

    @PUT
    @Path("/{id}")
    public Produit modifier(@PathParam("id") Long id, Produit p) {
        return this.service.modifier(id, p);
    }

    @DELETE
    @Path("/{id}")
    public void supprimer(@PathParam("id") Long id) {
        this.service.supprimer(id);
    }
}
