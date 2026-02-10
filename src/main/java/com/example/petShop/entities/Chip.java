package com.example.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Chip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int codigo;
	private String localColocado;
	private String status;
	
	public Chip() {
		
	}
	
	public Chip(int codigo, String localColocado, String status) {
		this.codigo = codigo;
		this.localColocado = localColocado;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getLocalColocado() {
		return localColocado;
	}

	public String getStatus() {
		return status;
	}
	
	
}
