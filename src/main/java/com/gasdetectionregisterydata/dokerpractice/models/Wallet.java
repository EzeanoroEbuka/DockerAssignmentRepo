package com.gasdetectionregisterydata.dokerpractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Wallet {

    @Id
    private Long id;
    private String accountNumber;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getPassword() {
        return password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
