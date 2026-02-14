package com.clinica.domain.model.users;

import com.clinica.domain.abstracts.AbstractUser;
import com.clinica.domain.enums.UserRole;
import java.time.LocalDate;

public class User extends AbstractUser {
    private LocalDate creationDate;
    private boolean active;

    public User(String cedula, String fullName, String email, String phoneNumber, LocalDate birthDate, String address, String username, String password, UserRole role) {
        super(cedula, fullName, email, phoneNumber, birthDate, address, username, password, role);
        this.creationDate = LocalDate.now();
        this.active = true;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "cedula='" + cedula + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", active=" + active + '}';
    }
}