package lt.hackathon.pageobjects;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
// p.a-spacing-small>a
public class SellersPage {
    List<SelenideElement> listOfSellers = $$("div[role='main']>.olpOffer");
    //SelenideElement
    public void findBestSeller(){
        for (SelenideElement seller : listOfSellers) {
            String reliability = seller.$("p.a-spacing-small>a").getText().split("%")[0];

            if (Integer.parseInt(reliability) >= 90) {
                seller.$(".a-button-stack").click();
            }
        }
    }
}
