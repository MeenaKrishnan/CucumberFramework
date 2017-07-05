package pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

/**
 * Created by mkrish on 5/07/2017.
 */
public class LandingPage {

    @FindBy(how= How.ID, using = "Account_Tab")
    SelenideElement AccountTab;

    public  AccountPage clickAccountsTab(){
        AccountTab.click();
        return page(AccountPage.class);
    }

}
