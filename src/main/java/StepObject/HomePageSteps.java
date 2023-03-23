package StepObject;

import PageObject.HomePage;
import com.codeborne.selenide.Condition;

public class HomePageSteps extends HomePage {
    public HomePageSteps searchForitem(String item){
        searchBox.setValue(item);
        searchbutton.click();
        return this;
    }
    public HomePageSteps signin (){
        signinbtn.click();
        return this;
    }
    public HomePageSteps email(String fakeemail){
        emailinput.setValue(fakeemail);
        return this;
    }
    public HomePageSteps login(){
        submitbtn.click();
        return this;
    }
    public HomePageSteps password (String fakepassword){
        passwordinput.setValue(fakepassword);
        prblm.shouldBe(Condition.visible);
        return this;
    }
}
