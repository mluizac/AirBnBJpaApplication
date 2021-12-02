package com.AirBnBJpaApplication.repository;

import com.AirBnBJpaApplication.model.Imovel;
import com.AirBnBJpaApplication.model.TipoImovel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImovelRepository extends CrudRepository<Imovel, Long> {

    List<Imovel> findByTipoImovel(TipoImovel tipoImovel);

}
