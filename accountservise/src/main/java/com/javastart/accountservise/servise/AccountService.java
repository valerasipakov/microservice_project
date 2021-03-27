package com.javastart.accountservise.servise;

import com.javastart.accountservise.entity.Account;
import com.javastart.accountservise.exception.AccountNotFoundException;
import com.javastart.accountservise.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public  Long saveAccount(String name, String phone, String mail) {
        Account account = new Account(name, phone, mail);
        return  accountRepository.save(account).getId();
    }
    public Account getAccountById(Long id){
        return accountRepository.findById(id)
                .orElseThrow(() -> new AccountNotFoundException("Can't find account with id:" +id));
    }

    public List<Account> getAccounts(){
        return  accountRepository.findAll();
    }
}
