package EX_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class EX02_VWO {
    @Description
    @Test
    public void testFreeTrialPage(){
        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("start-maximized");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");


    }
}
