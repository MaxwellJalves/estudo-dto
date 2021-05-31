package com.java.dto.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Curso {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String descricao; //analise e desenvolvimento
    @ManyToMany
    private List<Aluno> alunosList;      //aluno 1

    public Curso(Long id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }
}
