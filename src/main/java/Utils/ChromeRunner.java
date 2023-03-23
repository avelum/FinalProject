package Utils;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;
public class ChromeRunner {
    @BeforeMethod(description = "configure browser before tests")
    public void setUp() {
        open("https://www.amazon.com/");
    }
    @AfterMethod(description = "close browser and clear cookies")
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}



