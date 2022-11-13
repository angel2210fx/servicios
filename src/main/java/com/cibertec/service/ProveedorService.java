package com.cibertec.service;

import java.util.List;

import com.cibertec.entity.Proveedor;

public interface ProveedorService {

	public abstract List<Proveedor> listaProveedor(); 
	public abstract Proveedor insertaActualizaProveedor(Proveedor obj);	
	
	public abstract List<Proveedor> listaProveedorPorRazonRucEstadoPais(String razonsocial, String ruc, int estado, int idPais);
	
}
