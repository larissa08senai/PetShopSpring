package com.example.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vacinacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int codigo;
	private String validade;
	private String periodo;
	
	public Vacinacao() {
		
	}
	
	public Vacinacao(int codigo, String validade, String periodo) {
		this.codigo = codigo;
		this.validade = validade;
		this.periodo = periodo;
	}

	public Long getId() {
		return id;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getValidade() {
		return validade;
	}

	public String getPeriodo() {
		return periodo;
	}
	
	
}
