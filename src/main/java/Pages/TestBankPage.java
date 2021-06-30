package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestBankPage {

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    @FindBy (xpath = "//button[@value= '1']")
    private WebElement confirmPayment;

    public TestBankPage () {
        PageFactory.initElements(Base.driver, this);
    }

    public void clickConfirmPayment(){
        waitPage.waitUntilElement(confirmPayment);
        confirmPayment.click();
    }


}
