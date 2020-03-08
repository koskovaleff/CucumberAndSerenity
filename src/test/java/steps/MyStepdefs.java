package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class MyStepdefs {

    @Steps
    MainPageSteps steps;


    @Given("^User open homepage$")
    public void userOpenHomepage() {
        steps.open_main_page();

    }

    @When("^User click Login button$")
    public void userClickLoginButton() {
        steps.click_login_button();

    }

    @Then("^Register button should be visible$")
    public void registerButtonShouldBeVisible() {
        steps.check_reg_button();

    }
}
