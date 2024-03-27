package br.com.caelum.util;

import br.com.caelum.Banco.*;

class Programa {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.titular = "Duke";
		minhaConta.saldo = 1000.0;
		
		minhaConta.saca(200);
		
		minhaConta.deposita(500);
			
		Gerente gerente = new Gerente();
		Funcionario funcionario = gerente;
		funcionario.setSalario(5000);
		System.out.println(funcionario.getBonificacao());
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000.0);
		controle.registra(funcionario2);
		
		System.out.println(controle.getTotoalDeBonificacoes());
		
		
		Conta c = new Conta();
		int total = Conta.getTotalDeContas();
		
		System.out.println("Saldo atual: "+minhaConta.saldo);
	}
}
