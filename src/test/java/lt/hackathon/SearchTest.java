package lt.hackathon;

import lt.hackathon.pageobjects.ProductPage;
import lt.hackathon.pageobjects.SellersPage;
import lt.hackathon.pageobjects.common.SearchPage;
import lt.hackathon.steps.LoginStep;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    @Test
    public void filter()  {
        open("/");
        new SearchPage().search("PlayStation 4 camera");
        new ProductPage().goToOtherSellers();
        new SellersPage().findBestSeller();

    }

    @Test
    public void search(){
        LoginStep.login();
        new SearchPage().search("Playstation 4");
        new ProductPage().addToCart();
    }

    @Test
    public void searchCamera(){
        LoginStep.login();
        new SearchPage().search("Playstation 4 camera");
        new ProductPage().addToCart();
    }
}
