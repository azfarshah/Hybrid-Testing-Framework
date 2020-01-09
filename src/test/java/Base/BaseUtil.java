package Base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseUtil {
    public AppiumDriver appDriver;

    public BaseUtil(){
        this.getAppDriver();
    }
    public void getAppDriver() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "R9AMA1038DJ");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 30);
            //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Azfar.Hussain\\Downloads\\Attendance Manager_v1.0.apk");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            appDriver = new AndroidDriver(url, capabilities);
            appDriver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            System.out.println("Opening Appium Server");

        } catch (Exception ex) {
            System.out.println("Cause is : " + ex.getCause());
            System.out.println("Message is : " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}