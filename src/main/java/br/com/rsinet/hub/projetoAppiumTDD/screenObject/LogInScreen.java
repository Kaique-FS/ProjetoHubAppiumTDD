package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LogInScreen {

	private AndroidDriver<MobileElement> driver;

	public LogInScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public MobileElement Novo_Usuario() {
		MobileElement bnt_NovoUsuario = driver.findElementById("com.Advantage.aShopping:id/textViewDontHaveAnAccount");
		return bnt_NovoUsuario;
	}
	
	public MobileElement Inserir_Nome_De_Usuario() {
		MobileElement txtbn_NickName = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText");
		return txtbn_NickName;
	}
	
	public MobileElement Inserir_Senha_De_Usuario() {
		MobileElement txtbn_Senha = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText");
		return txtbn_Senha;
	}
}
