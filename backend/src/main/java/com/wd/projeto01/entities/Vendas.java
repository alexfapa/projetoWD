package com.wd.projeto01.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_venda")
public class Vendas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visitas;
	private Integer qtdVendas;
	private Double valor;
	private LocalDate data;
	
	@ManyToOne
	@JoinColumn(name = "vendedor_id")
	private Vendedor vendedor;
	
	
	public Vendas() {}


	public Vendas(Long id, Integer visitas, Integer qtdVendas, Double valor, LocalDate data) {
		super();
		this.id = id;
		this.visitas = visitas;
		this.qtdVendas = qtdVendas;
		this.valor = valor;
		this.data = data;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getVisitas() {
		return visitas;
	}


	public void setVisitas(Integer visitas) {
		this.visitas = visitas;
	}


	public Integer getQtdVendas() {
		return qtdVendas;
	}


	public void setQtdVendas(Integer qtdVendas) {
		this.qtdVendas = qtdVendas;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}
		
	
}
