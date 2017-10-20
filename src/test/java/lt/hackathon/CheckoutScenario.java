package lt.hackathon;

import lt.hackathon.pageobjects.CartWidget;
import lt.hackathon.pageobjects.ProceedToCheckoutWidget;
import lt.hackathon.pageobjects.SelectShippingAddress;
import lt.hackathon.steps.LoginStep;
import org.junit.Test;

import static com.codeborne.selenide.Condition.attribute;

public class CheckoutScenario {

    @Test
    public void checkoutAndPay(){
        LoginStep.login();
        CartWidget widget = new CartWidget();
        Integer itemsInCart=2;
        String itemsText=(itemsInCart==1)? ""+itemsInCart +" item": itemsInCart + " items";
        widget.cartWidget.shouldHave(attribute("aria-label",itemsText+" in cart"));
        widget.openShoppingCart();
        new ProceedToCheckoutWidget().proceedToCheckout();
        // Select shipping address
        new SelectShippingAddress().deliverTo("Selenide Team");
    }
}
