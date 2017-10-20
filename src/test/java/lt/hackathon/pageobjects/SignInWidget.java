package lt.hackathon.pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInWidget {

    public SelenideElement signIn=$("#nav-link-accountList");

    public void openSignInPage(){
        signIn.click();

    }
}
