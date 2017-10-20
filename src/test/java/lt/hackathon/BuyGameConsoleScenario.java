package lt.hackathon;

import lt.hackathon.pageobjects.ProductPage;
import lt.hackathon.pageobjects.checkout.OrderWidget;
import lt.hackathon.pageobjects.common.SearchPage;
import lt.hackathon.steps.CheckoutSteps;
import lt.hackathon.steps.LoginStep;
import org.junit.Test;

import static com.codeborne.selenide.Condition.value;

public class BuyGameConsoleScenario {




    @Test
    public void buyGameConsoleWithCamera(){
        LoginStep.login();
        String console=System.getProperty("order.mainproduct");
        new SearchPage().search(console);
        new ProductPage().addToCart();
        String camera=System.getProperty("order.additional_product");
        new SearchPage().search(camera);
        new ProductPage().addToCart();
        CheckoutSteps.checkoutAndPay("Selenide Team","Victoria Gerald","4532987522825600","12/2017");
        new OrderWidget().orderBtn.shouldHave(value("Place your order"));

    }


}
