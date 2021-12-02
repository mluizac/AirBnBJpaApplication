package com.AirBnBJpaApplication.repository;

import com.AirBnBJpaApplication.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
