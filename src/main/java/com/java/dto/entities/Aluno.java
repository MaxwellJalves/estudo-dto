package com.java.dto.entities;

import com.java.dto.controller.dto.AlunoFormDto;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sexo;
    private BigDecimal saldo ;
    @OneToOne
    private Curso curso;

    public Aluno(String nome, String sexo, BigDecimal saldo) {
        this.nome = nome;
        this.sexo = sexo;
        this.saldo = saldo;
    }

    public Aluno( String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
}
