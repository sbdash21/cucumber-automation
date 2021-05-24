package stepDefinations;

import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.ModulePageProvider;

public class ModulePage extends BasePage {
  public WebDriver driver;
  ModulePageProvider mpp;

  @When("^User select \"([^\"]*)\"$")
  public void user_select(String moduleName) throws Throwable {
    mpp = new ModulePageProvider(BasePage.getDriver());
    click(mpp.getModuleName(moduleName));
  }
}
