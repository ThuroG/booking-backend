package com.thuro.travels.booking.account;


import io.micrometer.observation.ObservationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        accountRepository.save(account); // Save an account
        return account;
    }

    public void deleteAccount(Account account) {
        accountRepository.delete(account); // Delete an account
    }

    public List<Account> getAllAccounts() {
        return accountRepository.getAllAccounts(); // Use the custom query
    }

    public List<Account> findAccountsByLastName(String lastName) {
        return accountRepository.findByLastName(lastName); // Use the custom query
    }

    public Account findAccountByAccountId(Long id) {
        return accountRepository.findByAccountId(id);
    }

    public Account findAccountByEmail(String email) {
        return accountRepository.findByMailAddress(email);
    }

    public Account findAccountByPassportNumber(String passportNumber) {
        return accountRepository.findByPassportNumber(passportNumber);
    }

}