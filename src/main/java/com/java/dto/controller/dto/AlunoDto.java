package com.java.dto.controller.dto;

import com.java.dto.entities.Aluno;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
public class AlunoDto {

    private Long id;
    private String nome;
    private String sexo;

    public AlunoDto (Aluno a){
        this.id = a.getId();
        this.nome = a.getNome();
        this.sexo = a.getSexo();
    }

    public AlunoDto(String nome, String sexo){}

    public static List<AlunoDto> convert(List<Aluno> list){
        return list.stream().map(AlunoDto::new).collect(Collectors.toList());
    }
    public static AlunoDto convertDto(Aluno a){
        return new AlunoDto(a.getNome(),a.getSexo());
    }



}
