package com.example.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tutor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String dataNasc;
	
	public Tutor() {
		
	}
	public Tutor(String nome, String dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}

}
