package br.com.caelum.util;

public class TesteContaEstouro1 {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.saldo = 1000.0;
		minhaConta.saca(50000);
	}
}
