package lt.hackathon;

import lt.hackathon.pageobjects.SignInPage;
import lt.hackathon.pageobjects.SignInLinkArea;
import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BuyGameConsoleScenario {

    @Test
    public void login(){
        open("/");
        SignInLinkArea signInLinkArea = new SignInLinkArea();
        signInLinkArea.openSignInPage();
        new SignInPage().login("alexei+selenide@vinogradoff.de","We1234");
        signInLinkArea.signIn.shouldHave(text("Hello, Selenide"));
    }


}
