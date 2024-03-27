package br.com.caelum.util;

public class TesteContaEstouro3 {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.saldo = 100;
		
		double novoSaldo = -200;
		
		if(novoSaldo<0) {
			System.out.println("Nao posso mudar para esse saldo");
		}else {
			minhaConta.saldo = novoSaldo;
		}
	}
}
