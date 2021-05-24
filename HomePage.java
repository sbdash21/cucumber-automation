package stepDefinations;

import cucumber.api.java.en.Then;
import org.junit.Assert;

public class HomePage extends BasePage {
    @Then("^Verify user is in \"([^\"]*)\" Screen$")
    public void verify_user_is_in_Screen(String screenTitle) throws Throwable {
        Assert.assertEquals(getTitle(), screenTitle);
//        Thread.sleep(10000);
    }

}
