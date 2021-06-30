package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipientForm {

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    @FindBy( xpath = "//app-section[@class='col-12 col-lg-12 left mobile right sections-combined top']")
    private WebElement recipientForm;

    @FindBy( xpath = "//input[@name='targetAddress.name']")
    private WebElement targetName;

    @FindBy( xpath = "//input[@name='addresseeEmail']")
    private WebElement targetEmail;

    @FindBy( xpath = "//input[@name='phoneNumber']")
    private WebElement targetphoneNumber;

    @FindBy( xpath = "//input[@name='targetAddress.zipCode']")
    private WebElement targetZipCode;

    @FindBy( xpath = "//div[@class = 'ng-dropdown-panel-items scroll-host']")
    private WebElement targetCity;

    @FindBy( xpath = "//div[@class = 'ng-dropdown-panel-items scroll-host']/div/div")
    private WebElement targetStreet;

    @FindBy(xpath = "//input[@name = 'targetAddress.buildingNo']")
    private WebElement enterBuildingNo;

    @FindBy(xpath = "//input[@name = 'targetAddress.flatNo']")
    private WebElement enterFlatNo;

    @FindBy(xpath = "//div[@role = 'combobox']/input")
    private WebElement parcel;

    @FindBy (xpath = "//div[@class = 'scrollable-content']")
    private WebElement parcelList;

    @FindBy (xpath = "//div[@class = 'scrollable-content']/div")
    private WebElement listElement;

    public RecipientForm() {
        PageFactory.initElements(Base.driver, this);
    }

    public void scrollToRecipientForm(){
        actionPage.scrollToElement(recipientForm);
    }

    public void fillTrgetName( String string){
        targetName.sendKeys(string);
    }

    public void fillTrgetEmail( String string){
        targetEmail.sendKeys(string);
    }

    public void fillTrgetPhoneNumber( String string){
        targetphoneNumber.sendKeys(string);
    }

    public void fillTrgetZipCode( String string){
        targetZipCode.sendKeys(string);
    }

    public void clickCity( ){
        waitPage.waitUntilElement(targetCity);
        targetCity.click();
    }

    public void clickStreet(){
        targetStreet.click();
    }

    public void fillEnterBuildingNo( String string){
        enterBuildingNo.sendKeys(string);
    }

    public void fillEnterFlatNo( String string){
        enterFlatNo.sendKeys(string);
    }

    public void fillParcel(String string){
        parcel.sendKeys(string);
        waitPage.waitUntilElement(parcelList);
        listElement.click();
    }


    public void fillParcelToHomeRecepiantForm(){

        scrollToRecipientForm();
        fillTrgetName("inpost");
        fillTrgetEmail("inpost@mail.com");
        fillTrgetPhoneNumber("500 000 000");
        fillTrgetZipCode("30-130");
        clickCity();
        clickStreet();
        fillEnterBuildingNo("3");
        fillEnterFlatNo("2");

    }

    public void fillParcelToParcelRecepiantForm(){

        scrollToRecipientForm();
        fillTrgetName("inpost");
        fillTrgetEmail("inpost@email.com");
        fillTrgetPhoneNumber("500 000 000");
        fillParcel("kra");

    }


}