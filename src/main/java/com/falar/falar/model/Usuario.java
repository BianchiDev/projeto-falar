package com.falar.falar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NotNull
    @Size(min = 10, max = 200, message = "O nome deve ter entre 10 e 200 caracteres.")
    private String nome;

    private String email;

    @NotNull
    @Size(min = 3, max = 18, message = "A Senha deve ter no mínimo 3 caracteres e no máximo 18 caracteres.")
    private String senha;

    // @NotNull
    private Integer idade;

}
