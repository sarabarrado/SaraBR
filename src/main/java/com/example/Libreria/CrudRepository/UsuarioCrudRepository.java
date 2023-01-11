package com.example.Libreria.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Libreria.Entidades.Autor;
import com.example.Libreria.Entidades.Usuario;


@Repository
public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer>{
	
	List<Usuario> findByName(@Param("name") String name);
	
	/* Optional<Usuario> findById(@Param("id")Integer id); */


	
	
	
}


