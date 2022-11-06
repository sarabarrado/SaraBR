package com.example.Libreria.CrudRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Libreria.Entidades.Libro;


@Repository
public interface LibroCrudRepository extends CrudRepository<Libro, Long>{
	
	List<Libro> findByName(@Param("name") String name);
	
	
}


