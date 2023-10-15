package com.br.checkpoint02.servicos;

import com.br.checkpoint02.classes.Pessoa_fisica;

public class testaClassePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//para testar tenho que estanciar a classe
		
		Pessoa_fisica testePf = new  Pessoa_fisica();
		
		testePf.setCpfPessoaFisica("298.98877-9888");
		
		/// set estou imputando um valor no meu atributo
		/// get estou consultando o valor do meu atributo
		
	  System.out.println("CPF da Pessoa Fisica= " + testePf.getCpfPessoaFisica());

	}

}
