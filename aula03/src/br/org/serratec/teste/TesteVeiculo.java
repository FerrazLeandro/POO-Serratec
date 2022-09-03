package br.org.serratec.teste;

import br.org.serratec.model.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		veiculo.setPlaca("ABC-123");
		veiculo.setTipoCombustivel("Flex");
		veiculo.setValor(40000.00);
		
		System.out.println("Placa: " + veiculo.getPlaca());
		System.out.println("O Valor do IPVA é: " + veiculo.calcularIPVA());
		
		
	}

}
