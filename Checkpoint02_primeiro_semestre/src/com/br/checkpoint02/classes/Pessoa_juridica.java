package com.br.checkpoint02.classes;

import java.util.Date;

public class Pessoa_juridica extends Pessoa {
	
	String cpfPessoaJurica;
	String rgPessoaJurica;
	Date dataNascimentoPessoaJuridica;
    String remuneracaoPessoaJuridica;
    
    
    
	private String getCpfPessoaJurica() {
		return cpfPessoaJurica;
	}
	private void setCpfPessoaJurica(String cpfPessoaJurica) {
		this.cpfPessoaJurica = cpfPessoaJurica;
	}
	private String getRgPessoaJurica() {
		return rgPessoaJurica;
	}
	private void setRgPessoaJurica(String rgPessoaJurica) {
		this.rgPessoaJurica = rgPessoaJurica;
	}
	private Date getDataNascimentoPessoaJuridica() {
		return dataNascimentoPessoaJuridica;
	}
	private void setDataNascimentoPessoaJuridica(Date dataNascimentoPessoaJuridica) {
		this.dataNascimentoPessoaJuridica = dataNascimentoPessoaJuridica;
	}
	private String getRemuneracaoPessoaJuridica() {
		return remuneracaoPessoaJuridica;
	}
	private void setRemuneracaoPessoaJuridica(String remuneracaoPessoaJuridica) {
		this.remuneracaoPessoaJuridica = remuneracaoPessoaJuridica;
	}
    
    
    
    
}
