package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class HeadphonesScreen {


	private AndroidDriver<WebElement> driver;

	public HeadphonesScreen(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}
	
	public WebElement Produto_1() {
		WebElement bnt_Produto1 = driver.findElementByXPath("android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]");
		return bnt_Produto1;
	}
	
	public WebElement Produto_2() {
		WebElement bnt_Produto2 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]");
		return bnt_Produto2;
	}
	
	public WebElement Produto_3() {
		WebElement bnt_Produto3 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]");
		return bnt_Produto3;
	}
	
	public WebElement Produto_4() {
		WebElement bnt_Produto4 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Headphones\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[4]");
		return bnt_Produto4;
	}
}
