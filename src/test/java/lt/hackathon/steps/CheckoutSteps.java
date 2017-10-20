package lt.hackathon.steps;

import lt.hackathon.pageobjects.checkout.PaymentOptions;
import lt.hackathon.pageobjects.checkout.SelectShippingAddress;
import lt.hackathon.pageobjects.checkout.SelectShippingOptions;
import lt.hackathon.pageobjects.common.ProceedToCheckoutWidget;
import lt.hackathon.pageobjects.navigation_menu.CartWidget;

public class CheckoutSteps {
    /**
     *
     * @param deliverTo
     * @param cardname
     * @param cardnumber Cardnumber without spaces
     * @param expDate MM/YYYY
     */
    public static void checkoutAndPay(String deliverTo, String cardname, String cardnumber, String expDate) {
        CartWidget widget = new CartWidget();
        //Integer itemsInCart=2;
        //String itemsText=(itemsInCart==1)? ""+itemsInCart +" item": itemsInCart + " items";
        //widget.cartWidget.shouldHave(attribute("aria-label",itemsText+" in cart"));
        widget.openShoppingCart();
        new ProceedToCheckoutWidget().proceedToCheckout();
        new SelectShippingAddress().deliverTo(deliverTo);
        new SelectShippingOptions().chooseStandard();
        new PaymentOptions().payWithCreditcard(cardname,cardnumber,expDate);
    }
}
