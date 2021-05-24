package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPageProvider;

public class LoginPage extends BasePage {
    WebDriver driver;
    LoginPageProvider lpp;
    @Given("^User is in the login screen$")
    public void user_is_in_the_login_screen() throws Throwable {
        driver = BasePage.getDriverInstance();
        lpp = new LoginPageProvider(driver);
        Assert.assertTrue(doesElementPresent(lpp.getLoginButton()));
    }

    @When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_and(String userName, String password) throws Throwable {
//        lpp = new LoginPageProvider(driver);
        sendKeys(lpp.getUserNameTextBox(), userName);
        sendKeys(lpp.getPasswordTextBox(), password);

        click(lpp.getLoginButton());
    }
}
