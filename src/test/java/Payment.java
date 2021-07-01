import Pages.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.interactions.Actions;

public class Payment extends Base {

    private FormPage formPage = new FormPage();
    private RecipientForm recipientForm = new RecipientForm();
    private Actions actions = new Actions(driver);
    private SenderForm senderForm = new SenderForm();
    private Consent consent = new Consent();
    private SummaryPage summaryPage = new SummaryPage();
    private PaymentPage paymentPage = new PaymentPage();
    private TestBankPage testBankPage = new TestBankPage();
    private TransactionSummaryPage transactionSummaryPage = new TransactionSummaryPage();


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
    @DisplayName("shouldAllowToPayWithMTransferAndConfirmTransaction")
    public void shouldAllowToPayByMTransfer() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickMTransfer();

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }


    @Test
    @DisplayName("shouldAllowToPayWithIPKOAndConfirmTransaction")
    public void shouldAllowToPayByIPKO() throws InterruptedException {

fillAllFormsAndGoToPaymentSite();

paymentPage.clickIPKO();
        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();

        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

    @Test
    @DisplayName("shouldAllowToPayWithINGConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByING() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

            paymentPage.clickING();

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();

        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

    @Test
    @DisplayName("shouldAllowToPayWithPekaoPrzelewConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByPekaoPrzelew() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

            paymentPage.clickPekaoPrzelew();
        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();

        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

    @Test
    @DisplayName("shouldAllowToPayByPrzelew24ConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayBYPrzelew24() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickPrzelew24();
        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();

        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

    @Test
    @DisplayName("shouldAllowToPayByMilleniumConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByMillenium() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickMillenium();
        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();

        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }


    @Test
    @DisplayName("shouldAllowToPayByAliorBankConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByAliorBank() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickAliorBank();
        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();

        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }


    @Test
    @DisplayName("shouldAllowToPayByCreditAgricoleConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByCreditAgricole() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickCreditAgricole();
        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();

        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }


    @Test
    @DisplayName("shouldAllowToPayByInteligoConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByInteligo() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickInteligo();
        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();

        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }


    @Test
    @DisplayName("shouldAllowToPayByTMobileConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByTMobile() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickTMobile();

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

    @Test
    @DisplayName("shouldAllowToPayByCityHandlowyConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByCityHandlowy() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickCityHandlowy();

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }


    @Test
    @DisplayName("shouldAllowToPayByPocztowyConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByPocztowy() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickPocztowy();

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

    @Test
    @DisplayName("shouldAllowToPayByBOSConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByBOS() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickBOS();

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }


    @Test
    @DisplayName("shouldAllowToPayByVolkswagenBankConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByVolkswagenBank() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickVolkswagenBank();

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

    @Test
    @DisplayName("shouldAllowToPayByPlusConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByPlus() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickPlus();

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

    @Test
    @DisplayName("shouldAllowToPayByToyotaBankConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByToyotaBank() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickToyotaBank();

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

    @Test
    @DisplayName("shouldAllowToPayByIdeaBankConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByIdeaBank() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickIdeaBank();

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

    @Test
    @DisplayName("shouldAllowToPayByIStefczykaConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByStefczyka() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickStefczyka();

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }


    @Test
    @DisplayName("shouldAllowToPayByVisaConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByVisa() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickVisa();
        paymentPage.insertCardNumber("4459 9681 0590 5315");
        paymentPage.insertCardExpirationMonth("09");
        paymentPage.insertCardExpirationYear("2021");
        paymentPage.insertCvv("452");
        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }


    @Test
    @DisplayName("shouldAllowToPayByMastercardConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByMasterCard() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickMasterCard();
        paymentPage.insertCardNumber("5580 0895 1955 5775");
        paymentPage.insertCardExpirationMonth("09");
        paymentPage.insertCardExpirationYear("2021");
        paymentPage.insertCvv("317");
        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

    @Test
    @DisplayName("shouldAllowToPayByMaestrocardConfirmTransactionAndDownloudLabel")
    public void shouldAllowToPayByMaestroCard() throws InterruptedException {

        fillAllFormsAndGoToPaymentSite();

        paymentPage.clickMasterCard();
        paymentPage.insertCardNumber("5580 0895 1955 5775");
        paymentPage.insertCardExpirationMonth("09");
        paymentPage.insertCardExpirationYear("2021");
        paymentPage.insertCvv("317");
        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }


    public void fillAllFormsAndGoToPaymentSite() throws InterruptedException {
        formPage.clickParcelHome();
        formPage.clickA();

        recipientForm.fillParcelToHomeRecepiantForm();
        senderForm.fillSenderForm();

        consent.check();
        consent.clickSummaryButton();

        summaryPage.clickPayButton();

        paymentPage.clickMoreBanksAction();
        paymentPage.closeCookies();
    }

    public void confirmTransaction() throws InterruptedException {

        paymentPage.clickFinishButton();

        testBankPage.clickConfirmPayment();

        formPage.clickCookies();
        transactionSummaryPage.checkRefreshButton();
        transactionSummaryPage.clickDownloadLabel();

    }

}