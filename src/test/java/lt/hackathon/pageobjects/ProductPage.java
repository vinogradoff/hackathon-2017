package lt.hackathon.pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    SelenideElement addToCartButton = $("#add-to-cart-button"),
                    otherSellersLink = $("#olpDiv>a");


    public void addToCart(){
        addToCartButton.click();
    }

    public void goToOtherSellers(){
        otherSellersLink.click();
    }
}
