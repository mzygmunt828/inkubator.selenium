package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CompanyInPolandForm {

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    @FindBy ( xpath = "//label[@for = 'legalStatuscompany']")
    private WebElement companyInPolandCheckMark;

    @FindBy ( name = "invoice.company.nip" )
    private WebElement nipNumber;

    @FindBy ( name = "invoice.company.companyName" )
    private WebElement companyName;

    @FindBy ( name = "invoice.company.zipCode" )
    private WebElement zipCode;

    @FindBy ( xpath = "//div[@class = 'ng-dropdown-panel-items scroll-host']" )
    private WebElement companyTown;

    @FindBy ( xpath = "//div[@class = 'ng-dropdown-panel-items scroll-host']")
    private WebElement companyStreet;

    @FindBy ( name = "invoice.company.email" )
    private WebElement companyEmail;

    @FindBy ( name = "invoice.company.buildingNo" )
    private WebElement companyBuildingNo;

    @FindBy ( name = "invoice.company.flatNo" )
    private WebElement companyFlatNo;

    public CompanyInPolandForm() {
        PageFactory.initElements(Base.driver, this);
    }


    public void fillCompanyName(String string){
        companyName.sendKeys( string );
    }

    public void fillNipCode(String string){
        nipNumber.sendKeys( string );
    }

    public void fillCompanyBuildingNo(String string){
        companyBuildingNo.sendKeys( string );
    }

    public void fillCompanyFlatNo(String string){
        companyFlatNo.sendKeys( string );
    }

    public void fillCompanyEmail(String string){
        companyEmail.sendKeys( string );
    }

    public void clickStreet(){
        companyStreet.click();
    }

    public void fillZipCode( String string ){
        zipCode.sendKeys("30130");
    }

    public void clickTown(){
        companyTown.click();
    }

}
