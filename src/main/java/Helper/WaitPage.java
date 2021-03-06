package Helper;

import Pages.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPage {

    WebDriverWait webDriverWait = new WebDriverWait(Base.driver, 7 );

    public void waitUntilElement (WebElement element) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitLong() throws InterruptedException {
        webDriverWait.wait(5000 );
    }
}
