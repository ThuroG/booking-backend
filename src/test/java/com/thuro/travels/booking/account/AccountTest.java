package com.thuro.travels.booking.account;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void testAccountCreation() {
        LocalDate birthdate = LocalDate.of(1990, 5, 15);
        LocalDate passportExpiry = LocalDate.of(2025, 10, 20);
        Account account = new Account("John", "Doe", "john.doe@example.com", "password123", "USA", birthdate, "AB123456", passportExpiry);

        assertEquals("John", account.getFirstName());
        assertEquals("Doe", account.getLastName());
        assertEquals("john.doe@example.com", account.getMailAddress());
        assertEquals("password123", account.getPassword()); // In real apps, you'd hash this!
        assertEquals("USA", account.getCitizenship());
        assertEquals(birthdate, account.getBirthdate());
        assertEquals("AB123456", account.getPassportNumber());
        assertEquals(passportExpiry, account.getPassportExpiryDate());
    }

    @Test
    public void testAccountSetters() {
        Account account = new Account();
        account.setFirstName("Jane");
        account.setLastName("Smith");
        //... set other fields...

        assertEquals("Jane", account.getFirstName());
        assertEquals("Smith", account.getLastName());
        //... assert other fields...
    }

    @Test
    public void testToString() {
        Account account = new Account("John", "Doe", "john.doe@example.com", "password123", "USA", LocalDate.of(1990, 5, 15), "AB123456", LocalDate.of(2025, 10, 20));
        String expectedString = "Account{" +
                "id=null, firstName='John', lastName='Doe', mailAddress='john.doe@example.com', citizenship='USA', birthdate=1990-05-15, passportNumber='AB123456', passportExpiryDate=2025-10-20'}";
        assertEquals(expectedString, account.toString());
    }

    // TODO Write tests for RUD Operations
    // Write tests for deleteAccount, findByLastName, findByMailAddress, findByPassportNumber, findByBirthdateAfter, findByPassportExpiryDateBefore, findByFirstNameAndLastName
    // Use the AccountService and AccountRepository classes to test these methods


}