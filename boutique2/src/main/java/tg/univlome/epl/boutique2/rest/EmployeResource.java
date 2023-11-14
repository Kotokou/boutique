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
import tg.univlome.epl.boutique2.entites.Employe;
import java.util.List;
import tg.univlome.epl.boutique2.service.EmployeService;

/**
 *
 * @author papdav
 */
@Path("employe")
public class EmployeResource {

    final private EmployeService employeService = EmployeService.getInstance();

    @GET
    public List<Employe> lister() {
        return this.employeService.lister();
    }

    @GET
    @Path("{id}")
    public Employe recuperer(@PathParam("id") Long id) {
        return this.employeService.recuperer(id);
    }

    @GET
    @Path("total")
    public int compter() {
        return this.employeService.compter();
    }

    @POST
    public void ajouter(Employe e) {
        this.employeService.ajouter(e);
    }

    @PUT
    public void modifier(Employe e) {
        this.employeService.modifier(e);
    }

    @DELETE
    @Path("{id}")
    public void supprimer(@PathParam("id") Long id) {
        this.employeService.supprimer(id);
    }
}
