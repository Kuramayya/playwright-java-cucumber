package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.RegisterPage;
import utils.WebActions;

public class RegisterUserSteps {
    RegisterPage registerPage = new RegisterPage(DriverFactory.getPage());

    
    @When("^user enters \"([^\"]*)\" firstname$")
    public void enterFirstName(String firstname) {
    	registerPage.enterFirstName(firstname);
    }

    @When("^user enters \"([^\"]*)\" lastname$")
    public void enterLastName(String lastname) {
    	registerPage.enterLastName(lastname);
    }

    @When("^user enters \"([^\"]*)\" userName$")
    public void enterUsername(String username) {
    	registerPage.enterUsername(username);
    }

    @When("^user enters \"([^\"]*)\" passWord$")
    public void enterPassword(String password) {
    	registerPage.enterPassword(password);
    }
    
    @When("^user clicks NewUser button$")
    public void clickNewUser() {
    	registerPage.clickNewUser();
    }

	/*
	 * @When("^user clicks on \"([^\"]*)\" icon in main page") public void
	 * clickOnIcon(String iconName) { registerPage.clickOnIcon(iconName); }
	 */
    
    @When("^user clicks on checkbox")
    public void clickOnCheckbox() {
    	registerPage.clickNotARobotCheckBox();
    }
    
    @When("^user clicks on register button")
    public void clickOnRegisterButton() {
    	registerPage.clickRegister();
    }
    
    @Then("^verify error message")
    public void verifyErrorMsg() {
    	registerPage.verifyErrorMessage();
    }
    
    
    
 
	/*
	 * @Then("verify that user is logged in and navigated to Profile page") public
	 * void verifyProfilePage() { Assert.assertTrue(loginPage.verifyProfilePage());
	 * }
	 */

}

