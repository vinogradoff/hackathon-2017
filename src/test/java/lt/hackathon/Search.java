package lt.hackathon;

import com.codeborne.selenide.Configuration;
import lt.hackathon.pageobjects.ProductPage;
import lt.hackathon.pageobjects.SearchPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class Search {

    @Test
    public void filter() throws InterruptedException {
        Configuration.browser = "chrome";
        open("https://www.amazon.com/");

        new SearchPage().search(SearchPage.ProductType.CONSOLE, "PlayStation 4");
        new ProductPage().addToCart();



        Thread.sleep(5000);
    }
}
