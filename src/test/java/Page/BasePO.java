package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * Classe para criação das novas PageObjects.
 *Todas as pages devem ser herdadas dessa classe.
 */
public abstract class BasePO {
	/** Driver que será usado pelas pages.
	 * 
	 */
	protected WebDriver driver;
	
	/** 
	 * Construtor base para criação da fábrica de elementos (PageFactory)
	 * @param driver Driver da página atual
	 */
	public BasePO(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}