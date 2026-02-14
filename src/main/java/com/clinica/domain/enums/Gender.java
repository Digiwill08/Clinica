package com.clinica.domain.enums;

/**
 * Enumeración que define los géneros disponibles para pacientes
 */
public enum Gender {
    MASCULINO("Masculino"),
    FEMENINO("Femenino"),
    OTRO("Otro");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}