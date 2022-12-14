package org.br.serratec.teste;

import org.br.serratec.control.ControlePagamento;
import org.br.serratec.model.Anestesista;
import org.br.serratec.model.Clinica;
import org.br.serratec.model.Medico;

public class TestePlano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clinica clinica = new Clinica("Sulamerica", "SulaSA", "364627780010");
		Medico medico = new Medico("Sulamerica", 123447, "Leandro");
		Anestesista anestesista = new Anestesista("Sulamerica", 123456, "Kamylla", "Geral");
		ControlePagamento controle = new ControlePagamento();
		
		clinica.calcularConsulta();
		controle.calcularTotalPago(clinica);
		medico.calcularConsulta();
		controle.calcularTotalPago(medico);
		anestesista.calcularConsulta();
		controle.calcularTotalPago(anestesista);
		
		
		
		System.out.println(clinica + "Valor a receber do plano: " + clinica.getValorPago());
		System.out.println(medico + "Valor a receber do plano: " + medico.getValorPago());
		System.out.println(anestesista + "Valor a receber do plano: " + anestesista.getValorPago());
		System.out.println("Total geral: " + controle.getTotalGeral());
	}

}
