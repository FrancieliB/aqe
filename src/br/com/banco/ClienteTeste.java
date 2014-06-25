package br.com.banco;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ClienteTeste {

	public static void main( String args[] ) throws Exception {

		URL url = new URL( "http://127.0.0.1:4001/banco?wsdl" );
		QName qname = new QName( "http://banco.com.br/", "BancoWebServiceImplService" );
		Service ws = Service.create( url, qname );
		BancoWebService banco = ws.getPort( BancoWebService.class );

		banco.criaNovaConta( 222, 26D );
		banco.criaNovaConta( 223, 200D );
		
		System.out.println( "Saldo: " + banco.saldo( 222 ).getSaldo() );

	}
	
}
