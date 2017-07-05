    package pageobjects;

    import com.codeborne.selenide.Condition;
    import com.codeborne.selenide.SelenideElement;
    import org.openqa.selenium.By;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.How;
    import stepdefinitions.Account;

    import static com.codeborne.selenide.Selenide.$;
    import static com.codeborne.selenide.Selenide.confirm;

    /**
     * Created by mkrish on 5/07/2017.
     */
    public class AccountPage {

        @FindBy(how= How.NAME, using = "new")
        SelenideElement NewAccount;

        @FindBy(how= How.ID, using = "acc2")
        SelenideElement AccountName;

        @FindBy(how= How.ID, using = "acc6")
        SelenideElement AccountType;

        @FindBy(how= How.ID, using = "acc12")
        SelenideElement Website;

        @FindBy(how= How.ID, using = "acc10")
        SelenideElement Phone;

        @FindBy(how= How.ID, using = "acc7")
        SelenideElement Industry;

        @FindBy(how= How.ID, using = "acc15")
        SelenideElement Employees;

        @FindBy(how= How.ID, using = "acc17street")
        SelenideElement BillingStreet;

        @FindBy(how= How.ID, using = "acc17zip")
        SelenideElement zipcode;

        @FindBy(how= How.LINK_TEXT, using = "Copy Billing Address to Shipping Address")
        SelenideElement CopyAsShippingAddress;

        @FindBy(how= How.NAME, using = "save")
        SelenideElement SaveAccount;

        public void clickNewAccountTab(){

            NewAccount.click();
        }
        public void enterAccountName(String AccName){
            AccountName.setValue(AccName);
        }
        public void enterWebsiteName(String WebsiteName){
            Website.setValue(WebsiteName);
        }
        public void selectAccountType(String accountType){
            AccountType.selectOptionByValue(accountType);
        }
        public void enterContactNumber(String contactNumber){
            Phone.setValue(contactNumber);
        }
        public void selectIndustry(String industryType){
            Industry.selectOptionByValue(industryType);
        }
        public void enterNoOfEmployees(String NoOfEmployees){
            Employees.setValue(NoOfEmployees);
        }
        public void enterBillingAddress(String BillingAddress){
            BillingStreet.setValue(BillingAddress);
        }
        public void enterZipCode(String zipCode){
            zipcode.setValue(zipCode);
        }
        public void clickCopyAsShippingAddress(){
            CopyAsShippingAddress.click();
        }
        public void clickSaveAccount(){
            SaveAccount.click();
        }


       // Filling up information for new Account
       public AccountPage AccountCreation
               (String AccName, String Website, String ContactPhone, String NoofEmployees,String BillingAddress, String ZipCode){

               clickNewAccountTab();
               if(AccName != null)
               enterAccountName(AccName);
               if(Website!=null)
               enterWebsiteName(Website);
               selectAccountType("Customer");
               if(ContactPhone!=null)
               enterContactNumber(ContactPhone);
               if(NoofEmployees!=null)
               enterNoOfEmployees(NoofEmployees);
               if(BillingAddress!=null)
               enterBillingAddress(BillingAddress);
               if(ZipCode!=null)
               enterZipCode(ZipCode);
               Industry.selectOptionByValue("Retail");
               clickCopyAsShippingAddress();
               clickSaveAccount();
               return this;
        }

        public void isContactCreated(String AccountName){
            //Checking if the new account name is displayed
            $(By.id("acc2_ileinner")).shouldHave(Condition.text(AccountName)) ;
        }
        public AccountPage deleteContact(){

            $(By.xpath(".//input[@title='Delete']")).shouldHave(Condition.value("Delete")).click();
            confirm();
            $(By.xpath(".//input[@title='Delete']")).shouldNot(Condition.appear);
            return this;
        }
    }

