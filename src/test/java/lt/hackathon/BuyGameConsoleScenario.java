package lt.hackathon;

import com.codeborne.selenide.Condition;
import lt.hackathon.pageobjects.SignInPage;
import lt.hackathon.pageobjects.SignInWidget;
import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class BuyGameConsoleScenario {

    @Test
    public void login(){
        open("/");
        SignInWidget signInWidget = new SignInWidget();
        signInWidget.openSignInPage();
        new SignInPage().login("alexei+selenide@vinogradoff.de","We1234");
        signInWidget.signIn.shouldHave(text("Hello, Selenide"));
    }


}
