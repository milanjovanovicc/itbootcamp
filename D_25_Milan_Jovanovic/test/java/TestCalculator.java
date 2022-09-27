import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TestCalculator {

    private WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.gecko.driver", "C:\\Milan\\Programiranje\\Java\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollIntoView = driver.findElement(By.id("resetForm"));
        js.executeScript("arguments[0].scrollIntoView()",scrollIntoView);
    }
    @BeforeMethod
    public void beforeMethod(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement clearButton = driver.findElement(By.id("clearButton"));
        clearButton.click();
        if(!clearButton.isEnabled()){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement scrollIntoView = driver.findElement(By.id("resetForm"));
            js.executeScript("arguments[0].scrollIntoView()",scrollIntoView);
            driver.navigate().refresh();
        }

    }
    @Test
    public void additionWithNull(){
        String expectedResult = "1";
        String numberField1 = "1";
        String numberField2 = "";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Add");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void additionOfLargePositiveNumbers(){
        String expectedResult = "19999999998";
        String numberField1 = "9999999999";
        String numberField2 = "9999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Add");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void additionOfLargeNegativeNumbers(){
        String expectedResult = "-1999999998";
        String numberField1 = "-999999999";
        String numberField2 = "-999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Add");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void additionOfOpositeSignedNumbers(){
        String expectedResult = "9000000000";
        String numberField1 = "9999999999";
        String numberField2 = "-999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Add");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void additionOfZeros(){
        String expectedResult = "0";
        String numberField1 = "0";
        String numberField2 = "0";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Add");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void subtractionWithNull(){
        String expectedResult = "-1";
        String numberField1 = "";
        String numberField2 = "1";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Subtract");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void subtractionOfLargePositiveNumbers(){
        String expectedResult = "0";
        String numberField1 = "9999999999";
        String numberField2 = "9999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Subtract");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void subtractionOfLargeNegativeNumbers(){
        String expectedResult = "0";
        String numberField1 = "-999999999";
        String numberField2 = "-999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Subtract");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void subtractionOfOpositeSignedNumbers(){
        String expectedResult = "10999999998";
        String numberField1 = "9999999999";
        String numberField2 = "-999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Subtract");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void subtractionOfZeros(){
        String expectedResult = "0";
        String numberField1 = "0";
        String numberField2 = "0";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Subtract");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void multiplicationWithNull(){
        String expectedResult = "1";
        String numberField1 = "1";
        String numberField2 = "";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Multiply");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void multiplicationOfLargePositiveNumbers(){
        String expectedResult = "99999999980000000000";
        String numberField1 = "9999999999";
        String numberField2 = "9999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Multiply");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void multiplicationOfLargeNegativeNumbers(){
        String expectedResult = "999999998000000000";
        String numberField1 = "-999999999";
        String numberField2 = "-999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Multiply");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void multiplicationOfOpositeSignedNumbers(){
        String expectedResult = "-9999999989000000000";
        String numberField1 = "9999999999";
        String numberField2 = "-999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Multiply");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void multiplicationOfZeros(){
        String expectedResult = "0";
        String numberField1 = "0";
        String numberField2 = "0";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Multiply");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void divisionWithNull(){
        String expectedResult = "1";
        String numberField1 = "1";
        String numberField2 = "";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Divide");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void divisionOfLargePositiveNumbers(){
        String expectedResult = "1";
        String numberField1 = "9999999999";
        String numberField2 = "9999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Divide");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void divisionOfLargeNegativeNumbers(){
        String expectedResult = "1";
        String numberField1 = "-999999999";
        String numberField2 = "-999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Divide");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void divisionOfOpositeSignedNumbers(){
        String expectedResult = "-1";
        String numberField1 = "999999999";
        String numberField2 = "-999999999";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Divide");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }
    @Test
    public void divisionOfZeros(){
        String expectedResult = "0";
        String numberField1 = "0";
        String numberField2 = "0";

        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.sendKeys(numberField1);
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.sendKeys(numberField2);

        WebElement operation = driver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Divide");

        WebElement calculate = driver.findElement(By.id("calculateButton"));
        calculate.click();

        WebElement answerField = driver.findElement(By.id("numberAnswerField"));

        Assert.assertEquals(answerField.getAttribute("value"),expectedResult);
    }


    @AfterMethod
    public void afterMethod(){
        WebElement firstNumber = driver.findElement(By.id("number1Field"));
        firstNumber.clear();
        WebElement secondNumber = driver.findElement(By.id("number2Field"));
        secondNumber.clear();

    }


    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
