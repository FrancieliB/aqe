package br.com.banco;

public class Conta {

	private int numeroConta;
	private double saldo;

	public void deposita( double valor ){
		saldo += valor;
	}
	
	public void saca( double valor ){
		saldo -= valor;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta( int numeroConta ) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo( double saldo ) {
		this.saldo = saldo;
	}
}
