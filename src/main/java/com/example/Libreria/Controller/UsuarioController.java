package com.example.Libreria.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Libreria.CrudRepository.UsuarioCrudRepository;
import com.example.Libreria.Entidades.Usuario;
import com.example.Libreria.Services.UsuarioServices;

import lombok.Data;

@RestController
@Data
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private UsuarioServices usuarioServices;
	@CrossOrigin(origins = "*")
	@GetMapping("/usuarios")
	public Iterable<Usuario> allUsuarios() {
		return getUsuarioServices().findAll();
	}

}