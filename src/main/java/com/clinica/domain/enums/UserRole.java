package com.clinica.domain.enums;

public enum UserRole {
    RECURSOS_HUMANOS("Recursos Humanos"),
    PERSONAL_ADMINISTRATIVO("Personal Administrativo"),
    SOPORTE_INFORMACION("Soporte de Información"),
    ENFERMERA("Enfermera"),
    MEDICO("Médico");

    private final String description;

    UserRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}