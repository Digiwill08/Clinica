package com.clinica.domain.abstracts;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Clase abstracta que representa una orden médica
 * Define los atributos y comportamientos comunes a todos los tipos de órdenes
 */
public abstract class AbstractOrder {
    protected String orderNumber;
    protected String patientCedula;
    protected String physicianCedula;
    protected LocalDateTime creationDate;
    protected int itemNumber;

    public AbstractOrder(String orderNumber, String patientCedula, String physicianCedula, LocalDateTime creationDate) {
        this.orderNumber = orderNumber;
        this.patientCedula = patientCedula;
        this.physicianCedula = physicianCedula;
        this.creationDate = creationDate;
        this.itemNumber = 1;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPatientCedula() {
        return patientCedula;
    }

    public void setPatientCedula(String patientCedula) {
        this.patientCedula = patientCedula;
    }

    public String getPhysicianCedula() {
        return physicianCedula;
    }

    public void setPhysicianCedula(String physicianCedula) {
        this.physicianCedula = physicianCedula;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractOrder that = (AbstractOrder) o;
        return Objects.equals(orderNumber, that.orderNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber);
    }
}