package br.com.caelum.Banco;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double getBonificacao() {
		return this.salario * 0.10;
	}
}

