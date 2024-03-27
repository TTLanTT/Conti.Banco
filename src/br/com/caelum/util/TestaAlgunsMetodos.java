package br.com.caelum.util;

public class TestaAlgunsMetodos {
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.titular = "Duke";
		minhaConta.saldo = 1000.0;
		
		minhaConta.saca(200);
		
		minhaConta.deposita(500);
		
		
		System.out.println(minhaConta.saldo);
		
	}
}
