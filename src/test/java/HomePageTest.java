import StepObject.HomePageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.HomePageData.fakeemail;
import static DataObject.HomePageData.item;

public class HomePageTest extends ChromeRunner {
    HomePageSteps homePageSteps = new HomePageSteps();

    @Test
    @Severity(SeverityLevel.MINOR)
    public void searchForitem() {
        homePageSteps.searchForitem(item);
        Assert.assertTrue(homePageSteps.searchbutton.isDisplayed());
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    public void incorrectemail() {
        homePageSteps.signin()
                .email(fakeemail)
                .login()
                        .passwordinput.pressEnter();
        Assert.assertFalse(HomePageSteps.prblm.is(Condition.visible));
    }
}

