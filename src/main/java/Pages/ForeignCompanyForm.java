package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ForeignCompanyForm {

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();


    @FindBy ( name = "invoice.foreignCompany.nip" )
    private WebElement foreignNipPrefix;

    @FindBy ( name = "invoice.foreignCompany.nip" )
    private WebElement foreignNipNumber;

    @FindBy ( name = "invoice.foreignCompany.companyName" )
    private WebElement foreignName;

    @FindBy ( xpath = "/html/body/app-root/app-public-layout/div/div[2]/app-home/section/div[2]/div[4]/div/app-parcel-form/div/div/div[1]/app-dynamic-form/form/app-section[22]/div/app-input/div/div/div/app-complex-select/ng-select/div/div/div[3]/input")
    private WebElement countryOne;

    @FindBy ( xpath = "/html/body/app-root/app-public-layout/div/div[2]/app-home/section/div[2]/div[4]/div/app-parcel-form/div/div/div[1]/app-dynamic-form/form/app-section[27]/div/app-input/div/div/div/app-complex-select/ng-select/ng-dropdown-panel/div/div[2]/div[1]/span" )
    private WebElement country;

    @FindBy ( name = "invoice.foreignCompany.zipCode" )
    private WebElement foreignZipCode;

    @FindBy ( name = "invoice.foreignCompany.town" )
    private WebElement foreignTown;

    @FindBy ( name = "invoice.foreignCompany.street")
    private WebElement foreignStreet;

    @FindBy ( name = "invoice.foreignCompany.email" )
    private WebElement foreignEmail;

    @FindBy ( name = "invoice.foreignCompany.buildingNo" )
    private WebElement foreignBuildingNo;

    @FindBy ( name = "invoice.foreignCompany.flatNo" )
    private WebElement foreignFlatNo;

    public ForeignCompanyForm() {
        PageFactory.initElements(Base.driver, this);
    }

    public void fillCompanyName(String string){
        foreignName.sendKeys( string );
    }

    public void fillNipNumber(String string){
        foreignNipNumber.sendKeys( string );
    }

    public void clickCountry(){
        countryOne.click();
        waitPage.waitUntilElement(country);
        country.click();
    }

    public void fillNipCode(){
        foreignNipPrefix.click();
    }

    public void fillCompanyBuildingNo(String string){
        foreignBuildingNo.sendKeys( string );
    }

    public void fillCompanyFlatNo(String string){
        foreignFlatNo.sendKeys( string );
    }

    public void fillCompanyEmail(String string){
        foreignEmail.sendKeys( string );
    }

    public void fillStreet(String string){
        foreignStreet.sendKeys(string);
    }

    public void fillZipCode( String string ){
        foreignZipCode.sendKeys("30130");
    }

    public void fillTown( String string){
        foreignTown.sendKeys( string );
    }

    public void fillFlatNo( String string ){
        foreignFlatNo.sendKeys("3");
    }

    public void fillBuildingNo( String string ){
        foreignBuildingNo.sendKeys("2");
    }




}
