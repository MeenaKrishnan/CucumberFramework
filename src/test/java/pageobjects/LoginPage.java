package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

/**
 * Created by mkrish on 5/07/2017.
 */
public class LoginPage {

    @FindBy(how= How.ID,using ="username")
    SelenideElement username;

    @FindBy(how = How.ID,using = "password")
    SelenideElement password;

    @FindBy(how = How.ID,using= "Login")
    SelenideElement loginbutton;


    public LandingPage loginAsUser(String accessType) {

        switch(accessType)
        {

            case "csr":
                username.setValue("testuser050184@gmail.com");
                password.setValue("memu050184");
                break;
            case "manager":
                username.setValue("testuser050184@gmail.com");
                password.setValue("memu050184");
                break;
            case "ceo":
                username.setValue("testuser050184@gmail.com");
                password.setValue("memu050184");
                break;
            default:
                username.setValue("testuser050184@gmail.com");
                password.setValue("memu050184");
        }
        loginbutton.click();
        return page(LandingPage.class);

    }
}
