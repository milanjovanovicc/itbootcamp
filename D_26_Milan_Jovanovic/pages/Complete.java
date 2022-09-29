package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Complete extends BasePage{

    private By completePurchaseMessage = By.xpath("//*[@id='checkout_complete_container']/h2");
    private By backHomeBtn = By.id("back-to-products");

    public Complete(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getCompletePurchaseMessage(){
        return getDriver().findElement(completePurchaseMessage);
    }

    public WebElement getBackHomeBtn(){
        return getDriver().findElement(backHomeBtn);
    }

    public void backHomeAction(){
        getBackHomeBtn().click();
    }

}
