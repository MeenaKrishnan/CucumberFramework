$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Account.feature");
formatter.feature({
  "line": 2,
  "name": "Account Creation",
  "description": "\r\nIn order to check the creation of a new account",
  "id": "account-creation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Account"
    }
  ]
});
formatter.before({
  "duration": 15191495431,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Account creation as a new business prospect",
  "description": "",
  "id": "account-creation;account-creation-as-a-new-business-prospect",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Run"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open up salesforce to create new account in the role of \"csr\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"CPL\" AccountName,\"www.CPL.com\" Website,\"0123456\" Phone,\"7\" Employees, \"37 City Street\" BillingStreet,\"78945\" Zipcode",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "create a new contact for that account\"CPL\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "cleanup the data for future tests",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "\"csr\"",
      "offset": 58
    }
  ],
  "location": "Account.I_open_up_salesforce_to_create_new_account_for_CPL(String)"
});
formatter.result({
  "duration": 3794963356,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CPL",
      "offset": 9
    },
    {
      "val": "www.CPL.com",
      "offset": 27
    },
    {
      "val": "0123456",
      "offset": 49
    },
    {
      "val": "7",
      "offset": 65
    },
    {
      "val": "37 City Street",
      "offset": 80
    },
    {
      "val": "78945",
      "offset": 111
    }
  ],
  "location": "Account.I_fill_up_information_for_CPL(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 17310025946,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CPL",
      "offset": 38
    }
  ],
  "location": "Account.Create_a_new_contact_for_that_account(String)"
});
formatter.result({
  "duration": 161244950,
  "status": "passed"
});
formatter.match({
  "location": "Account.cleanupdata()"
});
formatter.result({
  "duration": 2185723395,
  "status": "passed"
});
formatter.after({
  "duration": 172772,
  "status": "passed"
});
formatter.before({
  "duration": 3056376246,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Account creation using datatable",
  "description": "",
  "id": "account-creation;account-creation-using-datatable",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I open up salesforce to create new account in the role of \"csr\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I enter all required info using dataTable",
  "rows": [
    {
      "cells": [
        "AccountName",
        "CPL"
      ],
      "line": 15
    },
    {
      "cells": [
        "Website",
        "www.CPL.com"
      ],
      "line": 16
    },
    {
      "cells": [
        "Phone",
        "0123456"
      ],
      "line": 17
    },
    {
      "cells": [
        "Employees",
        "7"
      ],
      "line": 18
    },
    {
      "cells": [
        "BillingStreet",
        "37 City Street"
      ],
      "line": 19
    },
    {
      "cells": [
        "Zipcode for CPL",
        "78945"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "create a new contact for that account\"CPL\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "cleanup the data for future tests",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "\"csr\"",
      "offset": 58
    }
  ],
  "location": "Account.I_open_up_salesforce_to_create_new_account_for_CPL(String)"
});
formatter.result({
  "duration": 1694322860,
  "status": "passed"
});
formatter.match({
  "location": "Account.I_enter_all_required_info_using_dataTable(DataTable)"
});
formatter.result({
  "duration": 8572959570,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CPL",
      "offset": 38
    }
  ],
  "location": "Account.Create_a_new_contact_for_that_account(String)"
});
formatter.result({
  "duration": 94455348,
  "status": "passed"
});
formatter.match({
  "location": "Account.cleanupdata()"
});
formatter.result({
  "duration": 2486457291,
  "status": "passed"
});
formatter.after({
  "duration": 48325,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 25,
  "name": "Creating Multiple Accounts",
  "description": "",
  "id": "account-creation;creating-multiple-accounts",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 26,
  "name": "I open up salesforce to create new account in the role of \"csr\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I enter \u003cAccountName\u003e AccountName,\u003cWebsite\u003e Website,\u003cPhone\u003e Phone,\u003cEmployees\u003e Employees, \u003cBillingStreet\u003e BillingStreet,\u003cZipcode\u003e Zipcode",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "create a new contact for that account\u003cAccountName\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "cleanup the data for future tests",
  "keyword": "And "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "account-creation;creating-multiple-accounts;",
  "rows": [
    {
      "cells": [
        "AccountName",
        "Website",
        "Phone",
        "Employees",
        "BillingStreet",
        "Zipcode"
      ],
      "line": 32,
      "id": "account-creation;creating-multiple-accounts;;1"
    },
    {
      "cells": [
        "\"CPL\"",
        "\"www.CPL.com\"",
        "\"0123456\"",
        "\"7\"",
        "\"37 City Street\"",
        "\"78945\""
      ],
      "line": 33,
      "id": "account-creation;creating-multiple-accounts;;2"
    },
    {
      "cells": [
        "\"CRS\"",
        "\"www.CRS.com\"",
        "\"0123476\"",
        "\"6\"",
        "\"38 Pal  Street\"",
        "\"78745\""
      ],
      "line": 34,
      "id": "account-creation;creating-multiple-accounts;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2796803120,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Creating Multiple Accounts",
  "description": "",
  "id": "account-creation;creating-multiple-accounts;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Account"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I open up salesforce to create new account in the role of \"csr\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I enter \"CPL\" AccountName,\"www.CPL.com\" Website,\"0123456\" Phone,\"7\" Employees, \"37 City Street\" BillingStreet,\"78945\" Zipcode",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "create a new contact for that account\"CPL\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "cleanup the data for future tests",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "\"csr\"",
      "offset": 58
    }
  ],
  "location": "Account.I_open_up_salesforce_to_create_new_account_for_CPL(String)"
});
formatter.result({
  "duration": 1635476917,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CPL",
      "offset": 9
    },
    {
      "val": "www.CPL.com",
      "offset": 27
    },
    {
      "val": "0123456",
      "offset": 49
    },
    {
      "val": "7",
      "offset": 65
    },
    {
      "val": "37 City Street",
      "offset": 80
    },
    {
      "val": "78945",
      "offset": 111
    }
  ],
  "location": "Account.I_fill_up_information_for_CPL(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 7410161383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CPL",
      "offset": 38
    }
  ],
  "location": "Account.Create_a_new_contact_for_that_account(String)"
});
formatter.result({
  "duration": 315872821,
  "status": "passed"
});
formatter.match({
  "location": "Account.cleanupdata()"
});
formatter.result({
  "duration": 1879540341,
  "status": "passed"
});
formatter.after({
  "duration": 62865,
  "status": "passed"
});
formatter.before({
  "duration": 2810933640,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Creating Multiple Accounts",
  "description": "",
  "id": "account-creation;creating-multiple-accounts;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Account"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I open up salesforce to create new account in the role of \"csr\"",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I enter \"CRS\" AccountName,\"www.CRS.com\" Website,\"0123476\" Phone,\"6\" Employees, \"38 Pal  Street\" BillingStreet,\"78745\" Zipcode",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "create a new contact for that account\"CRS\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "cleanup the data for future tests",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "\"csr\"",
      "offset": 58
    }
  ],
  "location": "Account.I_open_up_salesforce_to_create_new_account_for_CPL(String)"
});
formatter.result({
  "duration": 1614074582,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CRS",
      "offset": 9
    },
    {
      "val": "www.CRS.com",
      "offset": 27
    },
    {
      "val": "0123476",
      "offset": 49
    },
    {
      "val": "6",
      "offset": 65
    },
    {
      "val": "38 Pal  Street",
      "offset": 80
    },
    {
      "val": "78745",
      "offset": 111
    }
  ],
  "location": "Account.I_fill_up_information_for_CPL(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 7421717858,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CRS",
      "offset": 38
    }
  ],
  "location": "Account.Create_a_new_contact_for_that_account(String)"
});
formatter.result({
  "duration": 140115886,
  "status": "passed"
});
formatter.match({
  "location": "Account.cleanupdata()"
});
formatter.result({
  "duration": 1880334493,
  "status": "passed"
});
formatter.after({
  "duration": 48325,
  "status": "passed"
});
});