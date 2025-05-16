package Pages.TheInternetPages;

import Pages.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABTestingPage extends BasePage {
    public ABTestingPage(WebDriver driver){
        super(driver);
    }

    private final By A_B_TESTING_PAGE_HEADER_L = By.cssSelector("div#content>div>h3");
    private final By A_B_TESTING_PAGE_TEXT_L = By.cssSelector("div#content>div>p");

    public String getABTestingHeaderText(){
        return getElementText(
                getVisibleElement(A_B_TESTING_PAGE_HEADER_L)
        );
    }

    public String getABTestingPageText(){
        return getElementText(
                getVisibleElement(A_B_TESTING_PAGE_TEXT_L)
        );
    }
}
