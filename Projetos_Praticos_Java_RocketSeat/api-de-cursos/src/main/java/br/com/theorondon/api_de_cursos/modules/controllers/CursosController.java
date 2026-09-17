package br.com.theorondon.api_de_cursos.modules.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping
    public ResponseEntity<List<CursosEntity>> list(
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String category) {

        var cursos = this.cursosRepository.findByFilters(name, category);
        return ResponseEntity.ok(cursos);
    }

}
