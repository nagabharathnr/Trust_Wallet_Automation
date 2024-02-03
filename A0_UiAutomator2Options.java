package testClasses;

import java.io.File;

import org.openqa.selenium.By;
//import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import tests.BaseClass;

public class A0_UiAutomator2Options {

	AndroidDriver driver;
	
	public UiAutomator2Options getTrustWalletApkOptions() {
		System.out.println("---started----");
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("builds/TrustWalletAPK.apk").getFile());
		String apkPath = file.getAbsolutePath();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options
			.setPlatformName("Android")
			.setPlatformVersion("12")
			.setAutomationName("UiAutomator2")
			.setDeviceName("SM-G973F/DS")
			.setAppPackage("com.wallet.crypto.trustapp")
			.setAppActivity(".ui.app.AppActivity")
			.setApp("apkPath")
			.setNoReset(false);
		return options;
		
		
	}
	
}
