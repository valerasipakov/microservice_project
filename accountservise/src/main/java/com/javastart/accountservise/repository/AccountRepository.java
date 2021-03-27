package com.javastart.accountservise.repository;

import com.javastart.accountservise.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {
    List<Account>findAll();
}
