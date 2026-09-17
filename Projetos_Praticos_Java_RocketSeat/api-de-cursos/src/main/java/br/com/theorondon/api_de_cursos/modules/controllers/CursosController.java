package br.com.theorondon.api_de_cursos.modules.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.theorondon.api_de_cursos.modules.CursosEntity;
import br.com.theorondon.api_de_cursos.modules.repositories.CursosRepository;
import jakarta.validation.Valid;

@RestController 
@RequestMapping("/cursos")
public class CursosController {
    
    @Autowired 
    private CursosRepository cursosRepository; 

    @PostMapping 
    public ResponseEntity<CursosEntity> create(@Valid @RequestBody CursosEntity curso) {
        var cursoCriado = this.cursosRepository.save(curso);
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoCriado);
    }


}
