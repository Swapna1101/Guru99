Feature: Test Guru99 application feature.

  Scenario: Test user register functionality.
    Given User is on register page
    When user enters firstname, lastname, phone, address,city,state,postalcode,country,username, password and confirmpassword.
    Then click on submit
