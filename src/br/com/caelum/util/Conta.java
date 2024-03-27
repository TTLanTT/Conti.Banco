/**
*	Classe	responsável	por	moldar	as	Contas	do	Banco
*
*	@author	Joao Gabryel
*/


package br.com.caelum.util;

public class Conta {
	public int numero;
	public String titular;
	public double saldo;
	public double limite;
	public static int totalDeContas;

	
	
	
	public Conta(){
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
	public double getSaldo() {
		return this.saldo + this.limite;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	public double pegaSaldo() {
		return this.saldo;
	}
	
	
	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	public void saca(double valor) {
		if(valor > this.saldo) {
			System.out.println("Nao posso sacar um valor maior que o saldo!");
		}else {
			this.saldo = this.saldo - valor;
		}
		
	}
	
	public void transfere(Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
	
}
