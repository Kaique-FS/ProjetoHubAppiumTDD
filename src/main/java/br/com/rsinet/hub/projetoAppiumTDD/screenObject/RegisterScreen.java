package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub.projetoAppiumTDD.utility.AndroidDriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class RegisterScreen {

	private AndroidDriver<WebElement> driver;
	private TouchAction TA;

	public RegisterScreen(AndroidDriver<WebElement> driver) {
		this.driver = driver;
		TA = new TouchAction(driver);
	}
	
	//Detalhes da Conta
	
	public WebElement txtbx_NomeUsuario() {
		WebElement txtbx_NomeUsuario = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_NomeUsuario;
	}
	
	public WebElement txtbx_Email() {
		WebElement txtbx_Email = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_Email;
	}
	
	public WebElement txtbx_Senha() {
		WebElement txtbx_Senha = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_Senha;
	}
	
	public WebElement txtbx_ConfirmarSenha() {
		WebElement txtbx_ConfirmarSenha = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_ConfirmarSenha;
	}
	
	//Detalhes Pessoais
	
	public WebElement txtbx_PrimeiroNome() {
		WebElement txtbx_PrimeiroNome = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText");
		return txtbx_PrimeiroNome;
	}
	
	public WebElement txtbx_UltimoNome() {
		WebElement txtbx_UltimoNome = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText");
		return txtbx_UltimoNome;
	}
	
	public WebElement txtbx_TelefoneNumero() {
		WebElement txtbx_TelefoneNumero = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_TelefoneNumero;
	}
	
	//Endereço
	
	public WebElement dpnbx_Pais() {
		WebElement dpnbx_Pais = driver.findElementById("com.Advantage.aShopping:id/linearLayoutCountry");
		return dpnbx_Pais;
	}
	
	public WebElement txtbx_Estado() {
		WebElement txtbx_Estado = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_Estado;
	}
	
	public WebElement txtbx_Endereco() {
		WebElement txtbx_Endereco = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_Endereco;
	}
	
	public WebElement txtbx_Cidade() {
		WebElement txtbx_Cidade = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText");
		return txtbx_Cidade;
	}
	
	public WebElement txtbx_CodigoPostal() {
		WebElement txtbx_CodigoPostal = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText");
		return txtbx_CodigoPostal;
	}
	
	public WebElement btn_UsarLocalizacao() {
		WebElement btn_UsarLocalizacao = driver.findElementById("com.Advantage.aShopping:id/switchLocation");
		return btn_UsarLocalizacao;
	}
	
	// CheckBox e Registro
	
	public WebElement chkbx_Propagandas() {
		WebElement chkbx_Propagandas = driver.findElementById("com.Advantage.aShopping:id/checkBoxRecieveOffers");
		return chkbx_Propagandas;
	}
	
	public WebElement chkbx_AceitarCondicoes() {
		WebElement chkbx_AceitarCondicoes = driver.findElementById("com.Advantage.aShopping:id/checkBoxAgreeConditions");
		return chkbx_AceitarCondicoes;
	}
	
	public WebElement btn_Registrar() {
		WebElement btn_Registrar = driver.findElementById("com.Advantage.aShopping:id/buttonRegister");
		return btn_Registrar;
	}
	
	public void Rola_A_Pagina(double inicio, double fim) throws Exception {
		
		Dimension size = AndroidDriverManager.getDriver().manage().window().getSize();
		
		int x = size.width / 2;
		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);
		
		new TouchAction((PerformsTouchActions) AndroidDriverManager.getDriver()).press(PointOption.point(x, start_y))
				.waitAction((WaitOptions.waitOptions(Duration.ofMillis(500))))//
				.moveTo(PointOption.point(x, end_y))//
				.release().perform();
	}
	
	public void Rola_Paises(AndroidDriver<WebElement> driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))").click();
	}
	
	public void Rola_Pagina(AndroidDriver<WebElement> driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");
	}
}
