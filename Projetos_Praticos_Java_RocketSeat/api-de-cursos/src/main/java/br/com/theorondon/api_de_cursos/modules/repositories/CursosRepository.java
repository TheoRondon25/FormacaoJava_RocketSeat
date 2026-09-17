package br.com.theorondon.api_de_cursos.modules.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.theorondon.api_de_cursos.modules.CursosEntity;

public interface CursosRepository extends JpaRepository<CursosEntity, UUID>{
    
    @Query("SELECT c FROM cursos c " +
           "WHERE (:name IS NULL OR c.name ILIKE %:name%) " +
           "AND (:category IS NULL OR c.category ILIKE %:category%)")
    List<CursosEntity> findByFilters(@Param("name") String name, @Param("category") String category);
}
