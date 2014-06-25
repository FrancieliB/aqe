package br.com.banco;

import java.util.List;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface BancoWebService {

	@WebMethod
	boolean deposito( int numeroConta, double valor );

	@WebMethod
	boolean saque( int numeroConta, double valor );

	@WebMethod
	Conta saldo( int numeroConta );
	
	@WebMethod 
	Transacao[] extrato( int numeroConta );
	
	@WebMethod
	void criaNovaConta( int numeroConta, double saldo );
}
