package br.com.theorondon.api_de_cursos.modules.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping("/{id}")
    public ResponseEntity<CursosEntity> update(
        @PathVariable UUID id,
        @Valid @RequestBody CursosEntity cursoAtualizado) {
        
            var cursoExistente = this.cursosRepository.findById(id);

            if(cursoExistente.isEmpty()) {
                return ResponseEntity.notFound().build();
            }

            var curso = cursoExistente.get();
            curso.setName(cursoAtualizado.getName());
            curso.setCategory(cursoAtualizado.getCategory());

            var cursoSalvo = this.cursosRepository.save(curso);
            return ResponseEntity.ok(cursoSalvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {

        if (!this.cursosRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        
        this.cursosRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }    

}
