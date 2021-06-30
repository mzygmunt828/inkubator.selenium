package Pages;

import Helper.WaitPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    WebDriverWait webDriverWait = new WebDriverWait(Base.driver, 10);


    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.get("https://test-oneclick-pl.easypack24.net/SzybkieNadania/");

    }

//    @AfterClass
//    public static void tearDown() {
//        driver.quit();
//    }

}