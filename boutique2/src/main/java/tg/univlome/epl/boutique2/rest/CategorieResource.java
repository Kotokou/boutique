/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.List;
import tg.univlome.epl.boutique2.entites.Categorie;
import tg.univlome.epl.boutique2.service.CategorieService;

/**
 *
 * @author papdav
 */
@Path("/categorie")
public class CategorieResource {
    private CategorieService categorieService = CategorieService.getInstance();
    
    @GET
    public List<Categorie> lister(){
        return categorieService.lister();
    }
    
}
