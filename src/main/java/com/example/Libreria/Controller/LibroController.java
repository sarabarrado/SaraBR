package com.example.Libreria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Libreria.CrudRepository.AutorCrudRepository;
import com.example.Libreria.CrudRepository.LibroCrudRepository;
import com.example.Libreria.Entidades.Autor;
import com.example.Libreria.Entidades.Libro;
import com.example.Libreria.Services.LibroServices;

import lombok.Data;

@Data
@RestController
@RequestMapping("/api")
public class LibroController {

	@Autowired
	private LibroServices libroServices;
	@CrossOrigin(origins = "*")
	@GetMapping("/libros")
	public Iterable<Libro> allLibros() {
		return getLibroServices().findAll();
	}
	@CrossOrigin(origins = "*")
	@GetMapping("/libros/{titulo}")
	public List<Libro> alltitulos(@PathVariable String titulo) {
		return getLibroServices().findbyTitulo(titulo);
	}

}