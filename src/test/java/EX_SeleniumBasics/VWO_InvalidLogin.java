package EX_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VWO_InvalidLogin {


    @Description("Verify invalid Login")
    @Test (testName = "TC1-Verify invalid Login")
    public void test_InvalidLogin() throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");
        //enter unregistered email
        WebElement emailAddress=driver.findElement(By.id("login-username"));
        emailAddress.sendKeys("admin@admin.com");
        //enter invalid password
        WebElement Password=driver.findElement(By.id("login-password"));
        Password.sendKeys("admin");
        WebElement loginbtn=driver.findElement(By.id("js-login-btn"));
        loginbtn.click();
        Thread.sleep(3000);
        String errorMessage=driver.findElement(By.id("js-notification-box-msg")).getText();
        Assert.assertEquals(errorMessage ,"Your email, password, IP address or location did not match");

        driver.quit();


    }
}
