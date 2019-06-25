import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class exampleTest {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
    }

    @Test
    public void exampleTest() {
        driver.get("https://www.favorit.com.ua/uk/bets/#");

        driver.findElement(By.xpath("//button[@class='but-blue-1 loginpagecl']")).click();

        driver.findElement(By.xpath("//button[@class='show_password']")).click();     //This path is used only after you have already saved the element

        driver.findElement(By.xpath(ta("Favorit:SingIn:Password:without_showPassword","//input[@id='password']"))).sendKeys("123");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
