package br.com.rsinet.hub.projetoAppiumTDD.test;

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
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.ProductScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.RegisterScreen;
import br.com.rsinet.hub.projetoAppiumTDD.screenObject.TabletsScreen;
import br.com.rsinet.hub.projetoAppiumTDD.utility.AndroidDriverManager;
import br.com.rsinet.hub.projetoAppiumTDD.utility.Report;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaHome {

	private AndroidDriver<WebElement> driver;
	private HomeScreen HS;
	private LogInScreen LS;
	private RegisterScreen RS;
	private HeadphonesScreen HsS;
	private ProductScreen PS;
	private TabletsScreen TS;
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
		
	}
	
	@Test
	public void Pesquisar_Produto_Pela_Pagina_Inicial_Existente() {
		test = report.createTest("Pesquisa pela tela inicial valido");
	
		HS.bnt_Headphones().click();
		HsS.Produto_3().click();
		PS.Quantidade().click();
		PS.Quantidade_Mais().click();
		PS.Aplica_Quantidade().click();

	}
	
	@Test
	public void Pesquisar_Produto_Pela_Pagina_Inicial_Incorreto() {
	
		test = report.createTest("Pesquisa pela tela inicial negativo");
		
		HS.bnt_Tablets().click();
		TS.Produto_2().click();
		PS.Quantidade().click();
		PS.Digita_Quantidade().click();
		PS.Digita_Quantidade().clear();
		PS.Digita_Quantidade().sendKeys("21");
		PS.Aplica_Quantidade().click();

	}
	
	@AfterMethod
	public void testConfigsOff(ITestResult result) throws Exception {
		Report.CloseTest(result, test, driver);
	}
	
	@AfterTest
	public void FinalizaAplicacao() {
		Report.CloseReport(report);
		AndroidDriverManager.FechaAndroid();
	}
}
