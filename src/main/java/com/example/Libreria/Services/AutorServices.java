package com.example.Libreria.Services;



import org.springframework.beans.factory.annotation.Autowired;
import
org.springframework.stereotype.Service;

import com.example.Libreria.CrudRepository.AutorCrudRepository;
import com.example.Libreria.Entidades.Autor;

import lombok.Data;




@Data

@Service public class AutorServices {

@Autowired private AutorCrudRepository autorCRUDRepository;

public Iterable<Autor> findAll() {
	return  autorCRUDRepository.findAll(); }



}
