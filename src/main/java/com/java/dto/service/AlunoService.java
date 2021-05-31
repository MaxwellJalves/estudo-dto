package com.java.dto.service;

import com.java.dto.controller.dto.AlunoDto;
import com.java.dto.entities.Aluno;
import com.java.dto.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> findAll() {
        return  alunoRepository.findAll();
    }

    public AlunoDto save(Aluno aluno) {
         alunoRepository.save(aluno);
        return AlunoDto.convertDto(aluno);
    }

    public Object findById(long codigo) {
       return   alunoRepository.findById(codigo);
    }
}
