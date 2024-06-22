package com.duster.Blockduster_Movies.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private String amountOfActives;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmountOfActives() {
        return amountOfActives;
    }

    public void setAmountOfActives(String amountOfActives) {
        this.amountOfActives = amountOfActives;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
