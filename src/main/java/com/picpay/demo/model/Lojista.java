package com.picpay.demo.model;

public class Lojista implements User {
    private String nome;
    private String email;
    private String senha;
    private String cnpj;

    //get e set do a mais
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Lojista(String nome, String email, String senha, String cnpj) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cnpj = cnpj;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getSenha() {
        return senha;
    }
}
