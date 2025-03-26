package com.picpay.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "lojistas")
public class Lojista extends User {

    @Column(unique = true, nullable = false)
    private String cnpj;

    @Override
    public String getFullName() {
        return this.getNome();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
