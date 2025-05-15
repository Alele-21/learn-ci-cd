package Pages.Base;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static Constants.Constants.Waits.EXPLICIT_WAIT;
import static com.codeborne.selenide.Selenide.open;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
    }

    private byte[] takeScreenshot() {
        TakesScreenshot ts = (TakesScreenshot) driver;
        return ts.getScreenshotAs(OutputType.BYTES);
    }

    public void attachScreenshotToReport() {
        byte[] screenshot = takeScreenshot();
        Allure.addAttachment("Screenshot", "image/png",
                new ByteArrayInputStream(screenshot), ".png");
    }

    public void driverOpen(String URL){
        driver.get(URL);
    }

    public WebElement findElementByLocator(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}