package com.java.dto.entities;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Aluno {
    private long codigo;
    private String nome;
    private String sexo;
    private BigDecimal saldo ;

    public Aluno(long codigo,String nome, String sexo, BigDecimal saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.saldo = saldo;
    }

}
