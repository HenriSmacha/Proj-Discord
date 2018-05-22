package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import task.CadastroTask;

public class CadastrosTestCase {
	
	private WebDriver driver;
	private CadastroTask cadastro;
	
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://discordapp.com/");
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTask(driver);
	}
		
		@Test
		public void testMain() {
			this.cadastro.gerarformulario();
			this.cadastro.preenchercadastro("acountsqn2@gmail.com", "s2bteste01", "s2bteste");
			this.cadastro.enviarFormulario();
		}
		
		@After
		public void tearDown() {
			//this.driver.quit();
		}
			
}
