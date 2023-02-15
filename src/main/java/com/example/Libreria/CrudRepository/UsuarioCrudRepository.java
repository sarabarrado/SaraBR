package com.example.Libreria.CrudRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Libreria.Entidades.Usuario;


@Repository
public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer>{
	
	 public Usuario findByName(String name);
	/* Optional<Usuario> findById(@Param("id")Integer id); */


	
	
	
}


