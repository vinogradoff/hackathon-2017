package lt.hackathon;

import lt.hackathon.pageobjects.navigation_menu.SignInLinkArea;
import lt.hackathon.steps.LoginStep;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;

public class LoginTest {

    @Test
    public void login(){
        LoginStep.login();
        String userFirstname = System.getProperty("amazon.firstname");
        new SignInLinkArea().signIn.shouldHave(text("Hello, "+userFirstname));
    }
}
