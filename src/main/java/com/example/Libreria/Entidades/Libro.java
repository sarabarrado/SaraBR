
		package com.example.Libreria.Entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the libros database table.
 * 
 */
@Data
@NoArgsConstructor
@Entity
@Table(name= "libros")
@NamedQuery(name="Libro.findAll", query="SELECT l FROM Libro l")
public class Libro {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int anio;

	@Column(name="genero_literario")
	private String generoLiterario;

	private int precio;

	private String titulo;

	//bi-directional many-to-one association to Autore
	@ManyToOne
	@JoinColumn(name="autor_id")
	private Autor autor;


	


	

}