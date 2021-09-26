package com.wd.projeto01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wd.projeto01.entities.Vendedor;
import com.wd.projeto01.repositories.VendedorRepository;

@Service
public class VendedorService {
	
	@Autowired
	private VendedorRepository repoVendedor;
	
	public List<Vendedor> findAll(){
		return repoVendedor.findAll();
	}
	
	public void Lascou() {
		
	}
}
