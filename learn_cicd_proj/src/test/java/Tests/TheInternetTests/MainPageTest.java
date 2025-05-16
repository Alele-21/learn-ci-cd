package Tests.TheInternetTests;

import Allure.AllureLabels;
import Tests.Base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.RetryingTest;

import static Constants.Constants.TheInternetMainPage.MainPageConstants.MAIN_PAGE_HEADER;
import static Constants.Constants.TheInternetMainPage.MainPageConstants.MAIN_PAGE_URL;

public class MainPageTest extends BaseTest {
//    @RetryingTest(maxAttempts = 2)
    @Test
    @Description("Проверяем текст хидера на главной страницы https://the-internet.herokuapp.com/")
    void checkMainPageHeaderTextTest() {
        AllureLabels.setParentSuiteName("The Internet");
        AllureLabels.setSuiteName("Страницы");
        AllureLabels.setSubSuiteName("Главная страница");
        AllureLabels.setTestCaseName("Проверка текста хидера главной страницы");

        try {
            basePage.driverOpen(MAIN_PAGE_URL);

            mainPage.checkMainPageHeaderText(MAIN_PAGE_HEADER);
        } catch (AssertionError e) {
            basePage.attachScreenshotToReport();
            throw e;
        }
    }
}