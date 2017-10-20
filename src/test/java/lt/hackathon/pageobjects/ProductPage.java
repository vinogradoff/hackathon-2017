package lt.hackathon.pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    SelenideElement addToCartButton = $("#add-to-cart-button");

    public void addToCart() {
        addToCartButton.click();
    }
}
