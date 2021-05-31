package com.java.dto.controller.dto;

import com.java.dto.entities.Curso;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CursoRequest {
    private Long id;
    private String descricao;

    public Curso convert(CursoRequest curso) {
        return  new Curso(curso.getId(),curso.getDescricao());
    }
}
