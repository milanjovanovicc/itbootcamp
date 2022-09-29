package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourCart extends BasePage{

    private By checkout = By.id("checkout");

    public YourCart(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getCheckout(){
        return getDriver().findElement(checkout);
    }

    public void checkoutAction(){
        getCheckout().click();
    }
}
