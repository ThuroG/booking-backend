package com.thuro.travels.booking.account;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Setter //Create automatically Setter methods
@Getter //Create automatically Getter methods
@Entity
@Table(name = "accounts")
public class Account {

    // Getters and setters (Required for JPA and general use)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key

    @Column(name = "first_name", nullable = false) // Customize column name and constraints
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false) // Enforce unique email
    private String mailAddress;

    @Column(nullable = false)
    private String password; // In real applications, store password hashes, not plain passwords!

    @Column(name = "citizenship", nullable = false)
    private String citizenship;

    @Column(name = "birth_date")
    private LocalDate birthdate;

    @Column(name = "passport_number", unique = true) // Passport numbers should be unique
    private String passportNumber;

    @Column(name = "passport_expiry_date")
    private LocalDate passportExpiryDate;

    // Constructors (Important: Provide at least a no-args constructor for JPA)
    public Account() {} // No-args constructor (required by JPA)

    public Account(String firstName, String lastName, String mailAddress, String password, String citizenship, LocalDate birthdate, String passportNumber, LocalDate passportExpiryDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
        this.password = password;
        this.citizenship = citizenship;
        this.birthdate = birthdate;
        this.passportNumber = passportNumber;
        this.passportExpiryDate = passportExpiryDate;
    }


    // ... other methods as needed (e.g., equals, hashCode, toString)
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", birthdate=" + birthdate +
                ", passportNumber='" + passportNumber + '\'' +
                ", passportExpiryDate=" + passportExpiryDate + '\'' +
                '}';
    }
}