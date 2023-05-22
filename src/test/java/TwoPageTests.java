import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.TwoPage;

import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertTrue;

public class TwoPageTests extends BaseTest{

    @Test
    public void CheckNamePage(){
        twoPage.openPage();
        twoPage.checkResaltsElementContainsText("Засоби для прання");
    }

    @Test
    public void ChecklabelsOtherDishes() {
        twoPage.openPage();
        twoPage.checkResaltsElementContainsText2();
    }
    @Test
    public void CheckPresenceOfFilter(){
        twoPage.openPage();
        twoPage.CheckElement();
    }

    @Test
    public void CheckSendComent() throws InterruptedException {
        twoPage.openPage();
        twoPage.CheckClickElement();
        Thread.sleep(2000);
        twoPage.CheckClickElement2();
        String one = "Вкажіть ім'я";
        twoPage.checkResaltsElementContainsText3(one);
    }
    @Test
    public void CheckTextElement(){
        twoPage.openPage();
        String schedule = "Графік роботи: 09:00-21:00";
        twoPage.checkResaltsElementContainsText5(schedule);
        }
    }






