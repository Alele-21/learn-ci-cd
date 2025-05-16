package Tests.Base;

import Common.CommonActions;
import Pages.Base.BasePage;
import Steps.TheInternetSteps.ABTestingPageSteps;
import Steps.TheInternetSteps.MainPageSteps;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

import static Common.Configs.ATTACH_SCREENSHOT_TO_REPORT;
import static Common.Configs.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();

    protected BasePage basePage = new BasePage(driver);
    protected MainPageSteps mainPage = new MainPageSteps(driver);
    protected ABTestingPageSteps abTestingPage = new ABTestingPageSteps(driver);

    @AfterEach
    public void tearDown() {
        if(ATTACH_SCREENSHOT_TO_REPORT) basePage.attachScreenshotToReport();

        if (!HOLD_BROWSER_OPEN) driver.quit();
    }

}