package com.example.Libreria.Dto;

import lombok.Data;

@Data
public class UserDTO {
	private String password;
	private String mail;
	private String name;
	private int libro_id;
}
