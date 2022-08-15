package test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import Page.GooglePO;

public class GoogleTeste extends BaseTeste {
	
private static GooglePO googlePage;
	
	@BeforeClass
public static void prepararTestes() {
		driver.get("https://www.google.com/");
	googlePage = new GooglePO (driver);
	

	
}

@Test
public void TC001_deveSerPossivelPesquisarNoGoogleOTextoBatataFrita(){
	
	
	googlePage.pesquisar("Batata Frita");
	
	String resultado = googlePage.obterResultadoDaPesquisa();

      assertTrue(resultado, resultado.contains("Aproximadamente"));
      
      
}

@Test
public void TC002_deveSerPossivelPesquisarNoGoogleOTextoNutella(){
	
	

	googlePage.pesquisar("Nutella");
	
	String resultado = googlePage.obterResultadoDaPesquisa();
      assertTrue(resultado, resultado.contains("resultados"));
}
      
}
