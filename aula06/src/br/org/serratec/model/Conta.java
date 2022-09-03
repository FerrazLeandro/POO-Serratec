package br.org.serratec.model;
// Uma interface não pode ter instancias
// Não posso fazer conta conta = new Conta();
// Interface é a forma de substituir herença em alguns casos
// Assinatura são metodos
// Não é necessário colocar abstract no metodo da interface pois tudo que está na interface já é 
// Tudo da interface já é public 
// Interface são apenas para assinaturas, não tem implementação
// Variaveis da interface tem que ser  constantes

public interface Conta {
	double taxa = 2.50;
	
	public Boolean saque(Double valor);
	public Boolean deposito(Double valor);
	
}
