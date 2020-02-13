package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MiceScreen {

	private AndroidDriver<MobileElement> driver;

	public MiceScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public MobileElement Produto_1() {
		MobileElement bnt_Produto1 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]");
		return bnt_Produto1;
	}
	
	public MobileElement Produto_2() {
		MobileElement bnt_Produto2 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]");
		return bnt_Produto2;
	}
	
	public MobileElement Produto_3() {
		MobileElement bnt_Produto3 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]");
		return bnt_Produto3;
	}
	
	public MobileElement Produto_4() {
		MobileElement bnt_Produto4 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[4]");
		return bnt_Produto4;
	}
	
	public MobileElement Produto_5() {
		MobileElement bnt_Produto5 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]");
		return bnt_Produto5;
	}
	
	public MobileElement Produto_6() {
		MobileElement bnt_Produto6 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[6]");
		return bnt_Produto6;
	}
	
	public MobileElement Produto_7() {
		MobileElement bnt_Produto7 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]");
		return bnt_Produto7;
	}
	
	public MobileElement Produto_8() {
		MobileElement bnt_Produto8 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]");
		return bnt_Produto8;
	}
	
	public MobileElement Produto_9() {
		MobileElement bnt_Produto9 = driver.findElementByXPath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]");
		return bnt_Produto9;
	}
}
