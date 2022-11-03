package com.example.Libreria.CrudRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Libreria.Entidades.AutoresEntidad;


@Repository
public interface LibreriaCrudRepository extends CrudRepository<AutoresEntidad, Long>{
	
	List<AutoresEntidad> findByName(@Param("name") String name);
	
 Optional<AutoresEntidad> findById(long id);
	
}


