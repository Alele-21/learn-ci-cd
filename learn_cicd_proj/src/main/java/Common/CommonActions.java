package Common;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.http.HttpClient;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class CommonActions {
    private final static String remoteWd = "http://localhost:4444/";
    public static RemoteWebDriver createDriver(){
        Map<String, Object> selenoidObjects = new HashMap<>();
        selenoidObjects.put("enableVnc", true);
        selenoidObjects.put("browser", "chrome");
        selenoidObjects.put("version", "128.0");

        RemoteWebDriver driver;

        ChromeOptions opt = new ChromeOptions();
        opt.setCapability("selenoid:options", selenoidObjects);
        opt.addArguments("--start-maximized");

        try {
            driver = new RemoteWebDriver(new URL(remoteWd + "wd/hub"), opt);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid URL for WebDriver", e);
        }

        return driver;
    }

}
