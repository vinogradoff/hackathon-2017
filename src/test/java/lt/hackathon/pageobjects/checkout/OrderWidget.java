package lt.hackathon.pageobjects.checkout;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OrderWidget {
    public SelenideElement orderBtn=$("[title='Place your order']");
}
