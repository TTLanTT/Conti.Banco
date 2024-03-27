package br.com.caelum.Banco;

class Cliente {
	public String nome;
	public String endereco;
	public String cpf;
	public int idade;
	
	public void mudaCPF(String cpf) {
		if(this.idade <= 60) {
			validaCPF(cpf);
		}
		this.cpf = cpf;
	}
	
	private void validaCPF(String cpf) {
	}
}
