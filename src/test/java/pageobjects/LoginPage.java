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
                username.setValue("meenamuthu05@gmail.com");
                password.setValue("memu0501");
                break;
            case "manager":
                username.setValue("meenamuthu05@gmail.com");
                password.setValue("memu0501");
                break;
            case "ceo":
                username.setValue("meenamuthu05@gmail.com");
                password.setValue("memu0501");
                break;
            default:
                username.setValue("meenamuthu05@gmail.com");
                password.setValue("memu0501");
        }
        loginbutton.click();
        return page(LandingPage.class);

    }
}
