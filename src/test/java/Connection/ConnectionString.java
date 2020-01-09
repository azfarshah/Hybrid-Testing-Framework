package Connection;

import Base.BaseUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

public class ConnectionString  extends BaseUtil {

    //region Appium Driver
    /*#############################################################################################################
    # AppiumDriver : It inherits from the RemoteWebDriver and adds functions that are handy for mobile automation.#
    # It can be used to automate both Android and iOS apps; however, it lacks device family-specific functions.   #
    # The direct subclasses are AndroidDriver , IOSDriver , and WindowsDriver                                     #
    #############################################################################################################*/
    //public AppiumDriver driver;
    //endregion

    public ConnectionString(){
    }
    //region Setup Method

    /*##############################################################################################################
    # Setup Method : This method is used to define the Desired Capabilities. Desired Capabilities is a class used  #
    # to declare a set of basic requirements such as combinations of browsers, operating systems, browser versions #
    # Device Platform Name, Platform Version, Device Name etc.                                                     #
    ##############################################################################################################*/
    /*
    @BeforeClass
    public void setUp() {
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
     */
    //endregion

    //region TearDown Method
    /*###################################################################################################
    # Teardown blocks registered during a test method's execution are run after that test method ends,  #
    # before the tearDown() instance method is called. tearDown() class method to perform final cleanup #
    # after all test methods complete.                                                                  #
    ###################################################################################################*/
    @AfterClass
    public void TearDownTest() {
        try {
            appDriver.quit();
            System.out.println("Now Application Quit the Appium Driver");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //endregion
}
