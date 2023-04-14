package projeto.prova.api;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Consultar {

	
	@Test
	public void consultarNome() {
	RestAssured.baseURI = "https://dadosabertos.camara.leg.br/api";
	Response response = RestAssured.get("/v2/deputados/131510");

	System.out.println(response.asPrettyString());
	}
}
	
	

	
	
		
		
	
	

