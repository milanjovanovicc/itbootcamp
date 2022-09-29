package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Overview extends BasePage{

    private By totalSum = By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[7]");
    private By finishBtn = By.id("finish");

    public Overview(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getTotalSum(){
        return getDriver().findElement(totalSum);
    }

    public WebElement getFinishBtn(){
        return getDriver().findElement(finishBtn);
    }

    public String checkTotal(){
        return getTotalSum().getText();
    }

    public void finishAction(){
        getFinishBtn().click();
    }
}
