package demo.mtp.SetUp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class SetUp{

	private static AndroidDriver driver;
	
	
 
 public void setup() throws MalformedURLException{
     setUp();
 }

 public AndroidDriver getDriver() {
     return driver;
 
 }
 
 
 public void setUp() throws MalformedURLException {
	 
	  DesiredCapabilities capabilities = new DesiredCapabilities();

	  capabilities.setCapability("deviceName", "cel");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("appPackage", "mx.bancosantander.supermovil");
	  capabilities.setCapability(MobileCapabilityType.APP,"C:\\Santander\\santander.apk");
	  capabilities.setCapability(MobileCapabilityType.UDID, "330031f1356fc21d");
	  capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
	  capabilities.setCapability(MobileCapabilityType.FULL_RESET, "false");

	  //capabilities.setCapability("appActivity", "com.bancomer.mbanking.SplashViewController");

	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  driver.manage().timeouts().implicitlyWait(65, TimeUnit.SECONDS);
	
 }



 public void End() {
 driver.quit();
 }
}




