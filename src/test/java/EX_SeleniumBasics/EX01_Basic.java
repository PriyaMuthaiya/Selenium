package EX_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EX01_Basic {

    @Description("Verify VWO title")
    @Test
    public void test_Login(){
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();

   }
}
