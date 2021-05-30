package com.java.dto.controller;

import com.java.dto.controller.dto.AlunoDto;
import com.java.dto.entities.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController

public class AlunoController {

    @GetMapping
    @RequestMapping("alunos")
    public List<Aluno> getAlunos(){
        List<Aluno> aluno = new ArrayList<>();
        aluno.add(new Aluno("Maxwell",  "Masculino",new BigDecimal(200)));
        aluno.add(new Aluno("Beatriz",  "Feminino" ,new BigDecimal(800)));
        aluno.add(new Aluno("Sophia" ,  "Feminino" ,new BigDecimal(150)));
        aluno.add(new Aluno("Jose"   ,  "Masculino",new BigDecimal(200)));
        return aluno;
    }
    @GetMapping
    @RequestMapping("alunosDto")
    public List<AlunoDto> getAlunosDto(){
        List<Aluno> aluno = new ArrayList<>();
        aluno.add(new Aluno("Maxwell",  "Masculino",new BigDecimal(200)));
        aluno.add(new Aluno("Beatriz",  "Feminino" ,new BigDecimal(800)));
        aluno.add(new Aluno("Sophia" ,  "Feminino" ,new BigDecimal(150)));
        aluno.add(new Aluno("Jose"   ,  "Masculino",new BigDecimal(200)));
        return AlunoDto.convert(aluno);
    }



}
