package Pages.Smt;

import Pages.Base.BasePage;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;

public class TestPage extends BasePage {
    public TestPage(WebDriver driver) {
        super(driver);
    }

    private final By MAIN_PAGE_HEADER_L = By.xpath("//h1[text()='Welcome to the-internet']");

    public TestPage checkMainPageHeaderText(String expectedValue){
        Allure.step("Проверить текст хидера главной страницы", () -> {
            Assertions.assertEquals(expectedValue, findElementByLocator(MAIN_PAGE_HEADER_L).getText(),
                    String.format("Текст хидера главной страницы указан неверно. Ожидался: \"%s\"", expectedValue));
        });

        return this;
    }
}
