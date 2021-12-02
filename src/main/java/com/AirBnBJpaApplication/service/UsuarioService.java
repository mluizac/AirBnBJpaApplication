package com.AirBnBJpaApplication.service;

import com.AirBnBJpaApplication.model.Usuario;
import com.AirBnBJpaApplication.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@RequiredArgsConstructor
@Component
public class UsuarioService {

    @Autowired private UsuarioRepository usuarioRepository;

    //salva
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    //busca todos
    public Iterable<Usuario> getAll(){
        return usuarioRepository.findAll();
    }

    //busca pelo id
    public Optional<Usuario> getId(long id){
        return usuarioRepository.findById(id);
    }

}
