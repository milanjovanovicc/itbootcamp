package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourInformation extends BasePage{

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");

    private By continueBtn = By.id("continue");

    public YourInformation(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getFirstName(){
        return getDriver().findElement(firstName);
    }

    public WebElement getLastName(){
        return getDriver().findElement(lastName);
    }

    public WebElement getPostalCode(){
        return getDriver().findElement(postalCode);
    }

    public WebElement getContinueBtn(){
        return getDriver().findElement(continueBtn);
    }

    public void enterCredentials(String firstName, String lastName, String postalCode){
        getFirstName().sendKeys(firstName);
        getLastName().sendKeys(lastName);
        getPostalCode().sendKeys(postalCode);

        getContinueBtn().click();
    }

}
