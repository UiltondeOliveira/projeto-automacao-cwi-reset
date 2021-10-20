package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateAnAccountPageElementMapper {
    @FindBy(css = "#noSlide > h1")
    public WebElement pageTitle;

    @FindBy(css = ".clearfix .radio-inline")
    public WebElement gender;

    @FindBy(id = "id_gender1")
    public WebElement radioGender;

    @FindBy(css = "#customer_firstname")
    public WebElement cFirstName;

    @FindBy(css = "#customer_lastname")
    public WebElement cLastName;

    public WebElement email;

    @FindBy(id="passwd")
    public WebElement password;

    @FindBy(id="uniform-days")
    public WebElement selectDays;

    public WebElement days;

    @FindBy(id="uniform-months")
    public WebElement selectMonths;

    public WebElement months;

    @FindBy(id="uniform-years")
    public WebElement selectYears;

    public WebElement years;

    @FindBy(id = "newsletter")
    public WebElement newsLetter;

    @FindBy(id = "optin")
    public WebElement offers;

    public WebElement company;

    public WebElement address1;

    public WebElement address2;

    public WebElement city;

    @FindBy(id = "uniform-id_state")
    public WebElement selectState;

    public WebElement id_state;

    public WebElement postcode;

    @FindBy(id = "uniform-id_country")
    public WebElement selectCountry;

    public WebElement other;

    public WebElement phone;

    public WebElement phone_mobile;

    public WebElement alias;

    @FindBy(id="submitAccount")
    public WebElement btnSubmitAccount;
}
