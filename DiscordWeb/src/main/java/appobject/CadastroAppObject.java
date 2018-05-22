package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroAppObject {
	
	private WebDriver driver;
	
	public CadastroAppObject(WebDriver driver) {
		this.driver = driver;
	} 
	
	public WebElement getRegistrarseButton() {
		return this.driver.findElement(By.xpath("//*[@id=\'app-mount\']/div/div/footer/div/div[3]/a"));
	}
	
	public WebElement getEmailTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\'app-mount\']/div[1]/div/div[2]/div/form/div/div[2]/div[1]/div/input"));
	}
	
	public WebElement getNomeUsuarioTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\'app-mount\']/div[1]/div/div[2]/div/form/div/div[2]/div[2]/div/input"));
	}
	
	public WebElement getSenhaTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\'app-mount\']/div[1]/div/div[2]/div/form/div/div[2]/div[3]/div/input"));
	}
	
	public WebElement getConfirmarButton() {
		return this.driver.findElement(By.xpath("//*[@id=\'app-mount\']/div[1]/div/div[2]/div/form/div/div[2]/button[1]"));
	}

}
