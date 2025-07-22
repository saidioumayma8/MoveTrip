package org.budgetmanager.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Caravane {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String description;
    private Double prixParJour;
    private boolean disponible;

    public Caravane() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrixParJour() {
        return prixParJour;
    }

    public void setPrixParJour(Double prixParJour) {
        this.prixParJour = prixParJour;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
