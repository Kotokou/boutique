package tg.univlome.epl.boutique2.rest;

import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import java.util.List;
import tg.univlome.epl.boutique2.entites.Produit;
import tg.univlome.epl.boutique2.service.ProduitService;

/**
 *
 * @author papdav
 */
@Path("/produit")
public class ProduitResource {

    private final ProduitService produitService = ProduitService.getInstance();

    @Path("/{id}")
    public Produit recuperer(@PathParam("id") Long id) {
        return produitService.recuperer(id);
    }

    @GET
    public List<Produit> lister() {
        return produitService.lister();
    }

    @POST
    public Produit ajouter(@BeanParam Produit produit) {
        produitService.ajouter(produit);
        return produit;
    }

    @PUT
    public Produit modifier(@BeanParam Produit produit) {
        produitService.modifier(produit);
        return produit;
    }

    @DELETE
    public void supprimer(@QueryParam("id") Long id) {
        produitService.supprimer(id);
    }

}
