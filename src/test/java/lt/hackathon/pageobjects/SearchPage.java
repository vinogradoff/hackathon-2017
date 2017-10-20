package lt.hackathon.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    SelenideElement searchField = $("#twotabsearchtextbox"),
            consolesLink = $(By.xpath("//*[@id='leftNavContainer']//*[contains(text(),'Console')]")),
            shipToCheckbox = $(By.xpath("//*[@id='leftNavContainer']//*[starts-with(text(),'Ship to')]/ancestor::label/input")),
            includeOutOfStockCheckbox = $(By.xpath("//*[@id='leftNavContainer']//*[contains(text(),'Include Out of Stock')]/ancestor::label/input"));


    public void search(String searchItem) {
        searchField.sendKeys(searchItem);
        searchField.submit();

        consolesLink.click();

        if (shipToCheckbox.getValue().equals("false")) {
            shipToCheckbox.click();
        }

        if (includeOutOfStockCheckbox.getValue().equals("true")) {
            includeOutOfStockCheckbox.click();
        }
    }
}
