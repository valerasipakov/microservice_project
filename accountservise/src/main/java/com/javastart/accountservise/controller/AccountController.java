package com.javastart.accountservise.controller;

import com.javastart.accountservise.controller.dto.AccountRequestDTO;
import com.javastart.accountservise.controller.dto.AccountResponseDTO;
import com.javastart.accountservise.entity.Account;
import com.javastart.accountservise.servise.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/accounts")
    public  Long saveAccount(@RequestBody AccountRequestDTO accountRequestDTO){
        return  accountService.saveAccount(accountRequestDTO.getName(),
                accountRequestDTO.getPhone(), accountRequestDTO.getMail());
    }


    @GetMapping("/accounts/{id}")
    public AccountResponseDTO getAccount(@PathVariable Long id){
        return  new AccountResponseDTO(accountService.getAccountById(id));
    }

    @GetMapping("/accounts")
    public List<AccountResponseDTO> getAccounts(){
        return  accountService.getAccounts()
                .stream()
                .map(AccountResponseDTO::new)
                .collect(Collectors.toList());

        }
    }

