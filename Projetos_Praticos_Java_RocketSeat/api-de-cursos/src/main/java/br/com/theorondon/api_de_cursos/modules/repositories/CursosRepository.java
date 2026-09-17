package br.com.theorondon.api_de_cursos.modules.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.theorondon.api_de_cursos.modules.CursosEntity;

public interface CursosRepository extends JpaRepository<CursosEntity, UUID>{
    
}
