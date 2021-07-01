package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndividualCustomerForm {

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

    @FindBy ( xpath = "//input[@name = 'invoice.individual.companyName']" )
    private WebElement name;

    @FindBy ( name = "invoice.company.companyName" )
    private WebElement companyName;

    @FindBy ( name = "invoice.individual.zipCode" )
    private WebElement zipCode;

    @FindBy ( xpath = "//div[@class = 'ng-dropdown-panel-items scroll-host']" )
    private WebElement town;

    @FindBy ( xpath = "//div[@class = 'ng-dropdown-panel-items scroll-host']")
    private WebElement street;

    @FindBy ( name = "invoice.individual.email" )
    private WebElement email;

    @FindBy ( name = "invoice.individual.buildingNo" )
    private WebElement buildingNo;

    @FindBy ( name = "invoice.individual.flatNo" )
    private WebElement flatNo;


    public IndividualCustomerForm() {
        PageFactory.initElements(Base.driver, this);
    }

    public void fillName(String string){
        name.sendKeys( string );
    }

    public void fillBuildingNo(String string){
        buildingNo.sendKeys( string );
    }

    public void fillFlatNo(String string){
        flatNo.sendKeys( string );
    }

    public void fillEmail(String string){
        email.sendKeys( string );
    }

    public void clickStreet(){
        street.click();
    }

    public void fillZipCode( String string ){
        zipCode.sendKeys("30130");
    }

    public void clickTown(){
        town.click();
    }

}