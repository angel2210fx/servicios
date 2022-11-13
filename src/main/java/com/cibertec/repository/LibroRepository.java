package com.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{
	
	@Query("select x from Libro x where (?1 is '' or x.titulo like ?1) and (?2 is '' or x.serie = ?2) "

			+ "and x.estado = ?3 "

			+ "and (?4 is -1 or x.categoria.idCategoria = ?4)")
	public List<Libro> listaLibroconParametros(String titulo, String serie,  int estado, int idCategoria);

}
