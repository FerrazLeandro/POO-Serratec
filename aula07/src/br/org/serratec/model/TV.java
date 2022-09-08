package br.org.serratec.model;

import br.org.serratec.enuns.MarcaTV;

public class TV {
	private String modelo;
	private Integer tamanho;
	private MarcaTV marca;

	public TV(String modelo, Integer tamanho, MarcaTV marca) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "TV [modelo=" + modelo + ", tamanho=" + tamanho + ", marca=" + marca + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public MarcaTV getMarca() {
		return marca;
	}

}
