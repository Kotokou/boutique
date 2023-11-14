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
import tg.univlome.epl.boutique2.entites.ProduitAchete;
import java.util.List;
import tg.univlome.epl.boutique2.service.ProduitAcheteService;

/**
 *
 * @author papdav
 */
@Path("produit-achete")
public class ProduitAcheteResource {

    final private ProduitAcheteService produitAcheteService = ProduitAcheteService.getInstance();

    @GET
    public List<ProduitAchete> lister() {
        return this.produitAcheteService.lister();
    }

    @GET
    @Path("{achat_id}/{produit_id}")
    public ProduitAchete recuperer(@PathParam("achat_id") Long achat_id, @PathParam("produit_id") Long produit_id) {
        return this.produitAcheteService.recuperer(achat_id, produit_id);
    }

    @GET
    @Path("total")
    public int compter() {
        return this.produitAcheteService.compter();
    }

    @POST
    public void ajouter(ProduitAchete e) {
        this.produitAcheteService.ajouter(e);
    }

    @PUT
    public void modifier(ProduitAchete e) {
        this.produitAcheteService.modifier(e);
    }

    @DELETE
    @Path("{achat_id}/{produit_id}")
    public void supprimer(@PathParam("achat_id") Long achat_id, @PathParam("produit_id") Long produit_id) {
        this.produitAcheteService.supprimer(achat_id, produit_id);
    }
}
