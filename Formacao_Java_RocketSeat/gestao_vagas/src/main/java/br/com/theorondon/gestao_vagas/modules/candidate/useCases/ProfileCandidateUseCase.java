package br.com.theorondon.gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.theorondon.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.theorondon.gestao_vagas.modules.candidate.dto.ProfileCandidateResponseDTO;

@Service
public class ProfileCandidateUseCase {
 
    @Autowired 
    private CandidateRepository candidateRepository;

    public ProfileCandidateResponseDTO execute(UUID idCandidato) {
        var candidate = this.candidateRepository.findById(idCandidato)
        .orElseThrow(() -> {
            throw new UsernameNotFoundException("User not found");
        });

        var candidateDTO = ProfileCandidateResponseDTO.builder()
                .id(candidate.getId())
                .name(candidate.getName())
                .username(candidate.getUsername())
                .email(candidate.getEmail())
                .description(candidate.getDescription())
                .build();
                
        return candidateDTO;
    }
}
