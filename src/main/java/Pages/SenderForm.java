package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SenderForm {

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();
    @FindBy(xpath ="//app-section[@class = 'col-12 mb-2 mt-30 no-combined title-section']")
    private WebElement senderForm;

    @FindBy(name = "senderAddress.name")
    private WebElement senderName;

    @FindBy(name = "senderAddress.email")
    private WebElement senderEmail;

    @FindBy (name = "senderAddress.phoneNum")
    private WebElement senderPhoneNumber;

    @FindBy ( xpath = "//app-section[@class = 'col-12 col-lg-6 left pb-4 pt-sm-40 sections-combined']")
    private WebElement invoiceCheckMark;

    public SenderForm() {
        PageFactory.initElements(Base.driver, this);
    }

    public void scrolltoSenderForm(){
        actionPage.scrollToElement(senderForm);
    }
    public void fillSenderName(String string){
        senderName.sendKeys(string);
    }

    public void fillSenderEmail(String string){
        senderEmail.sendKeys(string);
    }

    public void fillSenderPhoneNumber(String string){
        senderPhoneNumber.sendKeys(string);
    }
    public void clickInvoiceCHeckMark(){
        invoiceCheckMark.click();
    }

    public void fillSenderForm(){
     scrolltoSenderForm();
      fillSenderName("dpd");
      fillSenderEmail("dpd@email.com");
       fillSenderPhoneNumber("510000000");
    }


}