package org.br.serratec.model;

public class Anestesista extends Medico {
	private String tipoAnestesista;

	public Anestesista(String empresa, Integer crm, String nome,
			String tipoAnestesista) {
		super(empresa, crm, nome);
		this.tipoAnestesista = tipoAnestesista;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Tipo Anestesia: " + tipoAnestesista + " || ";
	}

	public String getTipoAnestesista() {
		return tipoAnestesista;
	}
	
	@Override
	public Double calcularConsulta() {
		return valorPago = super.calcularConsulta() + 1000;
	}
}
