import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

    System.setProperty("webdriver.gecko.driver","C:\\Milan\\Programiranje\\Java\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,700)","");
        Actions action = new Actions(driver);

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driverWait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/div[2]/a[1]/span")));

        WebElement image1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div"));
        WebElement addArticle1 = driver.findElement(
                By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/div[2]/a[1]"));

        action.moveToElement(image1).perform();
        action.moveToElement(addArticle1).perform();

        driverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/div[2]/a[1]")));
        addArticle1.click();

        driverWait.until(ExpectedConditions.textToBePresentInElementLocated(
                By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span"),"Continue shopping"));
        WebElement continueShopping = driver.findElement(
                By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span"));
        action.moveToElement(continueShopping).perform();
        continueShopping.click();

// --------------------------------------------------------------------------// 2 add

        driverWait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[2]/div[2]/a[1]")));

        WebElement image2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div"));
        WebElement addArticle2 = driver.findElement(
                By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[2]/div[2]/a[1]"));

        action.moveToElement(image2).perform();
        action.moveToElement(addArticle2).perform();

        driverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[2]/div[2]/a[1]")));

        addArticle2.click();

        driverWait.until(ExpectedConditions.textToBePresentInElementLocated(
                By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span"),"Continue shopping"));
        continueShopping = driver.findElement(
                By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span"));

        action.moveToElement(continueShopping).perform();
        continueShopping.click();

        // ------------------------------------------------------------------// 3 add

        driverWait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[3]/div/div[2]/div[2]/a[1]")));

        WebElement image3 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[3]/div"));
        WebElement addArticle3 = driver.findElement(
                By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[3]/div/div[2]/div[2]/a[1]"));

        action.moveToElement(image3).perform();
        action.moveToElement(addArticle3).perform();

        driverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[3]/div/div[2]/div[2]/a[1]")));

        addArticle3.click();

        driverWait.until(ExpectedConditions.textToBePresentInElementLocated(
                By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span"),"Continue shopping"));
        continueShopping = driver.findElement(
                By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span"));

        action.moveToElement(continueShopping).perform();
        continueShopping.click();

        // ------------------------------------------------------// cart click

        js.executeScript("window.scrollBy(0,-700)","");
        WebElement cart = driver.findElement(
                By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a"));
        action.moveToElement(cart).perform();
        cart.sendKeys(Keys.ENTER);

        // --------------------------------------------------------------// removal

        driverWait.until(ExpectedConditions.elementToBeClickable(By.id("3_13_0_0")));
        WebElement bin = driver.findElement(By.id("3_13_0_0"));
        js.executeScript("window.scrollBy(0,700)","");
        action.moveToElement(bin).perform();
        bin.sendKeys(Keys.ENTER);

        // -----------------------------------------------------------------------// + add

        driverWait.until(ExpectedConditions.elementToBeClickable(By.id("cart_quantity_up_2_7_0_0")));
        WebElement plus = driver.findElement(By.id("cart_quantity_up_2_7_0_0"));
        action.moveToElement(plus).perform();
        plus.sendKeys(Keys.ENTER);

        driver.quit();
    }
}
