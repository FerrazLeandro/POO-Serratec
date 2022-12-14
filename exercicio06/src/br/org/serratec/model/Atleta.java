package br.org.serratec.model;

public class Atleta implements Olimpiadas{
	private String nome;
	private Double peso;
	private String modalidade;
	private Integer totalParticipantes = 0;
	private Pais pais;

	public Atleta(String nome, Double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
	}
	
	public Double getPeso() {
		return peso;
	}

	public Pais getPais() {
		return pais;
	}

	public String getNome() {
		return nome;
	}

	public Double getpeso() {
		return peso;
	}

	public String getModalidade() {
		if (peso > 90) {
			return modalidade = "Peso pesado";
		} else {
			return modalidade = "Peso médio";
		}
	}

	public Integer getTotalParticipantes() {
		return totalParticipantes;
	}
	
	public void adicionarAtletas(Atleta atleta) {
		if (atleta.verificaSituacao() == "Participará") {
			totalParticipantes = totalParticipantes + 1;
		}
	}

	@Override
	public String verificaSituacao() {
		return (peso > 60 ? "Participará" : "Não participará");
	}
	
	

}
