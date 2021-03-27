package com.javastart.accountservise.controller.dto;

import com.javastart.accountservise.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class AccountResponseDTO {

    private String name;

    private String phone;

    private String mail;

    public AccountResponseDTO(Account account){
        this.name = account.getName();
        this.mail = account.getMail();
        this.phone = account.getPhone();
    }


}
