package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import utils.WebActions;

public class RegisterPage {
	 	private Page page;
	 	private final Locator FIRSTNAME;
	    private final Locator LASTNAME;
	    private final Locator USERNAME;
	    private final Locator PASSWORD;
	    private final Locator NOTAROBOT_CHECKBOX;
	    private final Locator NEWUSER_BUTTON;
	    private final Locator REGISTER_BUTTON;
	    private final Locator ERROR_MSG;
	    
	    public RegisterPage(Page page) {
	        this.page = page;
	        this.FIRSTNAME = page.locator("#firstname");
	        this.LASTNAME = page.locator("#lastname");
	        this.USERNAME = page.locator("#userName");
	        this.PASSWORD = page.locator("#password");
	        this.NOTAROBOT_CHECKBOX = page.locator("#recaptcha-anchor");
	        this.NEWUSER_BUTTON = page.locator("#newUser");
	        this.REGISTER_BUTTON = page.locator("#register");
	        this.ERROR_MSG = page.locator("//p[contains(text(),'Please verify reCaptcha to register!')]");
	    }

	    public void navigateToUrl(String url) {
	        this.page.navigate(WebActions.getProperty(url));
	    }
	    
	    public void clickOnIcon(String iconName) {
	        this.page.getByText(iconName, new Page.GetByTextOptions().setExact(true)).click();  // Clicks on the Exact text
	    }
	    
	    public void enterFirstName(String firstName) {
	    	FIRSTNAME.fill(firstName);
	    }

	    public void enterLastName(String lastName) {
	        LASTNAME.fill(lastName);
	    }

	    public void enterUsername(String username) {
	        USERNAME.fill(username);
	    }

	    public void enterPassword(String password) {
	        PASSWORD.fill(password);
	    }
	    
	    public void clickNotARobotCheckBox() {
	    	NOTAROBOT_CHECKBOX.click();
	    }
	    
	    public void clickNewUser() {
	    	NEWUSER_BUTTON.click();
	    }
	    
	    public void clickRegister() {
	    	REGISTER_BUTTON.click();
	    }
	    
	    public void verifyErrorMessage() {
	    	System.out.println("Error Msg : " + this.ERROR_MSG.innerText());
	    	this.ERROR_MSG.innerText().contentEquals("Please verify reCaptcha to register!");
	    }

}
