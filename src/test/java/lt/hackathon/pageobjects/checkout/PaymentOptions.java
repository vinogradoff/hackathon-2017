package lt.hackathon.pageobjects.checkout;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PaymentOptions {

    SelenideElement newCardContainer= $(".new-payment-line"),
            addNewCardBtn=newCardContainer.$("[data-expander-content=new-cc]"),
            ccName=newCardContainer.$("#ccName"),
            ccNumber=newCardContainer.$("#addCreditCardNumber");

    public void payWithCreditcard(String name, String number, String s) {
        addNewCardBtn.click();
        ccName.setValue(name);
        ccNumber.setValue(number);

    }
}
