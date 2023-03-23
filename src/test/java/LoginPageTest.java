import StepObject.LoginPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginPageTest extends ChromeRunner {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Test
    @Severity(SeverityLevel.MINOR)
    public void accountcreation() {
        loginPageSteps.gotocartpage()
                .signup()
                .continuebtn();
        assertTrue(loginPageSteps.alert1.is(Condition.visible));
    }

    @Test
    @Severity(SeverityLevel.MINOR)
    public void dropcheck() {
        loginPageSteps.signinn()
                .putemail()
                .continuetml()
                .passin()
                .signinbtnn()
                .searchitm()
                .searchbtnn();
        System.out.println(loginPageSteps.searchitm().searchinput.getValue());
        Assert.assertTrue(loginPageSteps.dropdownlbl.is(Condition.visible));
    }
}

