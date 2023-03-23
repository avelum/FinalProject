package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement searchBox = $("#twotabsearchtextbox");
   public SelenideElement searchbutton = $("#nav-search-submit-button");
   public static SelenideElement signinbtn = $(".nav-line-1-container");
   public static SelenideElement emailinput = $("#ap_email");
   public SelenideElement submitbtn = $(".a-button-input");
   public SelenideElement passwordinput = $("#ap_password");
   public static SelenideElement prblm = $(".a-alert-heading");

}
