package br.com.rsinet.hub.projetoAppiumTDD.test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.rsinet.hub.projetoAppiumTDD.screenObject.HomeScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.LogInScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.MiceScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.ProductScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.RegisterScreen;
import br.com.rsinet.hub.projetoAppiumTDD.utility.AndroidDriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaLupa {

	private AndroidDriver<MobileElement> driver;
	private HomeScreen HS;
	private LogInScreen LS;
	private RegisterScreen RS;
	private MiceScreen MS;
	private ProductScreen PS;

	@Before
	public void AbreAPlicacao() throws MalformedURLException,InterruptedException {
		
		AndroidDriverManager.AbreAndroid();
		
		driver = AndroidDriverManager.AbreAndroid();
		
		HS = new HomeScreen(AndroidDriverManager.AbreAndroid());
		LS = new LogInScreen(AndroidDriverManager.AbreAndroid());
		RS = new RegisterScreen(AndroidDriverManager.AbreAndroid());
		MS = new MiceScreen(AndroidDriverManager.AbreAndroid());
		PS = new ProductScreen(AndroidDriverManager.AbreAndroid());
		
	}
	
	@Test
	public void Pesquisar_Produto_Pela_Barra_De_Pesquisa() {
		
		HS.txtbx_Lupa().sendKeys("mice");
		HS.bnt_Lupa().click();
		
		RS.Rola_Pagina(driver, "TOUCH");
		MS.Produto_9().click();
		
		PS.Quantidade().click();
		PS.Quantidade_Mais().click();
		PS.Aplica_Quantidade().click();
		
		PS.Adicionar_No_Carrinho().click();
		
		assertEquals(PS.Valida_Nome_Produto(), "MICROSOFT SCULPT TOUCH MOUSE");
	}
	
	@Test
	public void Pesquisar_Produto_Pela_Barra_De_Pesquisa_Inexistente() {
		
		HS.txtbx_Lupa().sendKeys("Carregador");
		HS.bnt_Lupa().click();
		
		assertTrue(PS.Confirma_Produto().isEnabled());

	}
	
	@After
	public void FechaAPlicacao() {

		AndroidDriverManager.FechaAndroid();
	}
}
