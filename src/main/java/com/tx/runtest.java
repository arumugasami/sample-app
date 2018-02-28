package com.tx;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class runtest {


	private static RemoteWebDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		 DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			desiredCapabilities.setCapability("deviceName",	 "Nexus");
			desiredCapabilities.setCapability("udid", "00a000c85c98c2b1");
			desiredCapabilities.setCapability("platformVersison", "5.1");
			desiredCapabilities.setCapability("platformName", "Android");
			desiredCapabilities.setCapability("appPackage", "de.taxfix");
			desiredCapabilities.setCapability("appActivity", "de.taxfix.SplashActivity");
			driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Start your tax return']")).click();
			//driver.quit();

	}

}
