



package com.example.Libreria.Entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the autores database table.
 * 
 */
@Entity
@Table(name="autores")
@NamedQuery(name="Autor.findAll", query="SELECT a FROM Autor a")
public class Autor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	private String name;

	private String username;

	//bi-directional many-to-one association to Libro
	@OneToMany(mappedBy="autor")
	private List<Libro> libros;

	public Autor() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Libro> getLibros() {
		return this.libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public Libro addLibro(Libro libro) {
		getLibros().add(libro);
		libro.setAutor(this);

		return libro;
	}

	public Libro removeLibro(Libro libro) {
		getLibros().remove(libro);
		libro.setAutor(null);

		return libro;
	}

}












/*
 * package com.example.Libreria.Entidades;
 * 
 * import java.util.Date;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.EntityListeners; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.Table;
 * 
 * import org.springframework.data.annotation.CreatedDate; import
 * org.springframework.data.jpa.domain.support.AuditingEntityListener;
 * 
 * @Entity
 * 
 * @Table(name = "autores")
 * 
 * @EntityListeners(AuditingEntityListener.class)
 * 
 * public class AutoresEntidad {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id; private
 * String name;
 * 
 * @Column(name = "username") private String userName;
 * 
 * 
 * 
 * public AutoresEntidad() {
 * 
 * }
 * 
 * public AutoresEntidad(Long id, String name, String userName) { this.id = id;
 * this.name = name; this.userName = userName;
 * 
 * }
 * 
 * public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public String getUserName() { return userName; }
 * 
 * public void setUserName(String userName) { this.userName = userName; }
 * 
 * 
 * 
 * @Override public String toString() { return "Autores [id=" + id + ", name=" +
 * name + ", userName=" + userName + ",]"; }
 * 
 * }
 * 
 */