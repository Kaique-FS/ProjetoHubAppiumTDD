package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class MiceScreen {

	private AndroidDriver<WebElement> driver;

	public MiceScreen(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}
	
	public WebElement Produto_1() {
		WebElement bnt_Produto1 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]");
		return bnt_Produto1;
	}
	
	public WebElement Produto_2() {
		WebElement bnt_Produto2 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]");
		return bnt_Produto2;
	}
	
	public WebElement Produto_3() {
		WebElement bnt_Produto3 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]");
		return bnt_Produto3;
	}
	
	public WebElement Produto_4() {
		WebElement bnt_Produto4 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[4]");
		return bnt_Produto4;
	}
	
	public WebElement Produto_5() {
		WebElement bnt_Produto5 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]");
		return bnt_Produto5;
	}
	
	public WebElement Produto_6() {
		WebElement bnt_Produto6 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[6]");
		return bnt_Produto6;
	}
	
	public WebElement Produto_7() {
		WebElement bnt_Produto7 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]");
		return bnt_Produto7;
	}
	
	public WebElement Produto_8() {
		WebElement bnt_Produto8 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]");
		return bnt_Produto8;
	}
	
	public WebElement Produto_9() {
		WebElement bnt_Produto9 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]");
		return bnt_Produto9;
	}
}
