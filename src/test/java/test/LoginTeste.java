package test;

import static org.junit.Assert.assertEquals;


import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Page.LoginPO;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTeste extends BaseTeste {
	
private static LoginPO loginPage;

private void executarAcaoDeLogar(String email, String senha){
	loginPage.escrever(loginPage.inputEmail, email);
	loginPage.escrever(loginPage.inputSenha, senha);
	  
	  loginPage.buttonEntrar.click();
}
	
	@BeforeClass
public static void prepararTestes() {
	loginPage = new LoginPO (driver);
	

}

@Test
public void TC001_naoDeveLogarNoSistemaComEmailESenhaVazios(){
	
  
       executarAcaoDeLogar("", "");
  String mensagem = loginPage.obterMensagem(); mensagem = "Informe usuário e senha, os campos não podem ser brancos.";
  
  
      assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
      
}


@Test
public void TC002_naoDeveLogarNoSistemaComEmailIncorretoESenhaVazios(){
	
  
	executarAcaoDeLogar("teste", "");
  String mensagem = loginPage.obterMensagem(); mensagem = "Informe usuário e senha, os campos não podem ser brancos.";
  
  
      assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
      
}

@Test
public void TC003_naoDeveLogarNoSistemaComEmailVazioESenhaIncorreta(){
	
  
	executarAcaoDeLogar("", "teste");
  String mensagem = loginPage.obterMensagem(); mensagem = "Informe usuário e senha, os campos não podem ser brancos.";
  
  
      assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
      
}
}
