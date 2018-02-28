import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AppiumTest {
	
private static AndroidDriver driver;
    
    @BeforeClass
    public static void setUpClass() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		desiredCapabilities.setCapability("deviceName",	 "Nexus");
		desiredCapabilities.setCapability("udid", "00a000c85c98c2b1");
		//desiredCapabilities.setCapability("platformVersison", "5.1");
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appPackage", "de.taxfix");
		desiredCapabilities.setCapability("appActivity", " de.taxfix.ReactFullScreenActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(10000);
               
    }
    
    @AfterClass
    public static void tearDownClass() {
        if (driver != null) {               
            driver.quit();
        }           
    }
    
    @Test
    public void test() throws IOException {
       System.out.println("est");

}
    
}
