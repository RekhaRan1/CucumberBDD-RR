package stepDefinition;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class HomePage {

    @Given("^User navigates to the login page$")
    public void user_navigates_to_the_Login_page() throws InterruptedException {

        click_hamburger_menu();
        click_signIn_Link();
    }

    @Given("^User navigates to the online products page$")
    public void User_navigates_to_the_online_products_page() throws InterruptedException {

        click_hamburger_menu();
        click_OnlineProduct_Link();

    }
}


/*
@When("User clicks on new Registration button")
public void user_clicks_on_new_registration_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("User should be able to View the Registration page")
public void user_should_be_able_to_view_the_registration_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}




*/
