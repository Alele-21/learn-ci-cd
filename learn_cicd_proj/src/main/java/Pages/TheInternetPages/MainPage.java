package Pages.TheInternetPages;

import Pages.Base.BasePage;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By MAIN_PAGE_HEADER_L = By.xpath("//h1[text()='Welcome to the-internet']");

    public String getMainPageHeaderText(){
        return getElementText(MAIN_PAGE_HEADER_L);
    }
}
