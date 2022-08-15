package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO {
	@FindBy(name = "q")
	public WebElement inputPesquisa;
	
	@FindBy(id = "result-stats")
	public WebElement divResultadoPesquisa;
	/**
	 * Construtor para criação da página do Google
	 * @param driver Driver da página do Google
	 */

	public GooglePO(WebDriver driver) {
		super(driver); 
		// TODO Auto-generated constructor stub
	}
	
/**
 * Metodo que irá efetuar uma pesquisa no google basendo no texto informado e concluindo com eter
 * @param texto Texto a ser pesquisado
 */
	public void pesquisar(String texto) {
	inputPesquisa.sendKeys(texto + Keys.ENTER);
		
	}
	
	/**
	 * Metodo que retorna o resultado da pesquisa
	 * @return Retorna o resultado da pesquisa
	 */
	public String obterResultadoDaPesquisa(){
		return divResultadoPesquisa.getText();
		
	}

}
