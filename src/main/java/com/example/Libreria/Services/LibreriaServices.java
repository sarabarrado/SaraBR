package com.example.Libreria.Services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; import
org.springframework.stereotype.Service;

import com.example.Libreria.CrudRepository.LibreriaCrudRepository;
import com.example.Libreria.Entidades.Autor;

import lombok.Data;




@Data

@Service public class LibreriaServices {

@Autowired private LibreriaCrudRepository autorCRUDRepository;

public List<Autor> findAll() {
	return  (List<Autor>) autorCRUDRepository.findAll(); }



}
