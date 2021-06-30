package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    @FindBy (xpath ="//div[@title ='VISA']" )
    private WebElement visa;

    @FindBy (xpath = "//div[@title ='MasterCard']")
    private WebElement masterCard;

    @FindBy( xpath = "//div[@title ='Maestro']")
    private WebElement maestro;

    @FindBy( xpath = "//input[@id ='card-number']" )
    private WebElement cardNumber;

    @FindBy( xpath = "//input[@name ='card-expiration-month']" )
    private WebElement cardExpirationMonth;

    @FindBy( xpath = "//input[@name ='card-expiration-year']")
    private WebElement cardExpirationYear;

    @FindBy(xpath = "//input[@name ='card-cvv2']")
    private WebElement cardCvv;


    @FindBy( xpath = "//div[@title='Płacę z Alior Banku']")
    private WebElement aliorBankPayment;

    @FindBy( xpath = "//div[@title='mTransfer']")
    private WebElement mTransfer;

    @FindBy( xpath = "//div[@title='Płacę z iPKO']")
    private WebElement iPKO;

    @FindBy( xpath = "//div[@title='Płacę z ING']")
    private WebElement iNG;

    @FindBy( xpath = "//div[@title='Pekao24Przelew']")
    private WebElement pekaoPrzelew;

    @FindBy( xpath = "//div[@title='Przelew24']")
    private WebElement przelew24;

    @FindBy( xpath = "//div[@title='Millennium Płatności Internetowe']")
    private WebElement millenium;

    @FindBy( xpath = "//div[@title='Credit Agricole eprzelew']")
    private WebElement creditAgricole;

    @FindBy( xpath = "//div[@title='Płacę z Inteligo']")
    private WebElement inteligo;

    @FindBy( xpath = "//div[@title='T-Mobile Usługi Bankowe']")
    private WebElement tMobile;

    @FindBy( xpath = "//div[@title='Płacę z Citi Handlowego']")
    private WebElement cityHandlowy;

    @FindBy( xpath = "//div[@title='e-transfer Pocztowy24']")
    private WebElement pocztowy;

    @FindBy( xpath = "//div[@title='Płać z BOS']")
    private WebElement bOS;

    @FindBy( xpath = "//div[@title='Volkswagen Bank direct']")
    private WebElement volkswagenBank;

    @FindBy( xpath = "//div[@title='Płacę z Plus Bank']")
    private WebElement plus;

    @FindBy( xpath = "//div[@title='Toyota Bank Pay Way']")
    private WebElement toyotaBank;

    @FindBy( xpath = "//div[@title='Płacę z Idea Bank']")
    private WebElement ideaBank;

    @FindBy( xpath = "//div[@title='Kasa Stefczyka']")
    private WebElement stefczyka;

    @FindBy ( xpath = "//div[@class='more-bar more-banks-action']|//div[@class = 'more-bar more-methods-lastpayment-action']") // "//div[@class='more-bar more-banks-action']|//div[@class = 'more-bar more-methods-lastpayment-action']"
    private WebElement moreBanksAction;

    @FindBy ( xpath = "//div[@class='more-bar more-banks-action']")
    private WebElement getMoreBanksActionLastPayment;

    @FindBy(xpath = "//button[@class= 'finish-button active']")
    private WebElement finishButton;

    @FindBy( xpath = "//div[@class='right-child']")
    private WebElement cookies;


    public PaymentPage () {
        PageFactory.initElements(Base.driver, this);
    }

    public void clickVisa(){
        visa.click();
    }

    public void clickMasterCard(){
        masterCard.click();
    }

    public void clickMaestro(){
        maestro.click();
    }

    public void insertCardNumber( String number){
        cardNumber.sendKeys( number );
    }

    public void insertCardExpirationMonth( String string){
        cardExpirationMonth.sendKeys( string );
    }

    public void insertCvv(String string){
        cardCvv.sendKeys(string);
    }

    public void insertCardExpirationYear(String string){
        cardExpirationYear.sendKeys(string);
    }

    public void clickAliorBank(){
        actionPage.scrollToElement(aliorBankPayment);
        aliorBankPayment.click();
    }

    public void clickStefczyka(){
        actionPage.scrollToElement(stefczyka);
        stefczyka.click();
    }

    public void clickIdeaBank(){
        actionPage.scrollToElement(ideaBank);
        ideaBank.click();
    }

    public void clickToyotaBank(){
        actionPage.scrollToElement(toyotaBank);
        toyotaBank.click();
    }

    public void clickVolkswagenBank(){
        actionPage.scrollToElement(volkswagenBank);
        volkswagenBank.click();
    }

    public void clickPlus(){
        actionPage.scrollToElement(plus);
        plus.click();
    }

    public void clickBOS(){
        actionPage.scrollToElement(bOS);
        bOS.click();
    }

    public void clickPocztowy(){
        actionPage.scrollToElement(pocztowy);
        pocztowy.click();
    }

    public void clickTMobile(){
        actionPage.scrollToElement(tMobile);
        tMobile.click();
    }

    public void clickCityHandlowy(){
        actionPage.scrollToElement(cityHandlowy);
        cityHandlowy.click();
    }

    public void clickInteligo(){
        actionPage.scrollToElement(inteligo);
        inteligo.click();
    }

    public void clickCreditAgricole(){
        actionPage.scrollToElement(creditAgricole);
        creditAgricole.click();
    }

    public void clickMillenium(){
        actionPage.scrollToElement(millenium);
        millenium.click();
    }

    public void clickPrzelew24(){
        actionPage.scrollToElement(przelew24);
        przelew24.click();
    }

    public void clickPekaoPrzelew(){
        actionPage.scrollToElement(pekaoPrzelew);
        pekaoPrzelew.click();
    }

    public void clickING(){
        actionPage.scrollToElement(iNG);
        iNG.click();
    }

    public void clickIPKO(){
        actionPage.scrollToElement(iPKO);
        iPKO.click();
    }

    public void clickMTransfer(){
        actionPage.scrollToElement(mTransfer);
        mTransfer.click();
    }

    public void clickMoreBanksAction(){
        try {
            actionPage.scrollToElement(moreBanksAction);
            moreBanksAction.click();
        } catch (Exception e){
            System.out.println(e);
        };

        try {
            getMoreBanksActionLastPayment.click();
        } catch (Exception e){
            System.out.println(e);
        };

    }

    public void clickFinishButton(){
        actionPage.scrollToElement(finishButton);
        finishButton.click();
    }
    public void closeCookies(){

        try{ cookies.click(); }catch (Exception e){
            System.out.println(e);
        };

    }
}