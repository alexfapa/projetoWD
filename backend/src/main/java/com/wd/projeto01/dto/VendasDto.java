package com.wd.projeto01.dto;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class VendasDto {
	private Integer id;
	private Integer visitas;
	private Double valor;
	
	public VendasDto() {
		
	}
	public VendasDto(Integer id, Integer visitas, Double valor) {
		super();
		this.id = id;
		this.visitas = visitas;
		this.valor = valor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVisitas() {
		return visitas;
	}
	public void setVisitas(Integer visitas) {
		this.visitas = visitas;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
