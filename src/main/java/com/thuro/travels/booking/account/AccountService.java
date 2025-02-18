package com.thuro.travels.booking.account;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public void createAccount(Account account) {
        accountRepository.save(account); // Save an account
    }

    public void deleteAccount(Account account) {
        accountRepository.delete(account); // Delete an account
    }

    public List<Account> findAccountsByLastName(String lastName) {
        return accountRepository.findByLastName(lastName); // Use the custom query
    }

    public Account findAccountByEmail(String email) {
        return accountRepository.findByMailAddress(email);
    }

    public Account findAccountByPassportNumber(String passportNumber) {
        return accountRepository.findByPassportNumber(passportNumber);
    }

}