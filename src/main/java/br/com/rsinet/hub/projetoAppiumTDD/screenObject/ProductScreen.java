package br.com.rsinet.hub.projetoAppiumTDD.screenObject;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class ProductScreen {

	private AndroidDriver<WebElement> driver;

	public ProductScreen(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}
	
	public WebElement Quantidade() {
		WebElement bnt_Quantidade = driver.findElementById("com.Advantage.aShopping:id/textViewProductQuantity");
		return bnt_Quantidade;
	}
	
	public WebElement Quantidade_Menos() {
		WebElement bnt_QuantidadeMenos = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[1]");
		return bnt_QuantidadeMenos;
	}
	
	public WebElement Quantidade_Mais() {
		WebElement bnt_QuantidadeMais = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[2]");
		return bnt_QuantidadeMais;
	}
	
	public WebElement Cancela_Quantidade() {
		WebElement bnt_CancelaQuantidade = driver.findElementById("com.Advantage.aShopping:id/textViewCancel");
		return bnt_CancelaQuantidade;
	}
	
	public WebElement Aplica_Quantidade() {
		WebElement bnt_AplicaQuantidade = driver.findElementById("com.Advantage.aShopping:id/textViewApply");
		return bnt_AplicaQuantidade;
	}
	
	public WebElement Digita_Quantidade() {
		WebElement btn_MandaQuantidade = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
		return btn_MandaQuantidade;
	}
	
	public WebElement Cor() {
		WebElement bnt_Cor = driver.findElementById("com.Advantage.aShopping:id/frameLayoutProductColor");
		return bnt_Cor;
	}
	
	public WebElement Detalhes() {
		WebElement bnt_Detalhes = driver.findElementById("com.Advantage.aShopping:id/imageViewProductDetails");
		return bnt_Detalhes;
	}
	
	public WebElement Adicionar_No_Carrinho() {
		WebElement bnt_AddCart = driver.findElementById("com.Advantage.aShopping:id/buttonProductAddToCart");
		return bnt_AddCart;
	}
	
	public WebElement Confirma_Produto() {
		WebElement txtbx_ConfirmaProduto = driver.findElementById("com.Advantage.aShopping:id/textViewNoProductsToShow");
		return txtbx_ConfirmaProduto;
	}
	
	public WebElement Valida_Nome_Produto() {
		WebElement txtbx_ValidaNomeProduto = driver.findElementById("com.Advantage.aShopping:id/textViewProductName");
		return txtbx_ValidaNomeProduto;
	}
}
