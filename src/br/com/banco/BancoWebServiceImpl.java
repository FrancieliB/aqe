package br.com.banco;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "br.com.banco.BancoWebService")
public class BancoWebServiceImpl implements BancoWebService {

	@Override
	@WebMethod
	public boolean deposito( int numeroConta, double valor ) {		
		Operacao op = Operacao.getInstace();
		return op.deposito( numeroConta, valor );
	}

	@Override
	@WebMethod
	public boolean saque( int numeroConta, double valor ) {
		Operacao op = Operacao.getInstace();
		return op.saque( numeroConta, valor );
	}

	@Override
	@WebMethod
	public Conta saldo( int numeroConta ) {
		Operacao op = Operacao.getInstace();
		return op.getConta( numeroConta );
	}

	@Override
	@WebMethod
	public Transacao[] extrato( int numeroConta ) {
		Operacao op = Operacao.getInstace();
		return op.getExtrato( numeroConta );
	}

	@Override
	@WebMethod
	public void criaNovaConta( int numeroConta, double saldo ) {
		Operacao op = Operacao.getInstace();
		op.novaConta( numeroConta, saldo );
	}
}
