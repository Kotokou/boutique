package tg.univlome.epl.boutique2.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import tg.univlome.epl.boutique2.entites.Produit;
import tg.univlome.epl.boutique2.service.ProduitService;

/**
 *
 * @author papdav
 */
@Path("/produit")
public class ProduitResource {
    private ProduitService produitService;
    
    @GET
    @Path("/{id}")
    public Produit recuperer(@PathParam("id") Long id){
        return produitService.recuperer(id);
    }

}
