package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyBasketPage extends BasePage {
    public MyBasketPage(WebDriver driver) {
        super(driver);
    }
    private static class Label {
        private final static String url = "https://prostor.ua/ua/";
        private final static String url2 = "https://prostor.ua/ua/ukhod-za-telom/";

    }
    public void openPage() {
        driver.get(MyBasketPage.Label.url);
    }
    public void openPage2() {
        driver.get(Label.url2);
    }
    private static class Locators {
        private final static By Body = By.xpath("//li[@class='frontCategories-i swiper-slide-next']");
        private final static By BodyText = By.xpath("//h1[@id='j-catalog-header']");
        private final static By Product = By.xpath("//div[@class='catalogCard-title']");
        private final static By BuyElement = By.xpath("//div[@class='product-order__block product-order__block--buy']");
        private final static By back = By.xpath("//div[@class='cart-btnBack']");
        private final static By coupon = By.xpath("//span[@class='link__text']");
        private final static By coupon2 = By.xpath("//input[@class='coupon-field field errorBox-popup j-coupon-input']");

        private final static By couponcheck = By.xpath("//div[@class='form-error-box errorBox-message']");
        private final static By Plus = By.xpath("//div[@class='cart-quantity']//div//div//button[2]");
        private final static By TotalSum = By.xpath("//div[@class='cart-footer-b cart-cost']");
        private final static By CheckOut = By.xpath("//div[@class='cart-btnOrder']");




    }
    public void CheckClickElement() {
        waiters.waitVisabilityOfWebElent(Locators.Body);
        elements.clickOnElementBy(Locators.Body);
    }
    public void checkResaltsElementContainsText(String input) {
        waiters.waitVisabilityOfWebElent(Locators.BodyText);
        String result = elements.getTextFromElementBy(Locators.BodyText);
        assertions.equalsOfStrings(result, input);
    }
    public void CheckClickElement2() {
        waiters.waitVisabilityOfWebElent(Locators.Product);
        elements.clickOnElementBy(Locators.Product);
    }
    public void CheckClickElement3() {
        waiters.waitVisabilityOfWebElent(Locators.BuyElement);
        elements.clickOnElementBy(Locators.BuyElement);
    }
    public void CheckClickElement4() {
        waiters.waitElementToBeClickable(Locators.back);
        elements.clickOnElementBy(Locators.back);
    }
    public void checkResaltsElementContainsText2(String input) {
        waiters.waitVisabilityOfWebElent(Locators.BuyElement);
        String result = elements.getTextFromElementBy(Locators.BuyElement);
        assertions.equalsOfStrings(result, input);
    }
    public void ByText(String text) {
        waiters.waitVisabilityOfWebElent(Locators.coupon);
        elements.clickOnElementBy(Locators.coupon);
        waiters.waitVisabilityOfWebElent(Locators.coupon2);
        elements.sendKeysToElementBy(Locators.coupon2, text);
    }
    public void хpathaction() {

        action.moveToElementLocation(Locators.coupon2);
    }
    public void checkResaltsElementContainsText3(String input) {
        waiters.waitVisabilityOfWebElent(Locators.couponcheck);
        String result = elements.getTextFromElementBy(Locators.couponcheck);
        assertions.equalsOfStrings(result, input);
    }
    public void CheckClickElement5() {
        waiters.waitForVisabilityOfElement(Locators.Plus);
        elements.clickOnElementBy(Locators.Plus);
    }
    public String CheckToyalSum() {
        waiters.waitElementToBeClickable(Locators.TotalSum);
        return elements.getTextFromElementBy(Locators.TotalSum);
    }
    public void CheckResultTotalSum(String j, String g){
        assertions.elementFalse(j,g);
    }
    public void CheckElement(){

        assertions.elementIsDisplayed(Locators.CheckOut);
    }




}
