import functions.ActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class OnePageTests extends BaseTest {
    @Test
    public void checkWebPageTitle(){
        onePage.openPage();
        String pageTitle = "PROSTOR ❤️ интернет магазин косметики в Украине";
        assertions.equalsOfElementAndLabelText(driver, pageTitle);
    }
     @Test
    public void checkSerch() throws InterruptedException {
    String input = "шампунь";
    onePage.openPage();
    onePage.searchByText(input);
    onePage.хpathaction();
    Thread.sleep(2000);
    onePage.checkResaltsElementContainsText(input);
     }

     @Test
     public void checklanguages (){
         String sale = "Акції";
         onePage.openPage();
         onePage.CheckClickElement1();
         onePage.CheckClickElement2();
        onePage.checkResaltsElementContainsText2(sale);
         }
         @Test
    public void checklable() throws InterruptedException {
             String mail = "email";
             onePage.openPage();
             JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("scrollBy(0,3000)");

             WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='https://secure.esputnik.com.ua/RMApf5L2Ws']"));
             driver.switchTo().frame(frame1);
             driver.findElement(By.xpath("//div[@class='form-line line-2']")).click();
             Thread.sleep(2000);
             WebElement input = driver.findElement(By.xpath("//input[@placeholder='e-mail']"));
             input.sendKeys(mail);
             String resalt = "Потрібен коректний e-mail";
             onePage.CheckClickElement3();
             onePage.checkResaltsElementContainsText3(resalt);
         }
         @Test
         public void AvailabilityPhone(){
         onePage.openPage();
         onePage.CheckElement();
         }
}



