package com.java.dto.controller;

import com.java.dto.controller.dto.AlunoDto;
import com.java.dto.controller.dto.AlunoFormDto;
import com.java.dto.entities.Aluno;
import com.java.dto.repository.AlunoRepository;
import com.java.dto.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("alunos")

public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<AlunoDto> listartodos(){
        return AlunoDto.convert(alunoService.findAll());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @Transactional
    public ResponseEntity<AlunoDto> salvar(@RequestBody AlunoFormDto alunoForm, UriComponentsBuilder uriBuilder){
        Aluno a = alunoForm.converEntityAluno(alunoForm);
        alunoService.save(a);
        return ResponseEntity.created(uriBuilder.path("/alunos/{id}")
                .buildAndExpand(a.getId())
                .toUri())
                .body(new AlunoDto(a));
    }



}
