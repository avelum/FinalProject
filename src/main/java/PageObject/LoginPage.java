package PageObject;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
public class LoginPage {
    public SelenideElement gotocart = $("#nav-cart-count-container");
    public SelenideElement signupnow = $("#a-autoid-1");
    public SelenideElement nameinput = $("#ap_customer_name");
    public SelenideElement alert1 = $("#auth-customerName-missing-alert");
  public SelenideElement signinbtn = $("#nav-link-accountList-nav-line-1");
  public SelenideElement emailinput = $("#ap_email");
    public SelenideElement continuebtn = $("#continue");
    public SelenideElement passwordinput = $("#ap_password");
    public SelenideElement signinbtn1 = $("#signInSubmit");
    public SelenideElement searchinput = $("#twotabsearchtextbox");
    public SelenideElement searchbtn = $("#nav-search-submit-button");
    public SelenideElement checkbox = $(".a-icon a-icon-checkbox");
    public SelenideElement amount = $("#sc-subtotal-amount-activecart");
    public SelenideElement dropdownlbl = $(".a-dropdown-label");
}
