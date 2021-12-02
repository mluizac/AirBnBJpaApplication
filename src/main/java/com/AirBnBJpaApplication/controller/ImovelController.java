package com.AirBnBJpaApplication.controller;

import com.AirBnBJpaApplication.model.Imovel;
import com.AirBnBJpaApplication.model.TipoImovel;
import com.AirBnBJpaApplication.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    //salva
    @PostMapping
    public ResponseEntity save(@RequestBody Imovel imovel){
        return imovelService.save(imovel);
    }

    //busca todos
    @GetMapping
    public Iterable<Imovel> getAll(){
        return imovelService.getAll();
    }

    //busca pelo tipo
    //http://localhost:8080/imoveis/tipo?tipoImovel=CASA
    @GetMapping("/tipo")
    public List<Imovel> getByTipoImovel(@RequestParam TipoImovel tipoImovel){
        return imovelService.getByTipoImovel(tipoImovel);
    }
}
