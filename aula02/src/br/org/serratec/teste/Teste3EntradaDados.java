package br.org.serratec.teste;

import javax.swing.JOptionPane;

public class Teste3EntradaDados {

	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Primeiro numero: ");
		String numero2 = JOptionPane.showInputDialog("Segundo numero: ");
		
		Double nota = Double.parseDouble(numero);
		Double nota2 = Double.parseDouble(numero2);
		
		JOptionPane.showMessageDialog(null, "Média: " + ((nota + nota2) / 2));
	}

}
