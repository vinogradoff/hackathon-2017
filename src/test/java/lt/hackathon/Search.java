package lt.hackathon;

import com.codeborne.selenide.Configuration;
import lt.hackathon.pageobjects.SearchPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class Search {

    @Test
    public void filter() throws InterruptedException {
        Configuration.browser = "chrome";
        open("https://www.amazon.com/");

        SearchPage searchPage = new SearchPage();

        searchPage.search("PlayStation 4");

        Thread.sleep(5000);
    }
}
