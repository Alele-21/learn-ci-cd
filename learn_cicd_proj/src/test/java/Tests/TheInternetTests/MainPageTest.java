package Tests.TheInternetTests;

import Allure.AllureLabels;
import Tests.Base.BaseTest;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.RetryingTest;

import static Constants.Constants.TheInternetMainPage.MainPageConstants.*;

public class MainPageTest extends BaseTest {
//    @RetryingTest(maxAttempts = 2)
    @Test
    @Description("Проверяем текст хидера на главной страницы https://the-internet.herokuapp.com/")
    void checkMainPageHeaderTextTest() {
        AllureLabels.setParentSuiteName("The Internet");
        AllureLabels.setSuiteName("Страницы");
        AllureLabels.setSubSuiteName("Главная страница");
        AllureLabels.setTestCaseName("Проверка текста хидера главной страницы");

        basePage.driverOpen(MAIN_PAGE_URL);
        mainPage.checkMainPageHeaderText(MAIN_PAGE_HEADER);
    }

    @Test
    @Description("Проверяем названия ссылок на главной странице https://the-internet.herokuapp.com/")
    void checkMainPageLinksTest(){
        AllureLabels.setParentSuiteName("The Internet");
        AllureLabels.setSuiteName("Страницы");
        AllureLabels.setSubSuiteName("Главная страница");
        AllureLabels.setTestCaseName("Проверка текста ссылок главной страницы");

        basePage.driverOpen(MAIN_PAGE_URL);
        mainPage.checkMainPageLinksText(MAIN_PAGE_LINKS);
    }

    @Test
    @Description("Проверяем названия ссылок на главной странице https://the-internet.herokuapp.com/")
    void checkMainPageLinksClickableTest(){
        AllureLabels.setParentSuiteName("The Internet");
        AllureLabels.setSuiteName("Страницы");
        AllureLabels.setSubSuiteName("Главная страница");
        AllureLabels.setTestCaseName("Проверка ссылок главной страницы на кликабельность");

        basePage.driverOpen(MAIN_PAGE_URL);
        mainPage.checkMainPageLinksIsClickable(
                mainPage.getMainPageLinksElement()
        );
    }
}