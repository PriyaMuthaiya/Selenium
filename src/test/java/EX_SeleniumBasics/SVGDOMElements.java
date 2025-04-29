package EX_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static EX_SeleniumBasics.CommonMethods.JVMwait;

public class SVGDOMElements {

    @Test
    public static void Handle_SVG(){
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();
        JVMwait(2000);
        List<WebElement> states=driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));

        for(WebElement state:states){

            if(state.getDomAttribute("aria-label").contains("Tamil Nadu")){
                state.click();
                if(state.getDomAttribute("fill").contains("#CC0000")){
                    System.out.println("pass");
                }
               // Assert.assertEquals("#CC0000","#CC0000");
                JVMwait(2000);
            }
        }

    }
}
