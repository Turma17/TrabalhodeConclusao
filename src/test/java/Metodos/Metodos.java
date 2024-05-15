package Metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver navegador;
	public void abrirNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.get(url);		
	}
	public void clicar(By elemento) {
		navegador.findElement(elemento).click();
			
		}
	public void pausar (int tempo)throws InterruptedException {
		Thread.sleep(tempo);
	}
	
	public void preencherCampo (By elemento, String texto) {
		navegador.findElement(elemento).sendKeys(texto);
	}
	
	public void validaTexto(By elemento , String texto) {
		String mensagem = navegador.findElement(elemento).getText();
		assertEquals(texto,mensagem);
	}
	}
	
	
