package Tests.TheInternetTests;

import Allure.AllureLabels;
import Tests.Base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.RetryingTest;

import static Constants.Constants.TheInternetMainPage.ABTestingPageConstants.*;

public class ABTestingTest extends BaseTest {
    @Test
    @Description("Проверяем текст хидера на странице A/B Testing https://the-internet.herokuapp.com/abtest")
    void checkABTestingPageHeaderTextTest() {
        AllureLabels.setParentSuiteName("The Internet");
        AllureLabels.setSuiteName("Страницы");
        AllureLabels.setSubSuiteName("A/B Testing");
        AllureLabels.setTestCaseName("Проверка текста хидера страницы A/B Testing");

        basePage.driverOpen(A_B_TESTING_PAGE_URL);
        abTestingPage.checkABTestingPageHeader(A_B_TESTING_PAGE_HEADER);
    }

    @RetryingTest(maxAttempts = 3)
    @Description("Проверяем текст на странице A/B Testing https://the-internet.herokuapp.com/abtest")
    void checkABTestingPageTextTest() {
        AllureLabels.setParentSuiteName("The Internet");
        AllureLabels.setSuiteName("Страницы");
        AllureLabels.setSubSuiteName("A/B Testing");
        AllureLabels.setTestCaseName("Проверка текста страницы A/B Testing");

        basePage.driverOpen(A_B_TESTING_PAGE_URL);
        abTestingPage.checkABTestingPageText(A_B_TESTING_PAGE_TEXT);
    }

}