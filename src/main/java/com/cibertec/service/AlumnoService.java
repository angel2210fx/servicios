package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Alumno;

public interface AlumnoService {
	
	public abstract Alumno insertarAlumno(Alumno obj);
	
	public abstract List<Alumno> listaTodos();
	
	public abstract List<Alumno> listaAlumnoDni(String dni);

	public List<Alumno> listaAlumnoDniEstadoIdPais(String nombre, String apellido, String dni,  int estado, int idPais);
	
}
