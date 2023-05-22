package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.xml.sax.Locator;

public class ActionClass {

    private final Elements elements;
    private final Actions actions;
    private final WebDriver driver;

    public ActionClass(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        elements = new Elements(driver);
    }
    public void moveToElementLocation(By xpath){
        actions.moveToElement(driver.findElement
        (xpath)).sendKeys(Keys.ENTER).click().build().perform();
    }

}
