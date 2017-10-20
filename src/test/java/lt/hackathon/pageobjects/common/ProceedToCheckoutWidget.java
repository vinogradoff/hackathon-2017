package lt.hackathon.pageobjects.common;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProceedToCheckoutWidget {

    SelenideElement proceedToCheckoutButton=$("[name=proceedToCheckout");

    public void proceedToCheckout(){
        proceedToCheckoutButton.click();
    }
}
