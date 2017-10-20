package lt.hackathon.pageobjects.checkout;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SelectShippingOptions {

    SelenideElement container=$(".checkout-page-form"),
            continueBtn=container.$(".sosp-continue-button");

    public void chooseStandard() {
        continueBtn.click();
    }
}
