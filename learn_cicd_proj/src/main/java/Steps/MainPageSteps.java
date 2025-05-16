package Steps;

import Pages.TheInternetPages.MainPage;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class MainPageSteps extends MainPage{
    public MainPageSteps(WebDriver driver) {
        super(driver);
    }

    public MainPageSteps checkMainPageHeaderText(String expectedValue){
        Allure.step("Проверить текст хидера главной страницы", () -> {
            Assertions.assertEquals(expectedValue, getMainPageHeaderText(),
                    String.format("Текст хидера главной страницы указан неверно. Ожидался: \"%s\"", expectedValue));
        });

        return this;
    }
}
