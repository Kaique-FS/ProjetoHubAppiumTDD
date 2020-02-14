package br.com.rsinet.hub.projetoAppiumTDD.test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;


import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub.projetoAppiumTDD.screenObject.HeadphonesScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.HomeScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.LogInScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.MiceScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.ProductScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.RegisterScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.TabletsScreen;
import br.com.rsinet.hub.projetoAppiumTDD.utility.AndroidDriverManager;
import br.com.rsinet.hub.projetoAppiumTDD.utility.Report;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaLupa {

	private AndroidDriver<WebElement> driver;
	private HomeScreen HS;
	private LogInScreen LS;
	private RegisterScreen RS;
	private HeadphonesScreen HsS;
	private ProductScreen PS;
	private TabletsScreen TS;
	private MiceScreen MS;
	private ExtentReports report;
	private ExtentTest test;

	@BeforeTest
	public void inicializaRelatorio() {
		report = Report.StartReport();
	}
	
	@BeforeMethod
	public void AbreAPlicacao() throws MalformedURLException,InterruptedException {
		
		AndroidDriverManager.AbreAndroid();
		
		driver = AndroidDriverManager.AbreAndroid();
		
		HS = new HomeScreen(AndroidDriverManager.AbreAndroid());
		LS = new LogInScreen(AndroidDriverManager.AbreAndroid());
		RS = new RegisterScreen(AndroidDriverManager.AbreAndroid());
		HsS = new HeadphonesScreen(AndroidDriverManager.AbreAndroid());
		PS = new ProductScreen(AndroidDriverManager.AbreAndroid());
		TS = new TabletsScreen(AndroidDriverManager.AbreAndroid());
		MS = new MiceScreen(AndroidDriverManager.AbreAndroid());
		
	}
	
	@Test
	public void Pesquisar_Produto_Pela_Barra_De_Pesquisa() {
		
		test = report.createTest("Pesquisa de Produto pela Lupa Existente");
		
		HS.txtbx_Lupa().sendKeys("mice");
		HS.bnt_Lupa().click();
		
		RS.Rola_Pagina(driver, "TOUCH");
		MS.Produto_9().click();
		
		PS.Quantidade().click();
		PS.Quantidade_Mais().click();
		PS.Aplica_Quantidade().click();
		
		assertEquals(PS.Valida_Nome_Produto(), "MICROSOFT SCULPT TOUCH MOUSE");
	}
	
	@Test
	public void Pesquisar_Produto_Pela_Barra_De_Pesquisa_Inexistente() {
		
		test = report.createTest("Pesquisa de Produto pela Lupa  Inexistente");
		
		HS.txtbx_Lupa().sendKeys("Carregador");
		HS.bnt_Lupa().click();
		
		assertTrue(PS.Confirma_Produto().isEnabled());

	}
	
	@AfterMethod
	public void testConfigsOff(ITestResult result) throws Exception {
		Report.CloseTest(result, test, driver);
		AndroidDriverManager.FechaAndroid();

	}
	
	@AfterTest
	public void FinalizaAplicacao() {
		Report.CloseReport(report);
	}
}
