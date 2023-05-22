package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TwoPage extends BasePage {
    public TwoPage(WebDriver driver) {
        super(driver);
    }

    private static class Label {
        private final static String url = "https://prostor.ua/ua/vse-dlya-doma/sredstva-dlya-stirki/";
        private static final String poroshok = "Пральні порошки";
        private static final String poroshokOfKids = "Для дитячих речей";
        private static final String poroshokLiquid = "Рідкі засоби для прання";
        private static final String poroshokGel = "Гелеві капсули";
        private static final String Kondish = "Кондиціонери та ополіскувачі";

    }
    private static class Locators {
        private final static By MainNamePage = By.xpath("//h1[@id='j-catalog-header']");
        private final static By poroshok = By.xpath("//ul[@class='filterMenu-lv2']//a[text()='Пральні порошки']");
        private final static By poroshokOfKids = By.xpath(" //ul[@class='filterMenu-lv2']//a[text()='Для дитячих речей']");
        private final static By poroshokLiquid = By.xpath( "//ul[@class='filterMenu-lv2']//a[text()='Рідкі засоби для прання']");
        private final static By poroshokGel = By.xpath( "//ul[@class='filterMenu-lv2']//a[text()='Гелеві капсули']");
        private final static By Kondish = By.xpath( "//ul[@class='filterMenu-lv2']//a[text()='Кондиціонери та ополіскувачі']");
        private final static By popular= By.xpath("//span[@class='catalog-sorting__item is-active j-catalog-sorting-button']");
        private final static By cheaper= By.xpath("//span[@class='catalog-sorting__item j-catalog-sorting-button'][1]");
        private final static By expensive= By.xpath("//span[@class='catalog-sorting__item j-catalog-sorting-button'][2]");
        private final static By name= By.xpath("//span[@class='catalog-sorting__item j-catalog-sorting-button'][3]");
        private final static By firstnew= By.xpath("//span[@class='catalog-sorting__item j-catalog-sorting-button'][4]");
        private final static By product = By.xpath("//div[@class='catalogCard-view']/a");
        private final static By elementSend = By.xpath("//div[@class='p-review-add__form-item']/span");
        private final static By noname = By.xpath(" //div[@class='p-review-add__form-column p-review-add__form-column--inputs']/div/div");
        private final static By schedule = By.xpath("//span[@class='time_work']");



    }


    public void openPage() {
        driver.get(TwoPage.Label.url);
    }

    public void checkResaltsElementContainsText(String input) {
        waiters.waitVisabilityOfWebElent(Locators.MainNamePage);
        String result = elements.getTextFromElementBy(Locators.MainNamePage);
        assertions.equalsOfStrings(result, input);
    }
    public void checkResaltsElementContainsText2() {
        String result = elements.getTextFromElementBy(Locators.poroshok);
        assertions.equalsOfStrings(result, Label.poroshok);
        String result2 = elements.getTextFromElementBy(Locators.poroshokOfKids);
        assertions.equalsOfStrings(result2, Label.poroshokOfKids);
        String result3 = elements.getTextFromElementBy(Locators.poroshokLiquid);
        assertions.equalsOfStrings(result3, Label.poroshokLiquid);
        String result4 = elements.getTextFromElementBy(Locators.poroshokGel);
        assertions.equalsOfStrings(result4, Label.poroshokGel);
        String result5 = elements.getTextFromElementBy(Locators.Kondish);
        assertions.equalsOfStrings(result5, Label.Kondish);
    }
    public void CheckElement(){
        assertions.elementIsDisplayed(Locators.popular);
        assertions.elementIsDisplayed(Locators.cheaper);
        assertions.elementIsDisplayed(Locators.expensive);
        assertions.elementIsDisplayed(Locators.name);
        assertions.elementIsDisplayed(Locators.firstnew);

    }
    public void CheckClickElement() {
        waiters.waitVisabilityOfWebElent(Locators.product);
        elements.clickOnElementBy(Locators.product);

    }
    public void CheckClickElement2() {
        waiters.waitVisabilityOfWebElent(Locators.elementSend);
        elements.clickOnElementBy(Locators.elementSend);
    }
    public void checkResaltsElementContainsText3(String input) {
        waiters.waitVisabilityOfWebElent(Locators.noname);
        String result = elements.getTextFromElementBy(Locators.noname);
        assertions.equalsOfStrings(result, input);
    }
    public void checkResaltsElementContainsText4(String input) {
        waiters.waitVisabilityOfWebElent(Locators.noname);
        String result = elements.getTextFromElementBy(Locators.noname);
        assertions.equalsOfStrings(result, input);
    }
    public void checkResaltsElementContainsText5(String input) {
        waiters.waitVisabilityOfWebElent(Locators.schedule);
        String result = elements.getTextFromElementBy(Locators.schedule);
        assertions.equalsOfStrings(result, input);
    }


}
