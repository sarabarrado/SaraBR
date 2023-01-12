package com.example.Libreria.Security;
/*import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private JwtUtil jwtUtil;

    public AuthenticationController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthenticationRequest authenticationRequest) {
        //implementar la validacion de usuario y contrasena
        // ...
        // si la autenticacion es valida, generar un token
        String jwt = jwtUtil.generateToken(authenticationRequest.getUsername());
        return jwt;
    }
}

*/