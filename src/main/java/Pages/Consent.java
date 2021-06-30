package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Consent {

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    @FindBy (xpath = "//label[@for ='terms']/div")
    private WebElement termsCheckBox;

    @FindBy (xpath = "//label[@for ='newsletter']/div")
    private WebElement newsletterCheckBox;
    @FindBy(xpath = "//button[@class ='btn btn-primary btn-lg position-relative with-loader w-100']")
    private WebElement summaryButton;


    public Consent() {
        PageFactory.initElements(Base.driver, this);
    }

    public void check(){
        actionPage.scrollToElement(termsCheckBox);
        termsCheckBox.click();
        newsletterCheckBox.click();
    }

    public void clickSummaryButton(){
        summaryButton.click();
    }
}
