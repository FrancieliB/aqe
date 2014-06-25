package br.com.banco;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Operacao {

	private static Operacao mySelf;
	private List<Conta> contas;
	private List<Transacao> transacoes;

	private Operacao() {
		contas = new ArrayList<Conta>();
		transacoes = new ArrayList<Transacao>();
	}

	public static Operacao getInstace() {

		if( mySelf.equals( null ) ) {
			mySelf = new Operacao();
		}

		return mySelf;
	}

	public boolean deposito( int nConta, double valor ) {
		
		for ( Conta c : contas ) {
			if(c.getNumeroConta() == nConta ){
								
				Transacao t = new Transacao();
				t.setConta( c );
				t.setData( new Date() );
				t.setSaldoAnterior( c.getSaldo() );
				t.setTipoOperacao( TipoOperacao.DEPOSITO );
				
				c.deposita( valor );
				
				t.setSaldo( c.getSaldo() );
	
				return true;
			} 
		}
		
		return false;
	}

	public boolean saque( int nConta, double valor ) {
		
		for ( Conta c : contas ) {
			if(c.getNumeroConta() == nConta ){
								
				Transacao t = new Transacao();
				t.setConta( c );
				t.setData( new Date() );
				t.setSaldoAnterior( c.getSaldo() );
				t.setTipoOperacao( TipoOperacao.SAQUE );
				
				c.saca( valor );
				
				t.setSaldo( c.getSaldo() );
	
				return true;
			} 
		}
		
		return false;
	}

	public Conta getConta( int nConta ) {
		
		for ( Conta c : contas ) {
			if(c.getNumeroConta() == nConta ){
				return c;
			} 
		}
		
		return null;
	}

	public Transacao[] getExtrato( int nConta ) {
		
		Transacao[] arrayTrans = new Transacao[30];
		
		int i = 0;
		for ( Transacao t : transacoes ) {
			if(t.getConta().getNumeroConta() == nConta){
				arrayTrans[i] = t;
				
				if(i++ >= 29){
					return arrayTrans;
				}
			}
		}
		
		return arrayTrans;
	}
	
	public void novaConta(int numeroConta, double saldo){
		Conta c = new Conta();
		c.setNumeroConta( numeroConta );
		c.setSaldo( saldo );
		
		contas.add( c );
	}
}
