package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Sala;

public interface SalaService {

	
	public Sala InsertaSala(Sala obj);
	public List<Sala> ListaSala();
	public List<Sala> listaSalapornumeroAlumnosSede(String numero, int numAlumnos, int idSede, int estado);
}
