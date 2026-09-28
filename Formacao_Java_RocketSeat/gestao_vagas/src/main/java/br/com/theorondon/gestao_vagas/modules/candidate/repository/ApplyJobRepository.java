package br.com.theorondon.gestao_vagas.modules.candidate.repository;

import java.util.UUID;

import br.com.theorondon.gestao_vagas.modules.candidate.entity.ApplyJobEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplyJobRepository extends JpaRepository<ApplyJobEntity, UUID>{
    
}
