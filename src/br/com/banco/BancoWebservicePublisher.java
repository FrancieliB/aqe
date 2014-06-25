package br.com.banco;

import javax.xml.ws.Endpoint;

public class BancoWebservicePublisher {

	public static void main( String[] args ) {
		Endpoint.publish( "http://127.0.0.1:4001/banco", new BancoWebServiceImpl() );
	}
}
