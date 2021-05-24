package stepDefinations;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BasePage {

  @Before
  public void beforevaldiation() {
    System.out.println("Before hook");
  }

  @After
  public void Aftervaldiation(Scenario scenario) {
    if (scenario.isFailed()) {
      final byte[] screenshot = ((TakesScreenshot) driver)
              .getScreenshotAs(OutputType.BYTES);
      scenario.embed(screenshot, "image/png"); //stick it in the report
    }
    driver.close();
  }
}
