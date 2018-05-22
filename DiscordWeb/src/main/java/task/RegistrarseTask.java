package task;

import org.openqa.selenium.WebDriver;

import appobject.CadastroAppObject;

public class RegistrarseTask {

	
	private CadastroAppObject cadastroAppObject;
	
	
	public RegistrarseTask(WebDriver driver) {
		this.cadastroAppObject = new CadastroAppObject(driver);
	}

	
	public void gerarformulario() {
		this.cadastroAppObject.getRegistrarseButton().click();
	}
}
