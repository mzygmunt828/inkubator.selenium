import Pages.*;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.interactions.Actions;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class PathsToPaymentPage extends Base{

        private FormPage formPage = new FormPage();
        private RecipientForm recipientForm = new RecipientForm();
        private Actions actions = new Actions(driver);
        private SenderForm senderForm = new SenderForm();
        private Consent consent = new Consent();
        private SummaryPage summaryPage = new SummaryPage();
        private PaymentPage paymentPage = new PaymentPage();
        private CompanyInPolandForm companyInPolandForm = new CompanyInPolandForm();
        private IndividualCustomerForm individualCustomerForm = new IndividualCustomerForm();
        private ForeignCompanyForm foreignCompanyForm = new ForeignCompanyForm();


    @Before
    public void closeCookies() {
        Base.driver.navigate().to("https://test-oneclick-pl.easypack24.net/SzybkieNadania/");
        Base.driver.manage().deleteAllCookies();
        formPage.clickCookies();
        try {
            formPage.closeBottomCookiesPopup();
        } catch (Exception e) {
        }
        ;
    }


    @Test
    @Tag("ParcelToParcel")
    public void EasyParcelToParcelPathWithSizeA() throws InterruptedException {

        formPage.clickA();

        recipientForm.fillParcelToParcelRecepiantForm();

        senderForm.fillSenderForm();

        consent.check();

        consent.clickSummaryButton();
        summaryPage.clickPayButton();
        paymentPage.clickVisa();

    }

    @Test
    @Tag("ParcelToParcel")
    public void EasyParcelToParcelPathWithSizeB() throws InterruptedException {

        formPage.clickB();

        recipientForm.fillParcelToParcelRecepiantForm();

        senderForm.fillSenderForm();

        consent.check();

        consent.clickSummaryButton();
        summaryPage.clickPayButton();
        paymentPage.clickVisa();

    }

    @Test
    @Tag("ParcelToParcel")
    public void EasyParcelToParcelPathWithSizeC() throws InterruptedException {

        formPage.clickC();

        recipientForm.fillParcelToParcelRecepiantForm();

        senderForm.fillSenderForm();

        consent.check();

        consent.clickSummaryButton();
        summaryPage.clickPayButton();
        paymentPage.clickVisa();

    }

    @Test
    @Tag("ParcelToHome")
    public void EasyParcelToHomePathWithSizeA() throws InterruptedException {

        formPage.clickParcelHome();

        formPage.clickA();

        recipientForm.fillParcelToHomeRecepiantForm();

        senderForm.fillSenderForm();

        consent.check();

        consent.clickSummaryButton();
        summaryPage.clickPayButton();
        paymentPage.clickVisa();

    }

    @Test
    @Tag("ParcelToHome")
    public void EasyParcelToHomePathWithSizeB() throws InterruptedException {

        formPage.clickParcelHome();

        formPage.clickB();

        recipientForm.fillParcelToHomeRecepiantForm();

        senderForm.fillSenderForm();

        consent.check();

        consent.clickSummaryButton();
        summaryPage.clickPayButton();
        paymentPage.clickVisa();

    }

    @Test
    @Tag("ParcelToHome")
    public void EasyParcelToHomePathWithSizeC() throws InterruptedException {

        formPage.clickParcelHome();

        formPage.clickC();

        recipientForm.fillParcelToHomeRecepiantForm();

        senderForm.fillSenderForm();

        consent.check();

        consent.clickSummaryButton();

        summaryPage.clickPayButton();

        paymentPage.clickVisa();

    }

    @Test
    @Tag("InvoicePath")
    @DisplayName("CompanyInPolandInvoicePath")
    public void companyInPolandInvoice () throws InterruptedException {

        formPage.clickParcelHome();
        formPage.clickC();

        recipientForm.fillParcelToHomeRecepiantForm();
        senderForm.fillSenderForm();

        senderForm.clickInvoiceCHeckMark();

        senderForm.ClickCompanyInPoland();

        companyInPolandForm.fillCompanyName(" inpostt");

        companyInPolandForm.fillZipCode("30130");

        companyInPolandForm.clickTown();

        companyInPolandForm.clickStreet();

        companyInPolandForm.fillCompanyBuildingNo("3");

        companyInPolandForm.fillCompanyFlatNo("2");

        companyInPolandForm.fillCompanyEmail(" inpost@inpost.pl");

        companyInPolandForm.fillNipCode("6793087624");

        consent.check();

        consent.clickSummaryButton();

        summaryPage.clickPayButton();

        paymentPage.clickVisa();

    }

    @Test
    @Tag("InvoicePath")
    @DisplayName("individualCustomerInvoicePath")
    public void individualCustomerInvoice () throws InterruptedException {

        formPage.clickParcelHome();
        formPage.clickC();

        recipientForm.fillParcelToHomeRecepiantForm();

        senderForm.fillSenderForm();

        senderForm.clickInvoiceCHeckMark();

        senderForm.clickIndividualCustomerCheckMark();

        individualCustomerForm.fillName("inpost");

        individualCustomerForm.fillZipCode("30130");

        individualCustomerForm.clickTown();

        individualCustomerForm.clickStreet();

        individualCustomerForm.fillBuildingNo("3");

        individualCustomerForm.fillFlatNo("2");

        individualCustomerForm.fillEmail(" inpost@inpost.pl");

        consent.check();

        consent.clickSummaryButton();

        summaryPage.clickPayButton();

        paymentPage.clickVisa();

    }

    @Test
    @Tag("InvoicePath")
    @DisplayName("ForeignCompanyInvoice")
    public void ForeignCompanyInvoice () throws InterruptedException {

        formPage.clickParcelHome();
        formPage.clickC();

        recipientForm.fillParcelToHomeRecepiantForm();
        senderForm.fillSenderForm();

        senderForm.clickInvoiceCHeckMark();

        senderForm.clickForeignCompanyCheckMark();

        foreignCompanyForm.fillCompanyName("bilbao");

        foreignCompanyForm.fillNipCode();

       // foreignCompanyForm.clickCountry();

        foreignCompanyForm.fillZipCode("12432");

        foreignCompanyForm.fillTown(" njuJork");

        foreignCompanyForm.fillStreet(" Krakowska ");

        foreignCompanyForm.fillBuildingNo("2");

        foreignCompanyForm.fillCompanyFlatNo("12");

        foreignCompanyForm.fillCompanyEmail(" małpa@szynpans.goryl");

        consent.check();

        consent.clickSummaryButton();

        summaryPage.clickPayButton();

        paymentPage.clickVisa();
    }
}