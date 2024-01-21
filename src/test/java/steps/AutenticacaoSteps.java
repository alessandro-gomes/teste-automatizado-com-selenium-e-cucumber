package steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutenticacaoSteps {

	private WebDriver driver;

	@Given("que estou na pagina de autenticacao")
	public void queEstouNaPaginaDeAutenticacao() {
		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		driver = new FirefoxDriver();
		driver.get("http://54.166.20.145:9080/desafioqa/login");
	}

	@When("preencho o campo {string} com {string}")
	public void preenchoOCampoCom(String campo, String valor) {
		WebElement campoElemento = driver.findElement(By.name(campo));
		campoElemento.sendKeys(valor);
	}

	@And("identifico o campo {string} e utilizo {string}")
	public void adicionoASenha(String campo, String valor) {
		WebElement campoElemento = driver.findElement(By.name(campo));
		campoElemento.sendKeys(valor);
	}

	@And("clico no botao")
	public void clicoNoBotao() {
		WebElement botaoElemento = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		botaoElemento.click();
	}

	@Then("vejo a mensagem de sucesso contendo {string}")
	public void vejoAMensagemDeSucesso(String textoEsperado) {
		WebElement h1Elemento = driver.findElement(By.tagName("h1"));
		System.out.println(h1Elemento);
		assertTrue(h1Elemento.getText().contains(textoEsperado));
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
