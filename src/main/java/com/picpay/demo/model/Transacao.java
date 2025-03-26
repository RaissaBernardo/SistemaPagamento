package com.picpay.demo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "transacoes")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long queEnviou;  // ID do usuário que enviou o dinheiro
    private Long queRecebeu;  // ID do usuário que recebeu

    private BigDecimal value;  // valor da transação

    public Transacao() {
    }

    public Transacao(Long queEnviou, Long queRecebeu, BigDecimal value) {
        this.queEnviou = queEnviou;
        this.queRecebeu = queRecebeu;
        this.value = value;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQueEnviou() {
        return queEnviou;
    }

    public void setQueEnviou(Long queEnviou) {
        this.queEnviou = queEnviou;
    }

    public Long getQueRecebeu() {
        return queRecebeu;
    }

    public void setQueRecebeu(Long queRecebeu) {
        this.queRecebeu = queRecebeu;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
