package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageProvider {
    public WebDriver driver;

    public LoginPageProvider(WebDriver driver) {
        this.driver = driver;
    }
    private final String userNameTextBox = "//input[@placeholder='Username/Email']";
    private final String passwordTextBox = "//input[@placeholder='Login Password']";
    private final String loginButton= "//button[contains(@class,'ui button login_button')]";

//    private final String userNameTextBox = "//input[@id='txtUsername']";
//    private final String passwordTextBox = "//input[@id='txtPassword']";
//    private final String loginButton= "//input[@id='btnLogin']";

    public WebElement getUserNameTextBox() {
        return driver.findElement(By.xpath(userNameTextBox));
    }

    public WebElement getPasswordTextBox() {
        return driver.findElement(By.xpath(passwordTextBox));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath(loginButton));
    }
}
