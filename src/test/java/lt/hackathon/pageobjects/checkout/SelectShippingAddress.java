package lt.hackathon.pageobjects.checkout;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SelectShippingAddress {

    SelenideElement addressBook=$(".address-book");

    public void deliverTo(String name){
        SelenideElement nameText=addressBook.$(byText(name));
        SelenideElement addressBox=nameText.closest("div").parent().parent();
        // click deliver button
        addressBox.$(".ship-to-this-address").click();
    }

}


