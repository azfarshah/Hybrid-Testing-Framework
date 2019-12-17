import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends ConnectionString {

    //Using this Test Scenario, we can able to Employee Information into te Add Employee Form

    @Test(enabled = false)
    public void enteringEmployeeInformation() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support." +
                "v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout")).click();
        driver.findElement(By.id("etEmployeeId")).sendKeys("SASTestReg001");
        driver.findElement(By.id("etJoiningDate")).sendKeys("1 Nov 2019");
        driver.findElement(By.id("etFullName")).sendKeys("SAS Test EmpA");
        driver.findElement(By.id("etDesignation")).sendKeys("SAS Test Designation A");
        driver.findElement(By.id("etMobileNo")).sendKeys("03362512468");
        driver.findElement(By.id("etBasicPay")).sendKeys("30000");
        driver.findElement(By.id("etAddress")).sendKeys("SAS Test Address A");
        driver.findElement(By.id("imgOther")).click();
    }

    @Test(priority = 1)
    public void clickAddEmployee() {
        WebElement addEmployee = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support." +
                "v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout"));
        try{
            Assert.assertTrue(addEmployee.isDisplayed());
            addEmployee.click();
            System.out.println("Clicking on Add Employee Tab");
        }catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    @Test(priority = 2)
    public void verifyThenInsertEmployeeRegNo() {
        WebElement employeeReg = driver.findElement(By.id("etEmployeeId"));
        try {
            Assert.assertTrue(employeeReg.isDisplayed());
            employeeReg.sendKeys("SASTestReg001");
            System.out.println("Inserting Employee Registration Number");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    @Test(priority = 3)
    public void verifyThenInsertEmployeeDOJ() {
        WebElement employeeDOJ = driver.findElement(By.id("etJoiningDate"));
        try {
            Assert.assertTrue(employeeDOJ.isDisplayed());
            employeeDOJ.sendKeys("1 Nov 2019");
            System.out.println("Inserting Employee Date of Joining");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    @Test(priority = 4)
    public void verifyThenInsertEmployeeName() {
        WebElement employeeName = driver.findElement(By.id("etFullName"));
        try {
            Assert.assertTrue(employeeName.isDisplayed());
            employeeName.sendKeys("SAS Test EmpA");
            System.out.println("Inserting Employee Full Name");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    @Test(priority = 5)
    public void verifyThenInsertEmployeeDesignation() {
        WebElement employeeDesignation = driver.findElement(By.id("etDesignation"));
        try {
            Assert.assertTrue(employeeDesignation.isDisplayed());
            employeeDesignation.sendKeys("SAS Test Designation A");
            System.out.println("Inserting Employee Designation");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    @Test(priority = 6)
    public void verifyThenInsertEmployeePhoneNo() {
        WebElement employeeMobileNo = driver.findElement(By.id("etMobileNo"));
        try {
            Assert.assertTrue(employeeMobileNo.isDisplayed());
            employeeMobileNo.sendKeys("03362157046");
            System.out.println("Inserting Employee Mobile Number");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    @Test(priority = 7)
    public void verifyThenInsertEmployeeBasicSalary() {
        WebElement employeeBasicSalary = driver.findElement(By.id("etBasicPay"));
        try {
            Assert.assertTrue(employeeBasicSalary.isDisplayed());
            employeeBasicSalary.sendKeys("50000");
            System.out.println("Inserting Employee Basic Salary");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    @Test(priority = 8)
    public void verifyThenInsertEmployeeAddress(){
        WebElement employeeAddress = driver.findElement(By.id("etAddress"));
        try {
            Assert.assertTrue(employeeAddress.isDisplayed());
            employeeAddress.sendKeys("SAS Test Address A");
            System.out.println("Inserting Employee Address");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }

    @Test(priority = 9)
    public void verifyThenClickSubmitButton() {
        WebElement submitButton = driver.findElement(By.id("imgOther"));
        try {
            Assert.assertTrue(submitButton.isDisplayed());
            submitButton.click();
            System.out.println("Clicking Submit Button");
        } catch (NoSuchElementException ex) {
            System.out.println("No Such Element Found" + ex);
        }
    }
}