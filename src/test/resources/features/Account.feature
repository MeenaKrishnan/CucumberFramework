@Account
Feature: Account Creation

  In order to check the creation of a new account
  @Run
  Scenario:Account creation as a new business prospect
    Given I open up salesforce to create new account in the role of "csr"
    When I enter "CPL" AccountName,"www.CPL.com" Website,"0123456" Phone,"7" Employees, "37 City Street" BillingStreet,"78945" Zipcode
    Then create a new contact for that account"CPL"
    And cleanup the data for future tests

  Scenario:Account creation using datatable
    Given I open up salesforce to create new account in the role of "csr"
    When I enter all required info using dataTable
      |AccountName      | CPL            |
      |Website          | www.CPL.com    |
      |Phone            | 0123456        |
      |Employees        | 7              |
      |BillingStreet    |37 City Street  |
      |Zipcode for CPL  | 78945          |

    Then create a new contact for that account"CPL"
    And cleanup the data for future tests

  Scenario Outline: Creating Multiple Accounts
    Given I open up salesforce to create new account in the role of "csr"
    When I enter <AccountName> AccountName,<Website> Website,<Phone> Phone,<Employees> Employees, <BillingStreet> BillingStreet,<Zipcode> Zipcode
    Then create a new contact for that account<AccountName>
    And cleanup the data for future tests

    Examples:
      |AccountName    | Website      | Phone     | Employees | BillingStreet   | Zipcode   |
      |"CPL"          | "www.CPL.com"| "0123456" |"7"        | "37 City Street"| "78945"   |
      |"CRS"          | "www.CRS.com"| "0123476" | "6"       | "38 Pal  Street"| "78745"   |




