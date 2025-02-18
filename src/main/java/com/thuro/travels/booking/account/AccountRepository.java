package com.thuro.travels.booking.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository // Optional, but good practice to explicitly mark as a repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    // Add custom queries here if needed (see examples below)

    // Example: Find accounts by last name
    List<Account> findByLastName(String lastName);

    // Example: Find accounts by email address
    Account findByMailAddress(String mailAddress);

    // Example: Find accounts by passport number
    Account findByPassportNumber(String passportNumber);

    // Example: Find accounts born after a certain date
    List<Account> findByBirthdateAfter(LocalDate date);

    // Example: Find accounts whose passport expires before a certain date
    List<Account> findByPassportExpiryDateBefore(LocalDate date);

    // Example: Find accounts by first name and last name
    List<Account> findByFirstNameAndLastName(String firstName, String lastName);


}