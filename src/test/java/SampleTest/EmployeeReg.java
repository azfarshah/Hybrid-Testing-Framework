package SampleTest;

import Connection.ConnectionString;
import Pages.EmployeeRegPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmployeeReg extends ConnectionString {

    private EmployeeRegPage empPage;

    public EmployeeReg() {
        empPage = new EmployeeRegPage(this.appDriver);
    }

    //Using this Test Scenario, we can able to Employee Information into te Add Employee Form

    @Test(enabled = false)
    public void enteringEmployeeInformation() {
        appDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support." +
                "v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout")).click();
        appDriver.findElement(By.id("etEmployeeId")).sendKeys("SASTestReg001");
        appDriver.findElement(By.id("etJoiningDate")).sendKeys("1 Nov 2019");
        appDriver.findElement(By.id("etFullName")).sendKeys("SAS Test EmpA");
        appDriver.findElement(By.id("etDesignation")).sendKeys("SAS Test Designation A");
        appDriver.findElement(By.id("etMobileNo")).sendKeys("03362512468");
        appDriver.findElement(By.id("etBasicPay")).sendKeys("30000");
        appDriver.findElement(By.id("etAddress")).sendKeys("SAS Test Address A");
        appDriver.findElement(By.id("imgOther")).click();
    }

    @Test(priority = 1)
    public void whenUserClickTheAddEmployeeTab() {
        empPage.clickAddEmployee();
    }

    @Test(priority = 2)
    public void thenUserEntersEmployeeRegNo() {
        empPage.verifyThenInsertEmployeeRegNo("SASEmpReg001");
    }

    @Test(priority = 3)
    public void thenUserEntersEmployeeDOJ() {
        empPage.verifyThenInsertEmployeeDOJ("08 May 1988");
    }

    @Test(priority = 4)
    public void thenUserEntersEmployeeName() {
        empPage.verifyThenInsertEmployeeName("SAS Test User A");
    }

    @Test(priority = 5)
    public void thenUserEntersEmployeeDesignation() {
        empPage.verifyThenInsertEmployeeDesignation("SAS Test Designation A");
    }

    @Test(priority = 6)
    public void thenUserEntersEmployeePhoneNo() {
        empPage.verifyThenInsertEmployeePhoneNo("03362157048");
    }

    @Test(priority = 7)
    public void thenUserEntersBasicSalary() {
        empPage.verifyThenInsertEmployeeBasicSalary("30000");
    }

    @Test(priority = 8)
    public void thenUserEntersEmployeeAddress() {
        empPage.verifyThenInsertEmployeeAddress("SAS Test Address");
    }

    @Test(priority = 9)
    public void thenUserClicksOnSubmitButton() {
        empPage.verifyThenClickSubmitButton();
    }
}