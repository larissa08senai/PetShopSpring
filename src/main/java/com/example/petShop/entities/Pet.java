package com.example.petShop.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity

public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double tamanho;
	private String dataNasc;
	
	public Pet() {
		
	}
	public Pet(String nome, double tamanho, String dataNasc) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.dataNasc = dataNasc;
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public double getTamanho() {
		return tamanho;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	
	


}
