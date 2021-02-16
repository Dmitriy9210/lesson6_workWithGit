import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {

    @Test
    void searchGoogleTest(){
        open("https://www.google.com/");
        $(By.name("q")).setValue("Selenide");
        $(By.name("q")).pressEnter();

        $(".g").shouldHave(Condition.text("selenide.org"));
    }
}
