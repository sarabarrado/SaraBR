package com.example.Libreria.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Libreria.Beans.Login;
import com.example.Libreria.CrudRepository.UsuarioCrudRepository;
import com.example.Libreria.Dto.UserDTO;
import com.example.Libreria.Entidades.Usuario;
import com.example.Libreria.Security.AuthenticationRequest;
import com.example.Libreria.Security.JwtUtil;
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
	
	@PostMapping("/usuarios")
	@CrossOrigin(origins = "*")
	public Usuario grabarUsuario(@RequestBody Usuario usuario) {
		return getUsuarioServices().grabaUsuario(usuario);
		
	}
	

	
	
	@Autowired
	private UsuarioCrudRepository usuariosCRUDRepository;

	@CrossOrigin(origins = "*")
	@PostMapping(value = "/login")
	public UserDTO verLogin(@RequestBody Login login) {
		UserDTO salida = new UserDTO();
		Usuario usuario = getUsuariosCRUDRepository().findByName(login.getEmail());
		
			try {
				BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(5);
				if (encoder.matches(login.getClave(), usuario.getPassword())) {
					salida.setMail(usuario.getMail());
					/*Set<Rol> roles = new HashSet<>();
					roles.add(usuario.getRol());
					salida.setRoles(roles);
					salida.setToken(getToken(usuario.getUsuario(), roles));
					salida.setId(usuario.getEmployee().getId());*/
					 String jwt;
					//try {
					//	jwt = JwtUtil.generateToken(login.getEmail());
					//} catch (Exception e) {
						// TODO Auto-generated catch block
				//		e.printStackTrace();
				//	}
				//        return jwt;

				}
			} catch (Exception e) {
				
			}
		

		return salida;

	}
	/*@PostMapping(value = {"/authenticate","/login"})
	public Object loginUser(@RequestParam String username, @RequestParam String password)
	{
	   Authentication authentication=authenticationManager.authenticate( new UsernamePasswordAuthenticationToken(username, password));
	   
	return mapUserAndReturnJwtToken(authentication,true);
	}*/

}