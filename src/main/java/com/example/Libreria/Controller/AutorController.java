package com.example.Libreria.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Libreria.CrudRepository.AutorCrudRepository;
import com.example.Libreria.Entidades.Autor;

@RestController
@RequestMapping("/api")
public class AutorController {

	@Autowired
	private AutorCrudRepository repository;
	@CrossOrigin(origins = "*")
	@GetMapping("/autores")
	public Iterable<Autor> allAutores() {
		return repository.findAll();
	}
	@CrossOrigin(origins = "*")
	@GetMapping("/autores/{name}")
	public List<Autor> findByName(@PathVariable("name") String name) {
		return repository.findByName(name);
	}
	@CrossOrigin(origins = "*")
	@PostMapping("/autores")
	public Autor createPerson(@RequestBody Autor autores) {
		return repository.save(autores);
	}
	@CrossOrigin(origins = "*")
	@PutMapping("/autores/{id}")
	public Autor updateAutores(@PathVariable int id, @RequestBody Autor autores) {
		return repository.save(autores);
	}
	@CrossOrigin(origins = "*")
	@DeleteMapping("/autores/{id}")
	public void deleteAutores(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
}
