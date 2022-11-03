package com.example.Libreria.Entidades;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "autores")
@EntityListeners(AuditingEntityListener.class)

public class LibrosEntidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String autor;
	private int isbn;
	private int precio;
	private String genero_literario;
	private GregorianCalendar year;
	
	
	
	
	
	
}
