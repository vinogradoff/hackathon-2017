package lt.hackathon.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {
    public enum ProductType{
        CONSOLE("Console"),
        ACCESSORIES("Accessories");

        private final String text;

        private ProductType(String text) {
            this.text = text;
        }
    }

    SelenideElement searchField = $("#twotabsearchtextbox"),
            consolesLink = $(By.xpath("//*[@id='leftNavContainer']//*[contains(text(),'Console')]")),
            shipToCheckbox = $(By.xpath("//*[@id='leftNavContainer']//*[starts-with(text(),'Ship to')]/ancestor::label/input")),
            includeOutOfStockCheckbox = $(By.xpath("//*[@id='leftNavContainer']//*[contains(text(),'Include Out of Stock')]/ancestor::label/input"));

    List<SelenideElement> resultsList = $$("#s-results-list-atf>li");


    public void search(ProductType productType, String searchItem) {
        searchField.sendKeys(searchItem);
        searchField.submit();

        SelenideElement productTypeLink = $(By.xpath("//*[@id='leftNavContainer']//*[contains(text(),'"+ productType + "')]"));
        consolesLink.click();

        if (shipToCheckbox.getValue().equals("false")) {
            shipToCheckbox.click();
        }

        if (includeOutOfStockCheckbox.getValue().equals("true")) {
            includeOutOfStockCheckbox.click();
        }

        resultsList.get(0).$("a.s-access-detail-page").click();
    }
}
