package com.example.Libreria.CrudRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Libreria.Entidades.Autor;


@Repository
public interface LibreriaCrudRepository extends CrudRepository<Autor, Long>{
	
	List<Autor> findByName(@Param("name") String name);
	
 Optional<Autor> findById(long id);
	
}


