package com.java.dto.controller.dto;

import com.java.dto.entities.Aluno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class AlunoDto {
    private String nome;
    private String sexo;
    public AlunoDto (Aluno a){
        this.nome = a.getNome();
        this.sexo = a.getSexo();
    }
    public static List<AlunoDto> convert(List<Aluno> list){
        return list.stream().map(AlunoDto::new).collect(Collectors.toList());
    }
}
