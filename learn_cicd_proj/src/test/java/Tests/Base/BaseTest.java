package Tests.Base;

import Common.CommonActions;
import Pages.Base.BasePage;
import Pages.Smt.TestPage;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

import static Common.Configs.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();

    protected BasePage basePage = new BasePage(driver);
    protected TestPage testPage = new TestPage(driver);

    @AfterEach
    public void tearDown() {
        if (!HOLD_BROWSER_OPEN) {

            driver.quit();
        }
    }

}