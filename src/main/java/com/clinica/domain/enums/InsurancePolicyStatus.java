package com.clinica.domain.enums;

/**
 * Enumeración que define el estado de las pólizas de seguro médico
 */
public enum InsurancePolicyStatus {
    ACTIVA(true, "Póliza Activa"),
    INACTIVA(false, "Póliza Inactiva");

    private final boolean active;
    private final String description;

    InsurancePolicyStatus(boolean active, String description) {
        this.active = active;
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public String getDescription() {
        return description;
    }
}