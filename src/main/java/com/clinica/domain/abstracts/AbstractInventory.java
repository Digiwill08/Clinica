package com.clinica.domain.abstracts;

import java.util.Objects;

/**
 * Clase abstracta que representa elementos del inventario de la clínica
 * Define los atributos y comportamientos comunes a medicamentos, procedimientos y ayudas diagnósticas
 */
public abstract class AbstractInventory {
    protected String id;
    protected String name;
    protected double cost;
    protected String description;

    public AbstractInventory(String id, String name, double cost, String description) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractInventory that = (AbstractInventory) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}