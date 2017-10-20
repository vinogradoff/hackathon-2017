package lt.hackathon.pageobjects.checkout;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PaymentOptions {

    SelenideElement newCardContainer= $(".new-payment-line"),
            addNewCardBtn=newCardContainer.$("[data-expander-content=new-cc]"),
            ccName=newCardContainer.$("#ccName"),
            ccNumber=newCardContainer.$("#addCreditCardNumber"),
            ccExpMonthBtn=newCardContainer.$("#ccMonth").parent().$("button"),
            ccExpYearBtn=newCardContainer.$("#ccYear").parent().$("button"),
            addCardBtn=newCardContainer.$("#ccAddCard"),
            continueBtn=$("#continue-top");


    ElementsCollection   expMonth=$$(".a-popover.a-dropdown li a"),
                    expYear=$(".a-popover.a-dropdown",1 ).$$("li a");



    /**
     *
     * @param name
     * @param number Cardnumber without spaces
     * @param expDate MM/YYYY
     */
    public void payWithCreditcard(String name, String number, String expDate) {
        addNewCardBtn.click();
        ccName.setValue(name);
        ccNumber.setValue(number);
        String month=expDate.substring(0,2);
        String year=expDate.substring(3);
        // strange behavior. The first click just opens dropdown short, than closes it agein
        ccExpMonthBtn.hover().click();
        sleep(1000);
        ccExpMonthBtn.hover().click();
        expMonth.findBy(text(month)).click();
        ccExpYearBtn.click();
        expYear.findBy(text(year)).click();
        addCardBtn.click();
        continueBtn.click();

    }
}
