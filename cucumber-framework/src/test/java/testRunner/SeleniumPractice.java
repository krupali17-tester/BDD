package testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class SeleniumPractice {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        //Implicitwait example
        /*

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement element1 = driver.findElement(By.xpath("//button[@id='visibleAfter']"));
        System.out.pri ntln(element1.isDisplayed());
        */



        //Explicit - WebDriverWait examples
      /*
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='visibleAfter']")));
        System.out.println(driver.findElement(By.xpath("//button[@id='visibleAfter']")).isDisplayed());*/


        //Fluent wait which is deprecated

    /*    Wait wait = new FluentWait(driver)
                .withTimeout(45, TimeUnit.SECONDS)
                .pollingEvery(1, TimeUnit.SECONDS)
                .ignoring(Exception.class);

        WebElement foo=wait.until(new Function<driver, WebElement>() {
            public WebElement applyy(WebDriver driver) {
                return driver.findElement(By.id("foo"));
            }
        });*/

        //Fluent functionality in webdriver wait
       /*
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.pollingEvery(500, TimeUnit.MILLISECONDS).ignoring(Throwable.class);

        WebElement element =wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//button[@id='visibleAfter']"));
            }
        });
         System.out.println(element.isDisplayed());
         */


        driver.quit();
    }
}
