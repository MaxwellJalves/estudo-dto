package com.java.dto.service;

import com.java.dto.entities.Curso;
import com.java.dto.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;


    public void save(Curso c) {
        cursoRepository.save(c);
    }
}
