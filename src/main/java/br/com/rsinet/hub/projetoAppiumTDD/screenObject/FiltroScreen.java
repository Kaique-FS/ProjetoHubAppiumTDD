package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FiltroScreen {

	private AndroidDriver<MobileElement> driver;

	public FiltroScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public MobileElement Adiciona_Filtro() {
		MobileElement bnt_AddFiltro = driver.findElementById("com.Advantage.aShopping:id/imageViewFilter");
		return bnt_AddFiltro;
	}

	public MobileElement Filtrar_Por_Preco() {
		MobileElement bnt_FiltraPreco = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView");
		return bnt_FiltraPreco;
	}
	
	public MobileElement Filtrar_Por_Preco_Valor() {
		MobileElement bnt_ModificaValor = driver.findElementById("com.Advantage.aShopping:id/rangebarFilter");
		return bnt_ModificaValor;
	}
	
	public MobileElement Filtrar_Por_Display() {
		MobileElement bnt_FiltraDisplay = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
		return bnt_FiltraDisplay;
	}
	
	public MobileElement Filtrar_Por_Sistema_Operacional() {
		MobileElement bnt_FiltraSO = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView");
		return bnt_FiltraSO;
	}
	
	public MobileElement Filtrar_Por_Processador() {
		MobileElement bnt_FiltraProcessador = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.TextView");
		return bnt_FiltraProcessador;
	}
	
	public MobileElement Filtrar_Por_Tamanho() {
		MobileElement bnt_FiltraTamanho = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.TextView");
		return bnt_FiltraTamanho;
	}
	
	public MobileElement Filtrar_Por_Cor() {
		MobileElement bnt_FiltraCor = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.LinearLayout[6]/android.widget.LinearLayout/android.widget.TextView");
		return bnt_FiltraCor;
	}
}
