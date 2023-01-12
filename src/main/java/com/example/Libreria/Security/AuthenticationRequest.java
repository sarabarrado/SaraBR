package com.example.Libreria.Security;

import com.example.Libreria.Entidades.Usuario;

public class AuthenticationRequest {
    private String username;
    private String password;
    
    private Usuario usuario;

    public AuthenticationRequest(String username, String password) {
    	
        username = usuario.getMail();
        password = usuario.getPassword();
        System.out.println(username + password);
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}