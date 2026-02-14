package com.clinica.domain.abstracts;

import com.clinica.domain.enums.UserRole;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Clase abstracta que representa un usuario del sistema
 * Define los atributos y comportamientos comunes a todos los usuarios
 */
public abstract class AbstractUser {
    protected String cedula;
    protected String fullName;
    protected String email;
    protected String phoneNumber;
    protected LocalDate birthDate;
    protected String address;
    protected String username;
    protected String password;
    protected UserRole role;

    public AbstractUser(String cedula, String fullName, String email, String phoneNumber,
                       LocalDate birthDate, String address, String username, String password, UserRole role) {
        this.cedula = cedula;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.address = address;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractUser that = (AbstractUser) o;
        return Objects.equals(cedula, that.cedula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula);
    }
}