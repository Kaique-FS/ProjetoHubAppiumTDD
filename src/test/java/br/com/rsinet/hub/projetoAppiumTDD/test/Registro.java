package br.com.rsinet.hub.projetoAppiumTDD.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub.projetoAppiumTDD.screenObject.HomeScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.LogInScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.RegisterScreen;
import br.com.rsinet.hub.projetoAppiumTDD.utility.AndroidDriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Registro {

	private AndroidDriver<MobileElement> driver;
	private HomeScreen HP;
	private LogInScreen LP;
	private RegisterScreen RP;

	@Before
	public void AbreAPlicacao() throws MalformedURLException,InterruptedException {
		
		AndroidDriverManager.AbreAndroid();
		driver = AndroidDriverManager.AbreAndroid();
		
		HP = new HomeScreen(AndroidDriverManager.AbreAndroid());
		LP = new LogInScreen(AndroidDriverManager.AbreAndroid());
		RP = new RegisterScreen(AndroidDriverManager.AbreAndroid());
		
	}
	
	@Test
	public void Cadastrar_Usuario() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		HP.bnt_Menu().click();
		HP.bnt_LogIn().click();
		LP.Novo_Usuario().click();
		
		System.out.println("Ele abriu o APP e foi para pagina de cadastro");

		//Detalhes da Conta
		RP.txtbx_NomeUsuario().sendKeys("kaiquefs");
		RP.txtbx_Email().sendKeys("kaique@hotmail.com");
		RP.txtbx_Senha().sendKeys("Kaique1");
		RP.txtbx_ConfirmarSenha().sendKeys("Kaique1");
					
		RP.Rola_Pagina(driver, "PHONE NUMBER");

		//Detalhes Pessoais
		RP.txtbx_PrimeiroNome().sendKeys("Kaique");
		RP.txtbx_UltimoNome().sendKeys("Silva");
		RP.txtbx_TelefoneNumero().sendKeys("+55 (11) 99353-6566");
						
		RP.Rola_Pagina(driver, "REGISTER");

		//Endereco
		RP.dpnbx_Pais().click();
		
		RP.Rola_Paises(driver, "Brazil");
		
		RP.txtbx_Estado().sendKeys("São Paulo");
		RP.txtbx_Endereco().sendKeys("Rua do Desespero");
		RP.txtbx_Cidade().sendKeys("Inferno");
		RP.txtbx_CodigoPostal().sendKeys("99999-999");
				
		//Confirmação Para Cadastrar
		
		RP.chkbx_Propagandas().click();
		RP.btn_Registrar().click();
			
		Thread.sleep(5000);
		
		//wait.until(ExpectedConditions.visibilityOf(HP.bnt_Menu()));
		HP.bnt_Menu().click();
		
		assertTrue(HP.btn_Deslogar().isEnabled());
		
		System.out.println("Chupa essa manga");
	}
	
	@Test
	public void Cadastrar_Usuario_Ja_Existente() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		HP.bnt_Menu().click();
		HP.bnt_LogIn().click();
		LP.Novo_Usuario().click();
		
		System.out.println("Ele abriu o APP e foi para pagina de cadastro");

		//Detalhes da Conta
		RP.txtbx_NomeUsuario().sendKeys("kaiquefs");
		RP.txtbx_Email().sendKeys("kaique@hotmail.com");
		RP.txtbx_Senha().sendKeys("Kaique1");
		RP.txtbx_ConfirmarSenha().sendKeys("Kaique1");
					
		RP.Rola_Pagina(driver, "PHONE NUMBER");

		//Detalhes Pessoais
		RP.txtbx_PrimeiroNome().sendKeys("Kaique");
		RP.txtbx_UltimoNome().sendKeys("Silva");
		RP.txtbx_TelefoneNumero().sendKeys("+55 (11) 99353-6566");
						
		RP.Rola_Pagina(driver, "REGISTER");

		//Endereco
		RP.dpnbx_Pais().click();
		
		RP.Rola_Paises(driver, "Brazil");
		
		RP.txtbx_Estado().sendKeys("São Paulo");
		RP.txtbx_Endereco().sendKeys("Rua do Desespero");
		RP.txtbx_Cidade().sendKeys("Inferno");
		RP.txtbx_CodigoPostal().sendKeys("99999-999");
				
		//Confirmação Para Cadastrar
		
		RP.chkbx_Propagandas().click();
		RP.btn_Registrar().click();
			
		Thread.sleep(5000);
		
		//wait.until(ExpectedConditions.visibilityOf(HP.bnt_Menu()));
		HP.bnt_Menu().click();
		
		assertFalse(HP.btn_Deslogar().isEnabled());
		
		System.out.println("Chupa essa manga");
	}
	
	@After
	public void FechaAPlicacao() {

		AndroidDriverManager.FechaAndroid();
	}
	
}
