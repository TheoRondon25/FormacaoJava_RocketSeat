package br.com.theorondon.api_de_cursos.modules;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data 
@Entity(name = "cursos")
public class CursosEntity {

    @Id 
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;    

    @NotBlank(message = "O campo [name] não pode estar em branco")
    private String name;    
    
    @NotBlank(message = "O campo [category] não pode estar em branco")
    private String category;
        
    private String professor;
    
    private boolean active = true;

    @CreationTimestamp 
    private LocalDateTime createdAt;

    @UpdateTimestamp 
    private LocalDateTime updatedAt;
}
