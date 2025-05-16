package Pages.TheInternetPages;

import Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    private final By MAIN_PAGE_HEADER_L = By.xpath("//h1[text()='Welcome to the-internet']");
    private final By MAIN_PAGE_LINKS_GENERAL_L = By.cssSelector("div#content ul li");

    public String getMainPageHeaderText(){
        return getElementText(getVisibleElement(MAIN_PAGE_HEADER_L));
    }

    public List<String> getMainPageLinksText(){
        return getElementList(MAIN_PAGE_LINKS_GENERAL_L)
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

}
