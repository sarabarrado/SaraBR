package com.example.Libreria.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Libreria.CrudRepository.LibreriaCrudRepository;
import com.example.Libreria.Entidades.AutoresEntidad;

@RestController
@RequestMapping("/api")
public class LibreriaController {
	
	@Autowired
	private LibreriaCrudRepository repository;
	
	
	
	  @GetMapping("/autores") public Optional<AutoresEntidad> allAutores(){ 
		  return  repository.findById(1);
		  }
	 
	 
	
	@GetMapping("/autores/{name}")
	public List<AutoresEntidad> findByName(@PathVariable("name") String name) {
		return repository.findByName(name);
	}
	
	@PostMapping("/autores")
	public AutoresEntidad createPerson(@RequestBody AutoresEntidad autores) {
		return repository.save(autores);
	}
	
	@PutMapping("/autores/{id}")
	public AutoresEntidad updateAutores(@PathVariable int id ,@RequestBody AutoresEntidad autores) {
		return repository.save(autores);
	}
	
	@DeleteMapping("/autores/{id}")
	public void deleteAutores(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
}



