package com.java.dto.controller;

import com.java.dto.controller.dto.AlunoDto;
import com.java.dto.controller.dto.AlunoFormDto;
import com.java.dto.controller.dto.AlunoFormResponse;
import com.java.dto.entities.Aluno;
import org.apache.coyote.Response;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("alunos")

public class AlunoController {

    public static  List<Aluno> alunos = new ArrayList<>();

    static{
        alunos.add(new Aluno(1,"Maxwell",  "Masculino",new BigDecimal(200)));
        alunos.add(new Aluno(2,"Beatriz",  "Feminino" ,new BigDecimal(800)));
        alunos.add(new Aluno(3,"Sophia" ,  "Feminino" ,new BigDecimal(150)));
        alunos.add(new Aluno(4,"Jose"   ,  "Masculino",new BigDecimal(200)));
        System.out.println("===BLOCO CRIADO PARA POPULAR A LISTA E SIMULAR UM DB");
    }

    @GetMapping
    public List<AlunoDto> getAlunosDto(){
        return AlunoDto.convert(alunos);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @Transactional
    public AlunoDto save(@RequestBody AlunoFormDto postAluno){
               alunos.add(postAluno.converEntityAluno(postAluno));
        return AlunoDto.convertDto(postAluno); //retorna null pois os dados não estão sendo persistidos no banco de dados no momento
    //        System.out.println(postAluno.converEntityAluno(postAluno));
    }



}
