package lt.hackathon;

import lt.hackathon.pageobjects.OrderWidget;
import lt.hackathon.steps.CheckoutSteps;
import lt.hackathon.steps.LoginStep;
import org.junit.Test;

import static com.codeborne.selenide.Condition.value;

public class CheckoutScenario {

    @Test
    public void checkoutAndPay(){
        LoginStep.login();
        CheckoutSteps.checkoutAndPay("SelenideTeam","Victoria Gerald","4532987522825600","12/2017");
        new OrderWidget().orderBtn.shouldHave(value("Place your order"));
        // we do not actually order
    }

}
