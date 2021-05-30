package com.java.dto.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor

public class Aluno {
    private long codigo;

    private String nome;
    private String sexo;
    private BigDecimal saldo ;

    public Aluno(String nome, String sexo, BigDecimal saldo) {
        this.nome = nome;
        this.sexo = sexo;
        this.saldo = saldo;
    }
}
