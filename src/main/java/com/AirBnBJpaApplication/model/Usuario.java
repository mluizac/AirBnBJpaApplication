package com.AirBnBJpaApplication.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Setter
@Getter
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "O nome é obrigatorio")
    @Pattern(regexp="[a-zA-Z]*", message = "O nome só aceita letras")
    private String user;

    private String senha;

    private TipoUsuario tipoUsuario; //Locador e Locatario

    public Usuario(){};

    public Usuario(Long id, String user, String senha, TipoUsuario tipoUsuario) {
        this.id = id;
        this.user = user;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }
}
