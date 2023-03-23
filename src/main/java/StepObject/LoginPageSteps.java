package StepObject;

import PageObject.LoginPage;

import static DataObject.LoginPageData.*;

public class LoginPageSteps extends LoginPage {
    public LoginPageSteps gotocartpage() {
        gotocart.click();
        return this;
    }

    public LoginPageSteps signup() {
        signupnow.click();
        return this;
    }
    public LoginPageSteps continuebtn() {
        continuebtn.click();
        return this;
    }
    public LoginPageSteps signinn() {
        signinbtn.click();
        return this;
    }

    public LoginPageSteps putemail() {
        emailinput.setValue(email);
        return this;
    }

    public LoginPageSteps continuetml() {
        continuebtn.click();
        return this;
    }
    public LoginPageSteps passin() {
        passwordinput.setValue(password);
        return this;
    }
    public LoginPageSteps signinbtnn() {
        signinbtn1.click();
        return this;
    }

    public LoginPageSteps searchitm() {
        searchinput.setValue(item);
        return this;
    }
    public LoginPageSteps searchbtnn() {
        searchbtn.click();
        return this;
    }

}
