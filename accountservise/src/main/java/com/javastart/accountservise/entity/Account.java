package com.javastart.accountservise.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(schema = "public", name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String phone;

    private String mail;


    public Account(String name, String phone, String mail) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;

    }

}
