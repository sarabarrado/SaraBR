package com.example.Libreria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Libreria.CrudRepository.UsuarioCrudRepository;
import com.example.Libreria.Entidades.Usuario;

@RestController
@RequestMapping("/api")
public class UsuarioController {



	
	@Autowired
	private UsuarioCrudRepository usuarioCrudRepository;
	
	
	
	  @GetMapping("/usuarios") public Iterable<Usuario> allUsuarios(){ 
		  return  usuarioCrudRepository.findAll();
		  }

}