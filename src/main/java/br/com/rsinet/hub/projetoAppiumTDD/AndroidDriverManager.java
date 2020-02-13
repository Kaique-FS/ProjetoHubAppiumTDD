package br.com.rsinet.hub.projetoAppiumTDD;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverManager {

	private static AndroidDriver<MobileElement> driver;
	private static DesiredCapabilities capabilities;

	public static AndroidDriver<MobileElement> getDriver() throws Exception {
		return (driver == null) ? AbreAndroid() : driver; 
	}
	
	public static AndroidDriver<MobileElement> AbreAndroid() throws MalformedURLException {
		if (driver == null) {
			capabilities = new DesiredCapabilities();

			capabilities.setCapability("deviceName", "AOSP on IA Emulator");
			// capabilities.setCapability("platformVersion", "9");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("appPackage", "com.Advantage.aShopping");
			capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");

			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		return driver;
	}

	public static AndroidDriver<MobileElement> FechaAndroid() {
		if (driver != null) {
			driver.quit();
		}
		return driver = null;
	}
}
