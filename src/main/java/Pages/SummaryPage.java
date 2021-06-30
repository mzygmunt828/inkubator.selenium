package Pages;

import Helper.WaitPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {

    WaitPage waitPage = new WaitPage();

    @FindBy(xpath = "//button[@class ='btn btn-primary position-relative with-loader']")
    private WebElement payButton;


    public SummaryPage () {
        PageFactory.initElements(Base.driver, this);
    }

    public void clickPayButton(){
        waitPage.waitUntilElement(payButton);
        payButton.click();
    }




}
