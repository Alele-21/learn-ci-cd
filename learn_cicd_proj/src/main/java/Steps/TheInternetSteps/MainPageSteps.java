package Steps.TheInternetSteps;

import Pages.TheInternetPages.MainPage;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    public MainPageSteps checkMainPageLinksText(List<String> listOfLinksText){
        Allure.step("Проверить названия ссылок главной страницы", () -> {
            Assertions.assertEquals(listOfLinksText, getMainPageLinksText(),
                    "Названия ссылок на странице указаны неверно. " +
                            "Ожидались ссылки c названиями:\n" + listOfLinksText);
        });

        return this;
    }


    public MainPageSteps checkMainPageLinksIsClickable(List<WebElement> webElementList){
        Allure.step("Проверить каждую ссылку на кликабельность", () -> {
            for(WebElement el : webElementList){
                if(!isElementClickable(el))
                    Assertions.fail(String.format("Ссылка \"%s\" не кликабельна", getElementText(el)));
            }
        });

        return this;
    }
}
