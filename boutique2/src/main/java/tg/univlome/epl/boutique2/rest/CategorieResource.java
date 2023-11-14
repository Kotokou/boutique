/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import tg.univlome.epl.boutique2.entites.Categorie;
import tg.univlome.epl.boutique2.service.CategorieService;

/**
 *
 * @author papdav
 */
@Path("/categorie")
public class CategorieResource {

    private final CategorieService categorieService = CategorieService.getInstance();

    @GET
    public Categorie recuperer(@PathParam("id") int id) {
        return categorieService.recuperer(id);
    }

    @GET
    public List<Categorie> lister() {
        return categorieService.lister();
    }

    @POST
    public Categorie Ajouter(@BeanParam Categorie categorie) {
        categorieService.ajouter(categorie);
        return categorie;
    }

    @PUT
    public Categorie modifier(@BeanParam Categorie categorie) {
        categorieService.modifier(categorie);
        return categorie;
    }

    @DELETE
    public void supprimer(@QueryParam("id") int id) {
        categorieService.supprimer(id);
    }

}
