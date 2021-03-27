package com.javastart.accountservise.controller.dto;

import com.javastart.accountservise.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequestDTO {

    private String name;

    private String phone;

    private String mail;


}
