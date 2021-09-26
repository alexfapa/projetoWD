package com.wd.projeto01.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wd.projeto01.dto.VendedorDto;
import com.wd.projeto01.services.VendedorService;

@RestController
@RequestMapping(value="/vendedores")
public class VendedorController {

	@Autowired
	private VendedorService servVendedor;
	
	@GetMapping
	public ResponseEntity<List<VendedorDto>> listarVendedores() {
		List<VendedorDto> listaVendedores = servVendedor.findAll().stream().map(x -> new VendedorDto(x.getNome())).collect(Collectors.toList());		
		
		return ResponseEntity.ok(listaVendedores);
	}
}
