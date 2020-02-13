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
	private HomeScreen HS;
	private LogInScreen LS;
	private RegisterScreen RS;

	@Before
	public void AbreAPlicacao() throws MalformedURLException,InterruptedException {
		
		AndroidDriverManager.AbreAndroid();
		driver = AndroidDriverManager.AbreAndroid();
		
		HS = new HomeScreen(AndroidDriverManager.AbreAndroid());
		LS = new LogInScreen(AndroidDriverManager.AbreAndroid());
		RS = new RegisterScreen(AndroidDriverManager.AbreAndroid());
		
	}
	
	@Test
	public void Cadastrar_Usuario() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		HS.bnt_Menu().click();
		HS.bnt_LogIn().click();
		LS.Novo_Usuario().click();
		
		System.out.println("Ele abriu o APP e foi para pagina de cadastro");

		//Detalhes da Conta
		RS.txtbx_NomeUsuario().sendKeys("kaiquefs");
		RS.txtbx_Email().sendKeys("kaique@hotmail.com");
		RS.txtbx_Senha().sendKeys("Kaique1");
		RS.txtbx_ConfirmarSenha().sendKeys("Kaique1");
					
		RS.Rola_Pagina(driver, "PHONE NUMBER");

		//Detalhes Pessoais
		RS.txtbx_PrimeiroNome().sendKeys("Kaique");
		RS.txtbx_UltimoNome().sendKeys("Silva");
		RS.txtbx_TelefoneNumero().sendKeys("+55 (11) 99353-6566");
						
		RS.Rola_Pagina(driver, "REGISTER");

		//Endereco
		RS.dpnbx_Pais().click();
		
		RS.Rola_Paises(driver, "Brazil");
		
		RS.txtbx_Estado().sendKeys("São Paulo");
		RS.txtbx_Endereco().sendKeys("Rua do Desespero");
		RS.txtbx_Cidade().sendKeys("Inferno");
		RS.txtbx_CodigoPostal().sendKeys("99999-999");
				
		//Confirmação Para Cadastrar
		
		RS.chkbx_Propagandas().click();
		RS.btn_Registrar().click();
			
		Thread.sleep(5000);
		
		//wait.until(ExpectedConditions.visibilityOf(HP.bnt_Menu()));
		HS.bnt_Menu().click();
		
		assertTrue(HS.btn_Deslogar().isEnabled());
		
		System.out.println("Chupa essa manga");
	}
	
	@Test
	public void Cadastrar_Usuario_Ja_Existente() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		HS.bnt_Menu().click();
		HS.bnt_LogIn().click();
		LS.Novo_Usuario().click();
		
		System.out.println("Ele abriu o APP e foi para pagina de cadastro");

		//Detalhes da Conta
		RS.txtbx_NomeUsuario().sendKeys("kaiquefs");
		RS.txtbx_Email().sendKeys("kaique@hotmail.com");
		RS.txtbx_Senha().sendKeys("Kaique1");
		RS.txtbx_ConfirmarSenha().sendKeys("Kaique1");
					
		RS.Rola_Pagina(driver, "PHONE NUMBER");

		//Detalhes Pessoais
		RS.txtbx_PrimeiroNome().sendKeys("Kaique");
		RS.txtbx_UltimoNome().sendKeys("Silva");
		RS.txtbx_TelefoneNumero().sendKeys("+55 (11) 99353-6566");
						
		RS.Rola_Pagina(driver, "REGISTER");

		//Endereco
		RS.dpnbx_Pais().click();
		
		RS.Rola_Paises(driver, "Brazil");
		
		RS.txtbx_Estado().sendKeys("São Paulo");
		RS.txtbx_Endereco().sendKeys("Rua do Desespero");
		RS.txtbx_Cidade().sendKeys("Inferno");
		RS.txtbx_CodigoPostal().sendKeys("99999-999");
				
		//Confirmação Para Cadastrar
		
		RS.chkbx_Propagandas().click();
		RS.btn_Registrar().click();
			
		Thread.sleep(5000);
		
		//wait.until(ExpectedConditions.visibilityOf(HP.bnt_Menu()));
		HS.bnt_Menu().click();
		
		assertFalse(HS.btn_Deslogar().isEnabled());
		
		System.out.println("Chupa essa manga");
	}
	
	@After
	public void FechaAPlicacao() {

		AndroidDriverManager.FechaAndroid();
	}
	
}
