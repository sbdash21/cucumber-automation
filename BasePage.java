package stepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Instant;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
  public static WebDriver driver;
  public WebDriverWait wait;
  public static Properties prop;

  public static WebDriver getDriverInstance() throws IOException {
    prop = new Properties();
    FileInputStream fis =
        new FileInputStream(
            "E:\\WebAutomation\\Automation\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");
    prop.load(fis);

    System.setProperty(
        "webdriver.chrome.driver",
        "E:\\WebAutomation\\Automation\\Automation\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.get(prop.getProperty("url"));
    return driver;
  }

  public static WebDriver getDriver() {
    return driver;
  }

  // Wait Wrapper Method
  public void waitVisibility(WebElement element) {
    wait = new WebDriverWait(driver, 15);
    wait.until(ExpectedConditions.visibilityOfAllElements(element));
  }

  // Click Method
  public void click(WebElement element) {
    waitVisibility(element);
    element.click();
  }

  // clear Method
  public void clear(WebElement element) {
    waitVisibility(element);
    element.clear();
  }
  // sendKeys Method
  public void sendKeys(WebElement element, String text) {
    waitVisibility(element);
    element.sendKeys(text);
  }
  // get page title
  public String getTitle() {
    return driver.getTitle();
  }

  // get page title
  public boolean doesElementPresent(WebElement element) {
    boolean isElementPreset = false;
    wait = new WebDriverWait(driver, 2);
    try{
      wait.until(ExpectedConditions.visibilityOf(element));
      isElementPreset = true;
    } catch (Exception e) {
      return isElementPreset;
    }
    return isElementPreset;
  }
}
