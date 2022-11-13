package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Tesis;

public interface TesisService {

	public abstract Tesis insertaActualizaTesis(Tesis obj);
	public abstract List<Tesis> listaTesis();
	public abstract List<Tesis> listaTesisPorTituloEstadoAlumnoTema(String titulo, int estado, int idAlumno, String tema);
	
}
