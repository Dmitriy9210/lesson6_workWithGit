import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {

    @Test
    void searchGoogleTest(){
        open("https://www.google.com/");
        $(By.name("q")).setValue("Selenide");
        $(By.name("q")).pressEnter();

        $(".g").shouldHave(text("selenide.org"));
    }

    @Test
    void searchYahooTest(){
        open("https://www.yahoo.com/");

        $(By.name("p")).val("selenide").pressEnter();

        $("#results").shouldHave(text("selenide.org"));
    }
}
