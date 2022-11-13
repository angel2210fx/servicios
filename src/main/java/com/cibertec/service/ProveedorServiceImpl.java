package com.cibertec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Proveedor;
import com.cibertec.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	private ProveedorRepository repoProveedor;
	
	@Override
	public Proveedor insertaActualizaProveedor(Proveedor obj) {		
		return repoProveedor.save(obj);
	}
	
	@Override
	public List<Proveedor> listaProveedor() {
		return repoProveedor.findAll();	
	}

	@Override
	public List<Proveedor> listaProveedorPorRazonRucEstadoPais(String razonsocial, String ruc, int estado, int idPais) {
		return repoProveedor.listaProveedorPorRazonRucEstadoPais(razonsocial, ruc, estado, idPais);
	}
}
