package stepdefinitions;

import com.browserstack.local.Local;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by si556320 on 6/12/2016.
 */
public class Hooks
{

    public static RemoteWebDriver driver;
    private Local local;
    public static String username;
    public static String accessKey;
    public static String sessionId;
    public static String config_file;
    public static String environment;



   @Before
    public void setUp() throws Exception {

      System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
       Configuration.browser = "chrome";
       open("https://login.salesforce.com");

       /*this.config_file="config.json";
        this.environment="chrome";
        JSONParser parser = new JSONParser();
        JSONObject config = (JSONObject)parser.parse(new FileReader("src/test/resources/conf/" + config_file));
        JSONObject envs = (JSONObject) config.get("environments");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        Map<String, String> envCapabilities = (Map<String, String>) envs.get(environment);
        Iterator it = envCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
        }

        Map<String, String> commonCapabilities= (Map<String, String>) config.get("capabilities");
        it = commonCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if (capabilities.getCapability(pair.getKey().toString()) == null) {
                capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
            }
        }

        username = System.getenv("swarndeepsingh1");
        if (username == null) {
            username = (String) config.get("user");
        }

        accessKey = System.getenv("MdxJs1D3VjrQx5E7yFbt");
        if (accessKey == null) {
            accessKey = (String) config.get("key");
        }

        if (capabilities.getCapability("browserstack.local") != null && capabilities.getCapability("browserstack.local") == "true") {
            local = new Local();
            Map<String, String> options = new HashMap<String, String>();
            options.put("key", accessKey);
            local.start(options);
        }

        driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@" + config.get("server") + "/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login.salesforce.com/");
        sessionId = driver.getSessionId().toString();

        WebDriverRunner.setWebDriver(driver);
    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
        if (local != null) {
            local.stop();
        }*/
    }



    @cucumber.api.java.After
    public void embedScreenshot(Scenario scenario) {
       if(scenario.isFailed()) {
            try {

                scenario.write("Current Page URL is " + getWebDriver().getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
    }

}