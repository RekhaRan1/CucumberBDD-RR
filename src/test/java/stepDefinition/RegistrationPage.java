package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static pages.LoginPage.*;
import static pages.RegistrationPage.RegistrationPageName;

public class RegistrationPage {

    @Then("User should be able to View the Registration page")
    public void User_should_be_able_to_View_the_Registration_page() throws InterruptedException {
        RegistrationPageName();


    }
}
