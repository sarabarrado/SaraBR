package com.example.Libreria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Libreria.CrudRepository.AutorCrudRepository;
import com.example.Libreria.Entidades.Autor;
import com.example.Libreria.Entidades.Libro;

@RestController
@RequestMapping("/api")
public class LibroController {



	
	@Autowired
	private AutorCrudRepository repository;
	
	
	
	  @GetMapping("/libros") public Iterable<Autor> allLibros(){ 
		  return  repository.findAll();
		  }
	 
	 


}