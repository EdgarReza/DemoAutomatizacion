package demo.mtp.SetUp;

import io.appium.java_client.android.AndroidDriver;

public class Driver extends SetUp {
	
	protected AndroidDriver driver;

    public Driver() {
        this.driver = super.getDriver();
    }

}


