package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OnePage extends BasePage {
    public OnePage(WebDriver driver) {
        super(driver);
    }

    private static class Label {
        private final static String url = "https://prostor.ua/ru/";
        private final static String partOfUrlText = "Результаты поиска";

    }

    private static class Locators {
        private final static By searchField = By.xpath("//input[@class ='search__input']");
        private final static By searchResalt = By.xpath("//h1[@id='j-catalog-header']");
        private final static By Languages1 = By.xpath("//div[@class='lang-menu__button']");
        private final static By Languages2 = By.xpath("//a[@class='lang-menu__link']");
        private final static By element = By.xpath("//div[@class='products-menu j-products-menu']//a");
        private final static By email = By.xpath("//iframe[@src='https://secure.esputnik.com.ua/RMApf5L2Ws']");
        private final static By ifraime = By.xpath("//iframe[@src='https://secure.esputnik.com.ua/RMApf5L2Ws']");
        private final static By ifraimeresalt = By.xpath("//label[@id='email-error']");
        private final static By subscribe = By.xpath("//input[@name='subscribe']");
        private final static By phone = By.xpath("//div[@class='phones__item']");





    }

    public void searchByText(String text) {
        waiters.waitVisabilityOfWebElent(Locators.searchField);
        elements.sendKeysToElementBy(Locators.searchField, text);

    }

    public void хpathaction() {
        action.moveToElementLocation(Locators.searchField);

    }

    public void openPage() {
        driver.get(Label.url);
    }

    public void checkResaltsElementContainsText(String input) {
        waiters.waitVisabilityOfWebElent(Locators.searchResalt);
        String resultOfReach = elements.getTextFromElementBy(Locators.searchResalt).replace("Результаты поиска ","");
        assertions.equalsOfStrings(resultOfReach,"«"+input+"»");
    }

    public void CheckClickElement1() {
        elements.clickOnElementBy(Locators.Languages1);
    }

    public void CheckClickElement2() {
        elements.clickOnElementBy(Locators.Languages2);
    }

    public void checkResaltsElementContainsText2(String input) {
        waiters.waitVisabilityOfWebElent(Locators.element);
        String result = elements.getTextFromElementBy(Locators.element);
        assertions.equalsOfStrings(result, input);

    }

    public String getTextFromLabel() {
        return elements.getTextFromElementBy(Locators.element);
    }

    public void ByText(String text) {
        waiters.waitVisabilityOfWebElent(Locators.email);
        elements.sendKeysToElementBy(Locators.email, text);
    }

    public void CheckClickElement3() {
        elements.clickOnElementBy(Locators.subscribe);
    }
    public void checkResaltsElementContainsText3(String input) {
        waiters.waitVisabilityOfWebElent(Locators.ifraimeresalt);
        String result = elements.getTextFromElementBy(Locators.ifraimeresalt);
        assertions.equalsOfStrings(result, input);
    }
    public void CheckElement(){
        assertions.elementIsDisplayed(Locators.phone);


    }

}
