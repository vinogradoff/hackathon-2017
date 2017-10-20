package lt.hackathon.pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SelectShippingAddress {

    SelenideElement addressBook=$(".address-book");

    public void deliverTo(String name){
        SelenideElement nameText=addressBook.$(byText(name));
        nameText.shouldBe(visible);
        SelenideElement addressBox=nameText.closest("div").parent().parent();
        addressBox.shouldBe(visible);
        // click button
        addressBox.$(".ship-to-this-address").click();
    }

}


