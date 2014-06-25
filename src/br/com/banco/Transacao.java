package br.com.banco;

import java.util.Date;

public class Transacao {

	private Conta conta;
	private TipoOperacao tipoOperacao;
	private double saldoAnterior;
	private double saldo;
	private Date data;

	public Conta getConta() {
		return conta;
	}

	public void setConta( Conta conta ) {
		this.conta = conta;
	}

	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao( TipoOperacao tipoOperacao ) {
		this.tipoOperacao = tipoOperacao;
	}

	public double getSaldoAnterior() {
		return saldoAnterior;
	}

	public void setSaldoAnterior( double saldoAnterior ) {
		this.saldoAnterior = saldoAnterior;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo( double saldo ) {
		this.saldo = saldo;
	}

	public Date getData() {
		return data;
	}

	public void setData( Date data ) {
		this.data = data;
	}
}
