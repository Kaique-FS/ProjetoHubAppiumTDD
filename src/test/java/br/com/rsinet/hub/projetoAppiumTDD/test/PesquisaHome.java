package br.com.rsinet.hub.projetoAppiumTDD.test;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.rsinet.hub.projetoAppiumTDD.screenObject.HeadphonesScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.HomeScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.LogInScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.ProductScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.RegisterScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.TabletsScreen;
import br.com.rsinet.hub.projetoAppiumTDD.utility.AndroidDriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaHome {

	private AndroidDriver<MobileElement> driver;
	private HomeScreen HS;
	private LogInScreen LS;
	private RegisterScreen RS;
	private HeadphonesScreen HsS;
	private ProductScreen PS;
	private TabletsScreen TS;
	
	@Before
	public void AbreAPlicacao() throws MalformedURLException,InterruptedException {
		
		AndroidDriverManager.AbreAndroid();
		
		driver = AndroidDriverManager.AbreAndroid();
		
		HS = new HomeScreen(AndroidDriverManager.AbreAndroid());
		LS = new LogInScreen(AndroidDriverManager.AbreAndroid());
		RS = new RegisterScreen(AndroidDriverManager.AbreAndroid());
		HsS = new HeadphonesScreen(AndroidDriverManager.AbreAndroid());
		PS = new ProductScreen(AndroidDriverManager.AbreAndroid());
		TS = new TabletsScreen(AndroidDriverManager.AbreAndroid());
		
	}
	
	@Test
	public void Pesquisar_Produto_Pela_Pagina_Inicial_Existente() {
	
		HS.bnt_Headphones().click();
		HsS.Produto_3().click();
		PS.Quantidade().click();
		PS.Quantidade_Mais().click();
		PS.Aplica_Quantidade().click();
		PS.Adicionar_No_Carrinho().click();	
	}
	
	@Test
	public void Pesquisar_Produto_Pela_Pagina_Inicial_Incorreto() {
	
		HS.bnt_Tablets().click();
		TS.Produto_2().click();
		PS.Quantidade().click();
		PS.Digita_Quantidade().click();
		PS.Digita_Quantidade().clear();
		PS.Digita_Quantidade().sendKeys("21");
		PS.Aplica_Quantidade().click();
		PS.Adicionar_No_Carrinho().click();	
	}
	
	@After
	public void FinalizaAplicacao() {
		
		AndroidDriverManager.FechaAndroid();
	}
}
