package EX_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EX03_miniProject {


    @Description("login using demo id and verify login")
    @Test
    public void makeAppointment(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("start-maximized");
        WebDriver driver=new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeAppointment=driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        Assert.assertTrue(makeAppointment.isDisplayed());
        makeAppointment.click();
        try{
        Thread.sleep(2000);}
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement userName=driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
        userName.sendKeys("John Doe");
        WebElement password=driver.findElement(By.xpath("//input[@id=\"txt-password\"]"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement loginBtn=driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));;
        loginBtn.click();
        try{
            Thread.sleep(2000);}
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Make Appointment']")).isDisplayed());
        String Title=driver.getTitle();
        System.out.println(Title);
        driver.quit();

    }

}
