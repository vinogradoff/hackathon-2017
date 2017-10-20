package lt.hackathon.pageobjects.navigation_menu;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartWidget {


    public SelenideElement cartWidget= $("#nav-cart");

    public void openShoppingCart(){
        cartWidget.click();
    }


}
