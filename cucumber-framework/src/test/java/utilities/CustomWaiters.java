package utilities;

import elements.EabyAdvancedSearch_Elements;
import org.openqa.selenium.WebDriver;
import steps.Common_Steps;

public class CustomWaiters {

    private WebDriver driver;


    public CustomWaiters(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
    }
}
