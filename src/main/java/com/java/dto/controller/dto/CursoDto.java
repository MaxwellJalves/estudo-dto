package com.java.dto.controller.dto;

import com.java.dto.entities.Curso;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CursoDto {
    private Long id;
    private String descricao;

    public CursoDto(Curso c){
        this.id = c.getId();
        this.descricao = c.getDescricao();
    }

}
