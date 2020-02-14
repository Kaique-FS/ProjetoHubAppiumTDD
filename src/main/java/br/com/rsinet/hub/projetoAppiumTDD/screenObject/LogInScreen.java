package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class LogInScreen {

	private AndroidDriver<WebElement> driver;

	public LogInScreen(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}
	
	public WebElement Novo_Usuario() {
		WebElement bnt_NovoUsuario = driver.findElementById("com.Advantage.aShopping:id/textViewDontHaveAnAccount");
		return bnt_NovoUsuario;
	}
	
	public WebElement Inserir_Nome_De_Usuario() {
		WebElement txtbn_NickName = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText");
		return txtbn_NickName;
	}
	
	public WebElement Inserir_Senha_De_Usuario() {
		WebElement txtbn_Senha = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText");
		return txtbn_Senha;
	}
}
