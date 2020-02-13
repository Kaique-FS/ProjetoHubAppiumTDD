package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ProductScreen {

	private AndroidDriver<MobileElement> driver;

	public ProductScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public MobileElement Quantidade() {
		MobileElement bnt_Quantidade = driver.findElementById("com.Advantage.aShopping:id/textViewProductQuantity");
		return bnt_Quantidade;
	}
	
	public MobileElement Quantidade_Menos() {
		MobileElement bnt_QuantidadeMenos = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[1]");
		return bnt_QuantidadeMenos;
	}
	
	public MobileElement Quantidade_Mais() {
		MobileElement bnt_QuantidadeMais = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[2]");
		return bnt_QuantidadeMais;
	}
	
	public MobileElement Cancela_Quantidade() {
		MobileElement bnt_CancelaQuantidade = driver.findElementById("com.Advantage.aShopping:id/textViewCancel");
		return bnt_CancelaQuantidade;
	}
	
	public MobileElement Aplica_Quantidade() {
		MobileElement bnt_AplicaQuantidade = driver.findElementById("com.Advantage.aShopping:id/textViewApply");
		return bnt_AplicaQuantidade;
	}
	
	public MobileElement Digita_Quantidade() {
		MobileElement btn_MandaQuantidade = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
		return btn_MandaQuantidade;
	}
	
	public MobileElement Cor() {
		MobileElement bnt_Cor = driver.findElementById("com.Advantage.aShopping:id/frameLayoutProductColor");
		return bnt_Cor;
	}
	
	public MobileElement Detalhes() {
		MobileElement bnt_Detalhes = driver.findElementById("com.Advantage.aShopping:id/imageViewProductDetails");
		return bnt_Detalhes;
	}
	
	public MobileElement Adicionar_No_Carrinho() {
		MobileElement bnt_AddCart = driver.findElementById("com.Advantage.aShopping:id/buttonProductAddToCart");
		return bnt_AddCart;
	}
	
	public MobileElement Confirma_Produto() {
		MobileElement txtbx_ConfirmaProduto = driver.findElementById("com.Advantage.aShopping:id/textViewNoProductsToShow");
		return txtbx_ConfirmaProduto;
	}
	
	public MobileElement Valida_Nome_Produto() {
		MobileElement txtbx_ValidaNomeProduto = driver.findElementById("com.Advantage.aShopping:id/textViewProductName");
		return txtbx_ValidaNomeProduto;
	}
}
