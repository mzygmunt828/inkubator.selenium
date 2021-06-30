package Pages;

import Helper.ActionPage;
import Helper.WaitPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionSummaryPage {

    ActionPage actionPage = new ActionPage();
    WaitPage waitPage = new WaitPage();

@FindBy(xpath = "//button[@class='btn btn-default btn-sm']")
private WebElement downloadLabel;

@FindBy(xpath = "//button[@class='btn btn-primary position-relative with-loader']" )
private WebElement refreshButton;

@FindBy( xpath = "//div[@class = 'text-wrapper longText']/span" )
private WebElement headline;
    public TransactionSummaryPage () {
        PageFactory.initElements(Base.driver, this);
    }


    public void clickRefreshButton(){
        refreshButton.click();
    }

    public void clickDownloadLabel(){
        actionPage.scrollToElement(downloadLabel);
        downloadLabel.click();
    }

    public void checkRefreshButton() throws InterruptedException {
        try {
            int count = 0;

            while (refreshButton.getText().equals("Odśwież")) {
                clickRefreshButton();
                waitPage.waitLong();
                System.out.println(count);
                count++;
                if (count >= 5) {
                    break;
                }
            }

        } catch (Exception e) {
        }
    }
}