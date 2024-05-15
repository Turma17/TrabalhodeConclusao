package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class Steps {
	
	Elementos e = new Elementos();
	Metodos m = new Metodos();

	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
	   m.abrirNavegador(string); 
	}
	
	@Quando("clicar no botao de login")
	public void clicar_no_botao_de_login() throws InterruptedException {
		m.pausar(6000);
		 m.clicar(e.getBtnLogin());
	}	
	
	@Quando("inserir usuario valido")
	public void inserir_usuario_valido() {
	m.preencherCampo(e.getCpuserName(), "rosedpaulatpd@hotmail.com");
	}

	@Quando("inserir senha invalida")
	public void inserir_senha_invalida() {
	m.preencherCampo(e.getCpSenha(), "glgllhl");
	}

	@Quando("clicar no botao de logar")
	public void clicar_no_botao_de_logar() throws InterruptedException {
		
		 m.clicar(e.getBtnLogin());
	}
	

	@Entao("deve exibir mensagem de senha incorreta")
	public void deve_exibir_mensagem_de_senha_incorreta() {
	   System.out.println("senha incorreta");
	}
	{
		
	}

}