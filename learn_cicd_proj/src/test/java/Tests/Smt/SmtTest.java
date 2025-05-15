package Tests.Smt;

import Allure.AllureLabels;
import Tests.Base.BaseTest;
import io.qameta.allure.Description;
import org.junitpioneer.jupiter.RetryingTest;

import static Constants.Constants.TheInternetMainPage.MAIN_PAGE_HEADER;
import static com.codeborne.selenide.Selenide.open;

public class SmtTest extends BaseTest {
    @RetryingTest(maxAttempts = 2)
//    @Test
    @Description("Проверяем добавление сведений о действующих отношениях к заявке в разделе \"Сведения о действующих отношениях\"")
    void addActDocInActDocSectionTest() {
        AllureLabels.setParentSuiteName("1 уровень");
        AllureLabels.setSuiteName("2 уровень");
        AllureLabels.setSubSuiteName("3 уровень");
        AllureLabels.setTestCaseName("Проверка текста хидера главной страницы");

        try {
            basePage.driverOpen("https://the-internet.herokuapp.com/");

            testPage.checkMainPageHeaderText(MAIN_PAGE_HEADER);
        } catch (AssertionError e) {
            basePage.attachScreenshotToReport();
            throw e;
        }
    }
}
