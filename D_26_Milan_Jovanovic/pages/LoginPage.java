package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");
    //private By errorMessage = By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3");


    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getUsername() {
        return getDriver().findElement(username);
    }

    public WebElement getPassword() {
        return getDriver().findElement(password);
    }

    public WebElement getLoginBtn() {
        return getDriver().findElement(loginBtn);
    }
    //public WebElement getErrorMessage(){ return getDriver().findElement(errorMessage)};

    public void login(String username, String password){
        getDriverWait().until(ExpectedConditions.presenceOfElementLocated(By.id("login-button")));
        getUsername().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginBtn().click();
    }

}
