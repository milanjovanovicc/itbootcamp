package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    private By addToCart = By.id("add-to-cart-sauce-labs-bike-light");
    private By shoppingCart = By.xpath("//*[@id='shopping_cart_container']/a");
    private By numberOfItems = By.xpath("//*[@id='shopping_cart_container']/a/span");
    private By menu = By.id("react-burger-menu-btn");
    private By logOut = By.id("logout_sidebar_link");

    public HomePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getAddToCart(){
        return getDriver().findElement(addToCart);
    }

    public WebElement getShoppingCart(){
        return getDriver().findElement(shoppingCart);
    }

    public WebElement getNumberOfItems(){
        return getDriver().findElement(numberOfItems);
    }

    public WebElement getMenu(){
        return getDriver().findElement(menu);
    }

    public WebElement getLogOut(){
        return getDriver().findElement(logOut);
    }

    public void addToCartAction(){
        getAddToCart().click();
    }

    public void checkNumberOfItems(){
        getNumberOfItems().getText();
    }

    public void shoppingCartAction(){
        getShoppingCart().click();
    }

    public void menuAction(){
        getMenu().click();
        getLogOut().click();
    }
}
