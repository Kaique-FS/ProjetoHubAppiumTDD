package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomeScreen {

	private AndroidDriver<MobileElement> driver;

	public HomeScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public MobileElement bnt_Menu() {
		MobileElement bnt_Menu = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
		//MobileElement bnt_Menu = driver.findElementById("com.Advantage.aShopping:id/imageViewMenu");
		//wait.until(ExpectedConditions.elementToBeClickable(bnt_Menu));
		return bnt_Menu;
	}
	
	public MobileElement bnt_LogIn() {
		MobileElement bnt_LogIn = driver.findElementById("com.Advantage.aShopping:id/textViewMenuUser");
		return bnt_LogIn;
	}
	
	public MobileElement bnt_Cart() {
		MobileElement bnt_Cart = driver.findElementById("com.Advantage.aShopping:id/imageViewCart");
		return bnt_Cart;
	}
	
	public MobileElement bnt_Lupa() {
		MobileElement bnt_Lupa = driver.findElementById("com.Advantage.aShopping:id/imageViewSearch");
		return bnt_Lupa;
	}
	
	public MobileElement txtbx_Lupa() {
		MobileElement txt_Lupa = driver.findElementById("com.Advantage.aShopping:id/editTextSearch");
		return txt_Lupa;
	}
	
	public MobileElement bnt_Laptops() {
		MobileElement bnt_Laptops = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView");
		return bnt_Laptops;
	}
	
	public MobileElement bnt_Headphones() {
		MobileElement bnt_Headphones = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView");
		return bnt_Headphones;
	}
	
	public MobileElement bnt_Tablets() {
		MobileElement bnt_Tablets = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.ImageView");
		return bnt_Tablets;
	}
	
	public MobileElement bnt_Speakers() {
		MobileElement bnt_Speakers = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView");
		return bnt_Speakers;
	}
	
	public MobileElement bnt_Mice() {
		MobileElement bnt_Mice = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView");
		return bnt_Mice;
	}
	
	public MobileElement txtbx_Nome_Usuario() {
		MobileElement txtbx_NomeUsuario = driver.findElementById("com.Advantage.aShopping:id/textViewMenuUser");
		return txtbx_NomeUsuario;
	}
	
	public MobileElement btn_Deslogar() {
		MobileElement btn_Deslogar = driver.findElementById("com.Advantage.aShopping:id/textViewMenuSignOut");
		return btn_Deslogar;
	}
}
