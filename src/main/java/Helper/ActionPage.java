package Helper;

import Pages.Base;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionPage {


    JavascriptExecutor js = (JavascriptExecutor) Base.driver;
    private Actions actions = new Actions(Base.driver);

    public void moveToElement (WebElement webElement) {
        actions.moveToElement(webElement).build().perform();
    }

    public void scrollToElement (WebElement element){
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void stop() throws InterruptedException {
        actions.wait(1000);
    }

}