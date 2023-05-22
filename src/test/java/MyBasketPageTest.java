import org.testng.annotations.Test;

public class MyBasketPageTest extends BaseTest {

    @Test
    public void CheckNameElement(){
        String NameElement = "Косметика для тіла";
        myBasketPage.openPage();
        myBasketPage.CheckClickElement();
        myBasketPage.checkResaltsElementContainsText(NameElement);
    }

    @Test
    public void CheckAddProduct() throws InterruptedException {
        String basket = "В кошику";
        myBasketPage.openPage2();
        Thread.sleep(2000);
        myBasketPage.CheckClickElement2();
        myBasketPage.CheckClickElement3();
        myBasketPage.CheckClickElement4();
        myBasketPage.checkResaltsElementContainsText2(basket);
    }

    @Test
    public void CheckAddCoupon() throws InterruptedException {
        String failedCupon = "Код неправильний";
        myBasketPage.openPage2();
        myBasketPage.CheckClickElement2();
        myBasketPage.CheckClickElement3();
        Thread.sleep(2000);
        myBasketPage.ByText("50%");
        myBasketPage.хpathaction();
        myBasketPage.checkResaltsElementContainsText3(failedCupon);
    }
    @Test
    public void CheckAddProductQuantity () throws InterruptedException {
        myBasketPage.openPage2();
        myBasketPage.CheckClickElement2();
        myBasketPage.CheckClickElement3();
        String sum1 = myBasketPage.CheckToyalSum();
        myBasketPage.CheckClickElement5();
        Thread.sleep(2000);
        String sum2 = myBasketPage.CheckToyalSum();
        System.out.println("sum1-"+sum1+" sum2-"+sum2);
        myBasketPage.CheckResultTotalSum(sum1,sum2);
    }
    @Test
    public void CheckAvailabilityElement() throws InterruptedException {
        myBasketPage.openPage2();
        myBasketPage.CheckClickElement2();
        myBasketPage.CheckClickElement3();
        Thread.sleep(2000);
        myBasketPage.CheckElement();
    }





}
