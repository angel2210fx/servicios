package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Libro;
import com.cibertec.repository.LibroRepository;

@Service
public class LibroServiceImp implements LibroService{
	
	@Autowired LibroRepository repository;
	

	@Override
	public List<Libro> ListarLibro() {
		return repository.findAll();
	}

	@Override
	public void EliminarLibro(int idLibro) {
		repository.deleteById(idLibro);
		
	}

	@Override
	public Optional<Libro> BuscaLibro(int idLibro) {
		
		return repository.findById(idLibro);
	}

	@Override
	public Libro InsertarActualizarLibro(Libro obj) {
		
		return repository.save(obj);
	}

	@Override
	public List<Libro> listaLibroconParametros(String titulo, String serie, int estado, int idCategoria) {
		// TODO Auto-generated method stub
		return repository.listaLibroconParametros(titulo, serie, estado, idCategoria);
	}
	
	

}
