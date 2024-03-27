package br.com.caelum.util;

import br.com.caelum.Banco.*;

public class ControleDeBonificacoes {
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}
	
	public double getTotoalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
