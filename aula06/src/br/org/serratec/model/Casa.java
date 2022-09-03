package br.org.serratec.model;

public class Casa extends Imovel {
	private Boolean garagem;

	public Casa(String local, Double valor, Boolean garagem) {
		super(local, valor);
		this.garagem = garagem;
	}
	
	

	@Override
	public String toString() {
		return super.toString() + "Tipo: Casa " + (garagem ? "Tem garagem " : "Não tem garagem ");
	}



	public Boolean getGaragem() {
		return garagem;
	}
	
	
}
