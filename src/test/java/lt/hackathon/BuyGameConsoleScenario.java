package lt.hackathon;

import lt.hackathon.pageobjects.SearchPage;
import lt.hackathon.pageobjects.SignInLinkArea;
import lt.hackathon.steps.LoginStep;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;

public class BuyGameConsoleScenario {

    @Test
    public void login(){
        LoginStep.login();
        String userFirstname = System.getProperty("amazon.firstname");
        new SignInLinkArea().signIn.shouldHave(text("Hello, "+userFirstname));
    }


    @Test
    public void search(){
        LoginStep.login();
        new SearchPage().search("Playstation 4");
    }
}
