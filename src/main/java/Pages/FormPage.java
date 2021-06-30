package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

    @FindBy(css = "[for = parcelSizeA]>span")
    private WebElement parcelSizeA;

    @FindBy(css = "[for = parcelSizeB]>span")
    private WebElement parcelSizeB;

    @FindBy(css = "[for = parcelSizeC]>span")
    private WebElement parcelSizeC;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookies;

    @FindBy(xpath = "//div[@class='col-6 af-arrow-right d-flex flex-column justify-content-md-start justify-content-end min-h-110-mobile']")
    private WebElement parcelHome;

    @FindBy(className = "btn-cookie-trigger")
    private static WebElement cookiesBottomButton;

    public static WebDriver driver;
    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    public FormPage() {
        PageFactory.initElements(Base.driver, this);
    }

    public void clickParcelHome(){
        actionPage.scrollToElement(parcelHome);
        parcelHome.click();
    }

    public void clickC(){
        actionPage.moveToElement(parcelSizeC);
        parcelSizeC.click();
    }

    public void clickB() {
        actionPage.moveToElement(parcelSizeB);
        parcelSizeB.click();
    }

    public FormPage clickA() {
        actionPage.moveToElement(parcelSizeA);
        parcelSizeA.click();
        return this;
    }

    public void clickCookies() {
        waitPage.waitUntilElement(cookies);
        cookies.click();
    }

    public void insertText (String text) {
        parcelSizeC.sendKeys(text);

    }

    public FormPage closeBottomCookiesPopup() {
        waitPage.waitUntilElement(cookiesBottomButton);
        cookiesBottomButton.click();
        return this;
    }
}