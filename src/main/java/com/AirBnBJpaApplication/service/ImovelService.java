package com.AirBnBJpaApplication.service;

import com.AirBnBJpaApplication.model.Imovel;
import com.AirBnBJpaApplication.model.TipoImovel;
import com.AirBnBJpaApplication.repository.ImovelRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    //salva
    public ResponseEntity save(Imovel imovel) {
        imovelRepository.save(imovel);
        return null;
    }

    //busca todos
    public Iterable<Imovel> getAll(){
        return imovelRepository.findAll();
    }

    //busca pelo tipo
    public List<Imovel> getByTipoImovel(TipoImovel tipoImovel){
        return imovelRepository.findByTipoImovel(tipoImovel);
    }
}
