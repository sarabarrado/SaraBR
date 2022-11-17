package com.example.Libreria.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Libreria.CrudRepository.LibroCrudRepository;
import com.example.Libreria.Entidades.Libro;

import lombok.Data;

@Data

@Service
public class LibroServices {

	@Autowired
	private LibroCrudRepository libroCrudRepository;

	public Iterable<Libro> findAll() {
		return libroCrudRepository.findAll();
	}
	
	public List<Libro> findbyTitulo(String titulo){
		return libroCrudRepository.findByTitulo(titulo);
	}
}
