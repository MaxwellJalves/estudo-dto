package com.java.dto.controller;

import com.java.dto.controller.dto.CursoDto;
import com.java.dto.controller.dto.CursoRequest;
import com.java.dto.entities.Curso;
import com.java.dto.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController @RequestMapping("cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public void getCursos(){
    //Implementar
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CursoDto> insertCurso(@RequestBody CursoRequest curso, UriComponentsBuilder uriBuilder){
        Curso c = curso.convert(curso);
        //salvar dados
        cursoService.save(c);
        URI uri = uriBuilder.path("/cursos/{id}").buildAndExpand(curso.getId()).toUri();
        return ResponseEntity.created(uri).body(new CursoDto(c));
    }
}
