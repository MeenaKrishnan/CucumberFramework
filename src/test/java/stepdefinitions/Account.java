    package stepdefinitions;

    import cucumber.api.DataTable;
    import cucumber.api.java.en.And;
    import cucumber.api.java.en.Given;
    import cucumber.api.java.en.Then;
    import cucumber.api.java.en.When;
    import pageobjects.AccountPage;
    import pageobjects.LandingPage;
    import pageobjects.LoginPage;

    import java.util.Map;

    import static com.codeborne.selenide.Selenide.open;
    import static com.codeborne.selenide.Selenide.page;

    /**
     * Created by mkrish on 7/3/2017.
     */
    public class Account {

        LoginPage loginPage;
        LandingPage landingPage;
        AccountPage AccPage;

        @Given("^I open up salesforce to create new account in the role of (.*)$")
        public void I_open_up_salesforce_to_create_new_account_for_CPL(String user) throws Throwable {
            loginPage = page(LoginPage.class);
            landingPage = loginPage.loginAsUser(user);

        }

        @When("^I enter \"(.*)\" AccountName,\"(.*)\" Website,\"(.*)\" Phone,\"(.*)\" Employees, \"(.*)\" BillingStreet,\"(.*)\" Zipcode$")
        public void I_fill_up_information_for_CPL(String AccName, String Website, String ContactPhone, String NoofEmployees,String  AddressBillingStreet, String PostZipcode) throws Throwable {
            AccPage = landingPage.clickAccountsTab();
            AccPage.AccountCreation(AccName, Website, ContactPhone, NoofEmployees, AddressBillingStreet,PostZipcode);
        }

        @Then("^create a new contact for that account\"(.*)\"$")
        public void Create_a_new_contact_for_that_account(String AccountName) throws Throwable {
            AccPage.isContactCreated(AccountName);
        }

        @And("^cleanup the data for future tests$")
        public void cleanupdata(){
            AccPage.deleteContact();
        }

        @When("^I enter all required info using dataTable$")
        public void I_enter_all_required_info_using_dataTable(DataTable AccountDetails){
            AccPage = landingPage.clickAccountsTab();
            Map<String, String> values = AccountDetails.asMap(String.class,String.class);
            String  AccName = values.get("AccountName");
            String  WWebsite = values.get("Website").toString();
            String  ContactPhone=values.get("Phone").toString();
            String  NoofEmployees=values.get("Employees").toString();
            String  AddressBillingStreet=values.get("BillingStreet").toString();
            String  PostZipcode =values.get("Zipcode for CPL").toString();
            AccPage.AccountCreation(AccName,WWebsite,ContactPhone,NoofEmployees,AddressBillingStreet,PostZipcode);
        }
    }
