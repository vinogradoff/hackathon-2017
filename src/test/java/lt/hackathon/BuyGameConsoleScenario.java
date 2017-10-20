package lt.hackathon;

import lt.hackathon.pageobjects.SearchPage;
import lt.hackathon.pageobjects.SignInLinkArea;
import lt.hackathon.pageobjects.SignInPage;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
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
        new SearchPage().search("PlayStation 4");
    }


}
