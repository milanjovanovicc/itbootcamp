import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Milan\\Programiranje\\Java\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor scroll = (JavascriptExecutor)driver;

        driver.get("https://www.kupujemprodajem.com/");

        driver.manage().window().maximize();
        WebElement close = driver.findElement(By.xpath("/html/body/div[9]/div/div[2]"));
        close.click();

        List<WebElement> listaStvari = driver.findElements(By.xpath("//*[@id='category-tree-content-goods']/a"));
        for (int i = 0; i < listaStvari.size(); i++) {
            System.out.println("Kategorija: " + listaStvari.get(i).getAttribute("href"));
        }
        WebElement agree = driver.findElement(By.name("i-understand"));
        agree.click();

        for (int i = 0; i < listaStvari.size(); i++) {

            if (listaStvari.get(i).getText().equals("Bicikli")){
                listaStvari.get(i).sendKeys(Keys.ENTER);
            }
        }
        WebDriverWait loader = new WebDriverWait(driver,Duration.ofSeconds(5));
        loader.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/div[1]/div[1]/h2/a")));
        scroll.executeScript("window.scrollBy(0,350)", "");

        List<WebElement> listaBicikli = driver.findElements(
                By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/h2/a/span"));
        for (int i = 0; i < listaBicikli.size(); i++) {
            System.out.println(listaBicikli.get(i).getText());
        }
        WebElement elektricni = driver.findElement(
                By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/div[3]/div[1]/h2/a"));

        elektricni.sendKeys(Keys.ENTER);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
