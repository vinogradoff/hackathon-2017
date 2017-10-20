package lt.hackathon.pageobjects.navigation_menu;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInLinkArea {

    public SelenideElement signIn=$("#nav-link-accountList");

    public void openSignInPage(){
        signIn.click();

    }
}
