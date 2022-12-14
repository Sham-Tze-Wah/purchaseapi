package com.cinematicketsys.purchaseapi.model;

import com.cinematicketsys.purchaseapi.common.AccountStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.UUID;

@Entity
@Table
public class Account {
    @Id
    final UUID id;

    @Column(name="name")
    String name;
    @Column(name="email")
    final String email;

    @Column(name="password")
    String password;

    @Column(name="accountStatus")
    AccountStatus status;

    public Account(UUID id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.status = AccountStatus.Unverified;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
