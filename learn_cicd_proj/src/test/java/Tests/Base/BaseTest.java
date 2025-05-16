package Tests.Base;

import Common.CommonActions;
import Pages.Base.BasePage;
import Pages.TheInternetPages.MainPage;
import Steps.MainPageSteps;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

import static Common.Configs.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();

    protected BasePage basePage = new BasePage(driver);
    protected MainPageSteps mainPage = new MainPageSteps(driver);

    @AfterEach
    public void tearDown() {
        if (!HOLD_BROWSER_OPEN) {
            basePage.attachScreenshotToReport();
            driver.quit();
        }
    }

}