package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static pages.HomePage.click_hamburger_menu;
import static pages.HomePage.click_signIn_Link;
import static pages.LoginPage.*;

public class LoginPage {
    @When("User successfully enters the login details")
    public void user_successfully_enters_the_login_details() throws InterruptedException {
        username();
        password();
        click_login_btn();
    }
    @When("User clicks on new Registration button")
    public void User_clicks_on_new_Registration_button() throws InterruptedException {
        click_Registration_btn();
    }

}

