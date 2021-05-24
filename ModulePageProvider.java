package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinations.BasePage;

public class ModulePageProvider extends BasePage {
    public WebDriver driver;

    public ModulePageProvider(WebDriver driver) {

        this.driver = driver;
    }

    private final String moduleNameLocator= "//div[contains(text(),'TASK MANAGEMENT')]";
    public WebElement getModuleName(String moduleName) {
        return driver.findElement(By.xpath(moduleNameLocator));
    }
}
