
package com.example.Libreria.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The persistent class for the libros database table.
 * 
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "libros")
@NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l")
public class Libro {

	@Id
	private int id;

	private int anio;

	@Column(name = "genero")
	private String genero;

	private int precio;

	private String titulo;

	@ManyToOne
	@JoinColumn(name = "autor_id")
	private Autor autor;

}