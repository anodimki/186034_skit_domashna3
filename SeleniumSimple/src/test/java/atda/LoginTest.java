package atda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import po.LoginPage;
import po.ProductPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = getDriver();
    }

    private WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anodi\\OneDrive\\Documents\\Downloads\\chromedriver_win32\\chromedriver.exe");
        return new ChromeDriver();
    }
    @Test
    public void Facebooklogin()
    {
        driver.get("https://www.facebook.com/");
        final WebElement email=driver.findElement(By.id("email"));
        final WebElement password=driver.findElement(By.id("pass"));
        final WebElement button=driver.findElement(By.name("login"));
        email.sendKeys("andrej");
        password.sendKeys("anodimki");
        button.click();
    }
    @Test
    public void Facebooklogin1()
    {
        driver.get("https://www.facebook.com/");
        final WebElement email=driver.findElement(By.id("email"));
        final WebElement password=driver.findElement(By.id("pass"));
        final WebElement button=driver.findElement(By.name("login"));
        email.sendKeys("");
        password.sendKeys("anodimki");
        button.click();
    }
    @Test
    public void Facebooklogin2()
    {
        driver.get("https://www.facebook.com/");
        final WebElement email=driver.findElement(By.id("email"));
        final WebElement password=driver.findElement(By.id("pass"));
        final WebElement button=driver.findElement(By.name("login"));
        email.sendKeys("ano.dimitrievski@hotmail.com");
        password.sendKeys("Anodimki1<");
        button.click();
    }
    @AfterTest
    public void teardown() {
        driver.quit();
    }

}
