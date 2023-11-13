/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.entites;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author papdav
 */
public class Employe extends Personne {

    private String cnss;

    public Employe() {
        super();
    }

    public Employe(String nom, String prenom, LocalDate dateNaissance, String cnss) {
        super(nom, prenom, dateNaissance);
        this.cnss = cnss;
    }

    public Employe(Long id, String nom, String prenom, LocalDate dateNaissance, String cnss) {
        super(id, nom, prenom, dateNaissance);
        this.cnss = cnss;
    }

    public String getCnss() {
        return cnss;
    }

    public void setCnss(String cnss) {
        this.cnss = cnss;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.cnss);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        return Objects.equals(this.cnss, other.cnss);
    }
    
    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", cnss=" + cnss + "}";
    }
}
