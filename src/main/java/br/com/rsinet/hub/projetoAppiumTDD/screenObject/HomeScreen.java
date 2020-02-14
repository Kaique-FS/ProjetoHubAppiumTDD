package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomeScreen {

	private AndroidDriver<WebElement> driver;

	public HomeScreen(AndroidDriver<WebElement>driver) {
		this.driver = driver;
	}
	
	public WebElement bnt_Menu() {
		WebElement bnt_Menu = driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu"));
		//MobileElement bnt_Menu = driver.findElementById("com.Advantage.aShopping:id/imageViewMenu");
		//wait.until(ExpectedConditions.elementToBeClickable(bnt_Menu));
		return bnt_Menu;
	}
	
	public WebElement bnt_LogIn() {
		WebElement bnt_LogIn = driver.findElementById("com.Advantage.aShopping:id/textViewMenuUser");
		return bnt_LogIn;
	}
	
	public WebElement bnt_Cart() {
		WebElement bnt_Cart = driver.findElementById("com.Advantage.aShopping:id/imageViewCart");
		return bnt_Cart;
	}
	
	public WebElement bnt_Lupa() {
		WebElement bnt_Lupa = driver.findElementById("com.Advantage.aShopping:id/imageViewSearch");
		return bnt_Lupa;
	}
	
	public WebElement txtbx_Lupa() {
		WebElement txt_Lupa = driver.findElementById("com.Advantage.aShopping:id/editTextSearch");
		return txt_Lupa;
	}
	
	public WebElement bnt_Laptops() {
		WebElement bnt_Laptops = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView");
		return bnt_Laptops;
	}
	
	public WebElement bnt_Headphones() {
		WebElement bnt_Headphones = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView");
		return bnt_Headphones;
	}
	
	public WebElement bnt_Tablets() {
		WebElement bnt_Tablets = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.ImageView");
		return bnt_Tablets;
	}
	
	public WebElement bnt_Speakers() {
		WebElement bnt_Speakers = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView");
		return bnt_Speakers;
	}
	
	public WebElement bnt_Mice() {
		WebElement bnt_Mice = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView");
		return bnt_Mice;
	}
	
	public WebElement txtbx_Nome_Usuario() {
		WebElement txtbx_NomeUsuario = driver.findElementById("com.Advantage.aShopping:id/textViewMenuUser");
		return txtbx_NomeUsuario;
	}
	
	public WebElement btn_Deslogar() {
		WebElement btn_Deslogar = driver.findElementById("com.Advantage.aShopping:id/textViewMenuSignOut");
		return btn_Deslogar;
	}
}
