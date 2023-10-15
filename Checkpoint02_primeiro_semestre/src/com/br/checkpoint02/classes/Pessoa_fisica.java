package com.br.checkpoint02.classes;

import java.util.Date;

public class Pessoa_fisica extends Pessoa {
	
	String cpfPessoaFisica;
	String rgPessoaFisica;
	Date dataNascimentoPessoaFisica;
    String remuneracaoPessoaFisica;
    
	public String getCpfPessoaFisica() {
		return cpfPessoaFisica;
	}
	public void setCpfPessoaFisica(String cpfPessoaFisica) {
		this.cpfPessoaFisica = cpfPessoaFisica;
	}
	public String getRgPessoaFisica() {
		return rgPessoaFisica;
	}
	private void setRgPessoaFisica(String rgPessoaFisica) {
		this.rgPessoaFisica = rgPessoaFisica;
	}
	private Date getDataNascimentoPessoaFisica() {
		return dataNascimentoPessoaFisica;
	}
	private void setDataNascimentoPessoaFisica(Date dataNascimentoPessoaFisica) {
		this.dataNascimentoPessoaFisica = dataNascimentoPessoaFisica;
	}
	private String getRemuneracaoPessoaFisica() {
		return remuneracaoPessoaFisica;
	}
	private void setRemuneracaoPessoaFisica(String remuneracaoPessoaFisica) {
		this.remuneracaoPessoaFisica = remuneracaoPessoaFisica;
	}







}
