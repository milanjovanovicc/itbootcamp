package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class SwagLabsTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private YourCart yourCart;
    private YourInformation yourInformation;
    private Overview overview;
    private Complete complete;

    private WebDriver driver;
    private WebDriverWait driverWait;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.gecko.driver","C:\\Milan\\Programiranje\\Java\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com");
        driverWait = new WebDriverWait(driver,Duration.ofSeconds(5));
        loginPage = new LoginPage(driver,driverWait);
        homePage = new HomePage(driver,driverWait);
        yourCart = new YourCart(driver,driverWait);
        yourInformation = new YourInformation(driver,driverWait);
        overview = new Overview(driver,driverWait);
        complete = new Complete(driver,driverWait);


    }
    @Test
    public void testLogIn(){
        String username = "standard_user";
        String password = "secret_sauce";

        loginPage.login(username,password);
        String expectedResult = "PRODUCTS";
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText();

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test (dependsOnMethods = {"testLogIn"})
    public void testAddToCart(){
        String expectedResult = "1";
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("add-to-cart-sauce-labs-bike-light")));
        homePage.addToCartAction();
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='shopping_cart_container']/a/span")));
        String actualResult = homePage.getNumberOfItems().getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test (dependsOnMethods = {"testLogIn"})
    public void testCheckout(){
        String expectedResult = "https://www.saucedemo.com/checkout-step-one.html";
        homePage.shoppingCartAction();
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkout")));
        yourCart.checkoutAction();
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("first-name")));
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test (dependsOnMethods = {"testCheckout"})
    public void testTotal(){
        String expectedResult = "10.79";
        String firstName = "user";
        String lastName = "user";
        String postalCode = "100";
        String epectedConfirmationalMessage = "THANK YOU FOR YOUR ORDER";

        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("first-name")));
        yourInformation.enterCredentials(firstName,lastName,postalCode);

        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
        String actualResult = overview.checkTotal();
        Assert.assertTrue(actualResult.contains(expectedResult));

        overview.finishAction();

        String actualConfiramtionMessage = complete.getCompletePurchaseMessage().getText();
        Assert.assertEquals(actualConfiramtionMessage,epectedConfirmationalMessage);
    }

    @Test (dependsOnMethods = {"testTotal"})
    public void testLogOut(){
        String expectedResult = "https://www.saucedemo.com/";
        String expectedCartResult = "'/cart.html'";
        complete.backHomeAction();

        homePage.menuAction();
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);

        driver.get("https://www.saucedemo.com/cart.html");
        String actualCartResult = driver.findElement(
                By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3")).getText();
        Assert.assertTrue(actualCartResult.contains(expectedCartResult));

    }

    @AfterClass
    private void afterMethod(){
        driver.quit();
    }

}
