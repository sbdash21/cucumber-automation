package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageProvider {
  public WebDriver driver;

  public HomePageProvider(WebDriver driver) {
    this.driver = driver;
  }

  private final By search = By.xpath("//input[@type='search']");

  private final By productName = By.cssSelector("h4.product-name");

  private final By increment = By.cssSelector("a.increment");

  private final By addToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");

  public WebElement getSearch() {
    return driver.findElement(search);
  }

  public WebElement getProductName() {
    return driver.findElement(productName);
  }

  public WebElement increment() {
    return driver.findElement(increment);
  }

  public WebElement addToCart() {
    return driver.findElement(addToCart);
  }
}
