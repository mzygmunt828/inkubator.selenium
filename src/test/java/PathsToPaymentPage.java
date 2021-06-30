import Pages.*;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.interactions.Actions;

import Pages.*;
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
    public void EasyPathWithSizeA(){

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
    public void EasyPathWithSizeB(){

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
    public void EasyPathWithSizeC() {

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
    public void EasyParcelToHomePathWithSizeA() {

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
    public void EasyParcelToHomePathWithSizeB() {

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
    public void EasyParcelToHomePathWithSizeC() {

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
    public void companyInPolandInvoice () {

        formPage.clickParcelHome();
        formPage.clickC();

        recipientForm.fillParcelToHomeRecepiantForm();
        senderForm.fillSenderForm();

        senderForm.clickInvoiceCHeckMark();

        senderForm.ClickCompanyInPoland();

        senderForm.fillNipCode("6793087624");

        senderForm.fillCompanyFlatNo("2");

        senderForm.fillCompanyEmail(" inpost@inpost.pl");

        consent.check();

        consent.clickSummaryButton();

        summaryPage.clickPayButton();

        paymentPage.clickVisa();

    }

}