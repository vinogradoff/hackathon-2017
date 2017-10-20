package lt.hackathon;

import com.codeborne.selenide.Selenide;
import org.junit.Test;

public class GoogleTest {

    @Test
    public void testGoogle(){
        Selenide.open("http://google.com");
    }

}
