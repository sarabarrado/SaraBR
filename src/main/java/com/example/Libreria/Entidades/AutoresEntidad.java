package com.example.Libreria.Entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "autores")
@EntityListeners(AuditingEntityListener.class)

public class AutoresEntidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Column(name = "username")
	private String userName;
	
	
	
	public AutoresEntidad() {

	}

	public AutoresEntidad(Long id, String name, String userName) {
		this.id = id;
		this.name = name;
		this.userName = userName;
	
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	@Override
	public String toString() {
		return "Autores [id=" + id + ", name=" + name + ", userName=" + userName + ",]";
	}

}

