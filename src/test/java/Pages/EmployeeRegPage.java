package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class EmployeeRegPage {

    public EmployeeRegPage(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView")
    public WebElement addEmployee;

    @AndroidFindBy(id = "etEmployeeId")
    public WebElement employeeReg;

    @AndroidFindBy(id = "etJoiningDate")
    public WebElement employeeDOJ;

    @AndroidFindBy(id = "etFullName")
    public WebElement employeeName;

    @AndroidFindBy(id = "etDesignation")
    public WebElement employeeDesignation;

    @AndroidFindBy(id = "etMobileNo")
    public WebElement employeeMobileNo;

    @AndroidFindBy(id = "etBasicPay")
    public WebElement employeeBasicSalary;

    @AndroidFindBy(id = "etAddress")
    public WebElement employeeAddress;

    @AndroidFindBy(id = "imgOther")
    public WebElement submitButton;

    public void clickAddEmployee() {
        try {
            Assert.assertTrue(addEmployee.isDisplayed());
            addEmployee.click();
            System.out.println("Clicking on Add Employee Tab");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    public void verifyThenInsertEmployeeRegNo(String empRegNo) {
        try {
            Assert.assertTrue(employeeReg.isDisplayed());
            employeeReg.sendKeys(empRegNo);
            System.out.println("Inserting Employee Registration Number");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    public void verifyThenInsertEmployeeDOJ(String empDOJ) {
        try {
            Assert.assertTrue(employeeDOJ.isDisplayed());
            employeeDOJ.sendKeys(empDOJ);
            System.out.println("Inserting Employee Date of Joining");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    public void verifyThenInsertEmployeeName(String empName) {
        try {
            Assert.assertTrue(employeeName.isDisplayed());
            employeeName.sendKeys(empName);
            System.out.println("Inserting Employee Full Name");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    public void verifyThenInsertEmployeeDesignation(String empDesignation) {
        try {
            Assert.assertTrue(employeeDesignation.isDisplayed());
            employeeDesignation.sendKeys(empDesignation);
            System.out.println("Inserting Employee Designation");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    public void verifyThenInsertEmployeePhoneNo(String empMobileNo) {
        try {
            Assert.assertTrue(employeeMobileNo.isDisplayed());
            employeeMobileNo.sendKeys(empMobileNo);
            System.out.println("Inserting Employee Mobile Number");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    public void verifyThenInsertEmployeeBasicSalary(String empSalary) {
        try {
            Assert.assertTrue(employeeBasicSalary.isDisplayed());
            employeeBasicSalary.sendKeys(empSalary);
            System.out.println("Inserting Employee Basic Salary");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    public void verifyThenInsertEmployeeAddress(String empAddress) {
        try {
            Assert.assertTrue(employeeAddress.isDisplayed());
            employeeAddress.sendKeys(empAddress);
            System.out.println("Inserting Employee Address");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    public void verifyThenClickSubmitButton() {
        try {
            Assert.assertTrue(submitButton.isDisplayed());
            submitButton.click();
            System.out.println("Clicking Submit Button");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }
}
