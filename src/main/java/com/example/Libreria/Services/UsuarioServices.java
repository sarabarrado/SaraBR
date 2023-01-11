package com.example.Libreria.Services;



import org.springframework.beans.factory.annotation.Autowired;
import
org.springframework.stereotype.Service;

import com.example.Libreria.CrudRepository.UsuarioCrudRepository;
import com.example.Libreria.Entidades.Usuario;

import lombok.Data;




@Data

@Service public class UsuarioServices {

@Autowired private UsuarioCrudRepository usuarioCrudRepository;

public Iterable<Usuario> findAll() {
	return  usuarioCrudRepository.findAll(); }

public Usuario grabaUsuario(Usuario usuario) {
	return getUsuarioCrudRepository().save(usuario);
}







}
