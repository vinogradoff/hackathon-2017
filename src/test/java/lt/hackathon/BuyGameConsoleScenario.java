package lt.hackathon;

import com.sun.javafx.runtime.SystemProperties;
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
        String userEmail= System.getProperty("amazon.username"),
                userPassword=System.getProperty("amazon.password"),
                userFirstname=System.getProperty("amazon.firstname");
        new SignInPage().login(userEmail,userPassword);
        signInLinkArea.signIn.shouldHave(text("Hello, "+userFirstname));
    }


}
