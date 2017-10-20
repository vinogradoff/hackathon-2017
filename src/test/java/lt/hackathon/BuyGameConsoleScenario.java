package lt.hackathon;

import lt.hackathon.pageobjects.SignInWidget;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class BuyGameConsoleScenario {

    @Test
    public void login(){
        open("/");
        new SignInWidget().openSignInPage();
        //"alexei+selenide@vinogradoff.de","We1234");

    }
}
