package br.org.serratec.model;

public class Endereco {
	private String rua;
	private String bairro;
	private String cep;
	private Cidade cidade;

	public Endereco(String rua, String bairro, String cep, Cidade cidade) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return "Rua: " + rua + " " + bairro + " " + cidade + " " + cidade.getEstado();
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCep() {
		return cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

}
