package lt.hackathon;

import com.sun.javafx.runtime.SystemProperties;
import lt.hackathon.pageobjects.SignInPage;
import lt.hackathon.pageobjects.SignInLinkArea;
import lt.hackathon.steps.LoginStep;
import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BuyGameConsoleScenario {

    @Test
    public void login(){
        LoginStep.login();
        String userFirstname = System.getProperty("amazon.firstname");
        new SignInLinkArea().signIn.shouldHave(text("Hello, "+userFirstname));
    }

}
