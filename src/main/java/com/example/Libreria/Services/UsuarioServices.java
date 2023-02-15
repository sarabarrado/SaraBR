package com.example.Libreria.Services;



import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Libreria.CrudRepository.UsuarioCrudRepository;
import com.example.Libreria.Entidades.Usuario;

import lombok.Data;




@Data

@Service public class UsuarioServices {

@Autowired private UsuarioCrudRepository usuarioCrudRepository;

public Iterable<Usuario> findAll() {
	return  usuarioCrudRepository.findAll(); }

public Usuario grabaUsuario(Usuario usuario) {
	String pass = BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt(10));
	BCrypt.checkpw(usuario.getPassword(), pass);
	usuario.setPassword(pass);
	System.out.println("La contraseña encriptada es esta: " + pass);
	return getUsuarioCrudRepository().save(usuario);
}



}
