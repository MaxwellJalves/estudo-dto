package com.java.dto.controller.dto;

import com.java.dto.entities.Aluno;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class AlunoFormDto {

    private long codigo;
    private String nome;
    private String sexo;
    private BigDecimal saldo ;

    public Aluno converEntityAluno(AlunoFormDto alunoFormDto) {
        return new Aluno(codigo,nome,sexo,saldo);
    }
}
