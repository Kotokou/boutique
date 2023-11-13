/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.boutique2.entites;

import java.util.Objects;

/**
 *
 * @author papdav
 */
public class ProduitAchete {

    private Long quantite;
    private double remise;
    private Achat achat;
    private Produit produit;

    public ProduitAchete() {
        this.quantite = 1l;
        this.remise = 0;
    }

    public ProduitAchete(Long quantite, double remise, Achat achat, Produit produit) {
        this.quantite = quantite;
        this.remise = remise;
        this.achat = achat;
        this.produit = produit;
    }

    public double getPrixTotal() {
        double prixTotal = this.quantite * this.produit.getPrixUnitaire() - this.remise;

        return prixTotal;
    }

    public Long getQuantite() {
        return quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Achat getAchat() {
        return achat;
    }

    public void setAchat(Achat achat) {
        this.achat = achat;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.quantite);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.remise) ^ (Double.doubleToLongBits(this.remise) >>> 32));
        hash = 31 * hash + Objects.hashCode(this.achat);
        hash = 31 * hash + Objects.hashCode(this.produit);
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
        final ProduitAchete other = (ProduitAchete) obj;
        if (Double.doubleToLongBits(this.remise) != Double.doubleToLongBits(other.remise)) {
            return false;
        }
        if (!Objects.equals(this.quantite, other.quantite)) {
            return false;
        }
        if (!Objects.equals(this.achat, other.achat)) {
            return false;
        }
        return Objects.equals(this.produit, other.produit);
    }

    @Override
    public String toString() {
        return "ProduitAchete{" + "quantite=" + quantite + ", remise=" + remise + ", achat=" + achat + ", produit=" + produit + "}";
    }
}
