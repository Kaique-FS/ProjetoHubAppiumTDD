package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import java.time.Duration;

import org.openqa.selenium.Dimension;

import br.com.rsinet.hub.projetoAppiumTDD.utility.AndroidDriverManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class RegisterScreen {

	private AndroidDriver<MobileElement> driver;
	private TouchAction TA;

	public RegisterScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		TA = new TouchAction(driver);
	}
	
	//Detalhes da Conta
	
	public MobileElement txtbx_NomeUsuario() {
		MobileElement txtbx_NomeUsuario = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_NomeUsuario;
	}
	
	public MobileElement txtbx_Email() {
		MobileElement txtbx_Email = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_Email;
	}
	
	public MobileElement txtbx_Senha() {
		MobileElement txtbx_Senha = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_Senha;
	}
	
	public MobileElement txtbx_ConfirmarSenha() {
		MobileElement txtbx_ConfirmarSenha = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_ConfirmarSenha;
	}
	
	//Detalhes Pessoais
	
	public MobileElement txtbx_PrimeiroNome() {
		MobileElement txtbx_PrimeiroNome = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText");
		return txtbx_PrimeiroNome;
	}
	
	public MobileElement txtbx_UltimoNome() {
		MobileElement txtbx_UltimoNome = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText");
		return txtbx_UltimoNome;
	}
	
	public MobileElement txtbx_TelefoneNumero() {
		MobileElement txtbx_TelefoneNumero = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_TelefoneNumero;
	}
	
	//Endereço
	
	public MobileElement dpnbx_Pais() {
		MobileElement dpnbx_Pais = driver.findElementById("com.Advantage.aShopping:id/linearLayoutCountry");
		return dpnbx_Pais;
	}
	
	public MobileElement txtbx_Estado() {
		MobileElement txtbx_Estado = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_Estado;
	}
	
	public MobileElement txtbx_Endereco() {
		MobileElement txtbx_Endereco = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText");
		return txtbx_Endereco;
	}
	
	public MobileElement txtbx_Cidade() {
		MobileElement txtbx_Cidade = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText");
		return txtbx_Cidade;
	}
	
	public MobileElement txtbx_CodigoPostal() {
		MobileElement txtbx_CodigoPostal = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText");
		return txtbx_CodigoPostal;
	}
	
	public MobileElement btn_UsarLocalizacao() {
		MobileElement btn_UsarLocalizacao = driver.findElementById("com.Advantage.aShopping:id/switchLocation");
		return btn_UsarLocalizacao;
	}
	
	// CheckBox e Registro
	
	public MobileElement chkbx_Propagandas() {
		MobileElement chkbx_Propagandas = driver.findElementById("com.Advantage.aShopping:id/checkBoxRecieveOffers");
		return chkbx_Propagandas;
	}
	
	public MobileElement chkbx_AceitarCondicoes() {
		MobileElement chkbx_AceitarCondicoes = driver.findElementById("com.Advantage.aShopping:id/checkBoxAgreeConditions");
		return chkbx_AceitarCondicoes;
	}
	
	public MobileElement btn_Registrar() {
		MobileElement btn_Registrar = driver.findElementById("com.Advantage.aShopping:id/buttonRegister");
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
	
	public void Rola_Paises(AndroidDriver<MobileElement> driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))").click();
	}
	
	public void Rola_Pagina(AndroidDriver<MobileElement> driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");
	}
}
