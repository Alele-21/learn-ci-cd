package Steps.TheInternetSteps;

import Pages.TheInternetPages.ABTestingPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Allure;

public class ABTestingPageSteps extends ABTestingPage {
    public ABTestingPageSteps(WebDriver driver) {
        super(driver);
    }

    public ABTestingPageSteps checkABTestingPageHeader(String expectedHeaderText){
        Allure.step("Проверить текст хидера на странице A/B Testing", () -> {
            Assertions.assertEquals(expectedHeaderText, getABTestingHeaderText(),
                    String.format("Текст хидера страницы A/B Testing указан неверно. " +
                            "Ожидался: \"%s\"", expectedHeaderText));
        });

        return this;
    }

    public ABTestingPageSteps checkABTestingPageText(String expectedPageText){
        Allure.step("Проверить текст хидера на странице A/B Testing", () -> {
            Assertions.assertEquals(expectedPageText, getABTestingHeaderText(),
                    String.format("Текст на странице A/B Testing указан неверно. " +
                            "Ожидался: \"%s\"", expectedPageText));
        });

        return this;
    }
}
