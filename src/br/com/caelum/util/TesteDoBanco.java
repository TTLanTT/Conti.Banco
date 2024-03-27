package br.com.caelum.util;

import br.com.caelum.Banco.Banco;

public class TesteDoBanco {
	public static void main(String[] args) {
		Banco meuBanco = new Banco();
		meuBanco.nome = "Banco Do Brasil";
		System.out.println(meuBanco.nome);
				
	}
}
