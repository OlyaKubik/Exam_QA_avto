package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class Assertions {
        private final Elements elements;
        private final ActionClass actions;
        private final WebDriver driver;
        private final Waiters waiters;

        public Assertions(WebDriver driver) {
            this.driver = driver;
            elements = new Elements(driver);
            actions = new ActionClass(driver);
            waiters = new Waiters(driver);
        }

    public void elementIsDisplayed(By locator){
        assertTrue(elements.isElementDisplayed(locator), "Элемент не отображается, хотя должен был");
    }
    public void equalsOfStrings(String actualString, String expectedString){
        assertEquals(actualString,expectedString);
    }
    public void equalsOfElementAndLabelText(WebDriver driver, String expectedString){
        assertEquals(driver.getTitle(),expectedString);
    }
    public void equalsIgnoreCase (String xpath, String input){
        assertTrue(xpath.equalsIgnoreCase(input));
    }

    public void elementFalse (String expectedString,String string){
        assertFalse(string.equals(expectedString));
    }


}
