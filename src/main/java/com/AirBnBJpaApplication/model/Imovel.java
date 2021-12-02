package com.AirBnBJpaApplication.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cidade;
    private Double aluguelPorDia;
    private TipoImovel tipoImovel; //Apartamento, casa ou quarto
    private boolean disponibilidade;

    public Imovel(){};

    public Imovel(Long id, String cidade, Double aluguelPorDia, TipoImovel tipoImovel, boolean disponibilidade) {
        this.id = id;
        this.cidade = cidade;
        this.aluguelPorDia = aluguelPorDia;
        this.tipoImovel = tipoImovel;
        this.disponibilidade = disponibilidade;
    }
}
