package task;

import org.openqa.selenium.WebDriver;

import appobject.CadastroAppObject;

public class CadastroTask {
	
	private CadastroAppObject cadastroAppObject;
	
	public CadastroTask(WebDriver driver) {
		this.cadastroAppObject = new CadastroAppObject(driver);
	}

	
	public void gerarformulario() {
		this.cadastroAppObject.getRegistrarseButton().click();
	}
	
	public void preenchercadastro(String email, String nomedeusuario, String senha) {
		this.cadastroAppObject.getEmailTextField().sendKeys(email);
		this.cadastroAppObject.getNomeUsuarioTextField().sendKeys(nomedeusuario);
		this.cadastroAppObject.getSenhaTextField().sendKeys(senha);
	}
	
	public void enviarFormulario() {
		this.cadastroAppObject.getConfirmarButton().click();
	}
}
