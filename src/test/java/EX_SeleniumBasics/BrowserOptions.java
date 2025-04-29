package EX_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserOptions {

    @Description("Verify options")
    @Test
    public void test_browser(){
        EdgeOptions edgeOpt=new EdgeOptions();
        edgeOpt.addArguments("-headless");


        EdgeDriver driver=new EdgeDriver(edgeOpt);
        driver.get("https://app.vwo.com/#/login");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();

   }
}
