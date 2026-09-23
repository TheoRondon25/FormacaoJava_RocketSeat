package br.com.theorondon.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Builder 
@AllArgsConstructor 
@NoArgsConstructor 
public class ProfileCandidateResponseDTO {
    
    @Schema(example = "Desenvolvedor Java")    
    private String description;

    @Schema(example = "theo")
    private String username;

    @Schema(example = "theo@email.com")
    private String email;
    
    private UUID id;
    
    @Schema(example = "Theo Rondon")
    private String name;
}
