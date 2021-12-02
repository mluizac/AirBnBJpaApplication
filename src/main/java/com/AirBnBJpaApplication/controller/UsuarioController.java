package com.AirBnBJpaApplication.controller;

import com.AirBnBJpaApplication.model.Usuario;
import com.AirBnBJpaApplication.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired UsuarioService usuarioService;

    //salva
    @PostMapping
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    //busca todos
    @GetMapping
    public Iterable<Usuario> getAll(){
        return usuarioService.getAll();
    }

    //busca pelo id
    @GetMapping("/{id}")
    public Optional<Usuario> getId(@PathVariable(required=true) long id){
        return usuarioService.getId(id);
    }


}
