package lt.hackathon;

import lt.hackathon.pageobjects.OrderWidget;
import lt.hackathon.pageobjects.checkout.PaymentOptions;
import lt.hackathon.pageobjects.checkout.SelectShippingAddress;
import lt.hackathon.pageobjects.checkout.SelectShippingOptions;
import lt.hackathon.pageobjects.common.ProceedToCheckoutWidget;
import lt.hackathon.pageobjects.navigation_menu.CartWidget;
import lt.hackathon.steps.LoginStep;
import org.junit.Test;

import static com.codeborne.selenide.Condition.value;

public class CheckoutScenario {

    @Test
    public void checkoutAndPay(){
        LoginStep.login();
        CartWidget widget = new CartWidget();
        //Integer itemsInCart=2;
        //String itemsText=(itemsInCart==1)? ""+itemsInCart +" item": itemsInCart + " items";
        //widget.cartWidget.shouldHave(attribute("aria-label",itemsText+" in cart"));
        widget.openShoppingCart();
        new ProceedToCheckoutWidget().proceedToCheckout();
        // Select shipping address
        new SelectShippingAddress().deliverTo("Selenide Team");
        new SelectShippingOptions().chooseStandard();
        new PaymentOptions().payWithCreditcard("Victoria Gerald","4532987522825600","12/2017");
        new OrderWidget().orderBtn.shouldHave(value("Place your order"));
        // we do not actually order
    }
}
