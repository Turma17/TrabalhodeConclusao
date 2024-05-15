package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnLogar = By.xpath("/html/body/div[1]/section[1]/div/div/div/div[2]/div/div/div/div/a/span");
	private By cpuserName = By.name("username");
	private By cpSenha = By.name("password");
	private By btnLogin = By.id("submit");
	private By mensagem = By.cssSelector("/html/body/div[2]/div/div[1]/ul/li");
	
	public By getBtnLogar1() {
		return btnLogar;
	}
		
	public By getCpuserName() {
		return cpuserName;
	}	
	
	public By getCpSenha() {
		return cpSenha;
	}
	
	public By getBtnLogin() {
		return btnLogin;
	}
	
	public By getMensagem() {
		return mensagem;
	}

	
			
}
