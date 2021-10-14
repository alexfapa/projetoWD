package com.wd.projeto01.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wd.projeto01.entities.Vendas;
import com.wd.projeto01.repositories.VendasRepository;

@Service
public class VendasService {

	@Autowired
	private VendasRepository vendasRepositoy;
	
	public List<Vendas> findAll() {		
		return vendasRepositoy.findAll();
	}

}
