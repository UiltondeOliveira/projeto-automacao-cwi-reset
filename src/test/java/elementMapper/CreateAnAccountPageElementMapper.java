package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateAnAccountPageElementMapper {
    @FindBy(css = ".clearfix .radio-inline")
    public WebElement gender;

    @FindBy(id = "id_gender1")
    public WebElement radioGender;

    @FindBy(id = "customer_firstname")
    public WebElement cFirstName;

    @FindBy(id = "customer_lastname")
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

    @FindBy(css = "checker")
    public WebElement checkBox;

    @FindBy(xpath = "//*[@id=\"noSlide\"]/h1")
    public WebElement titlePage;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    public WebElement company;

    public WebElement adress1;

    public WebElement adress2;

    public WebElement city;

    @FindBy(id = "uniform-id_state")
    public WebElement SelectState;

    public WebElement id_state;

    public WebElement postcode;

    @FindBy(id = "uniform-id_country")
    public WebElement SelectCountry;

    public WebElement id_country;

    public WebElement other;

    public WebElement phone;

    public WebElement phone_mobile;

    public WebElement alias;

    @FindBy(id="submitAccountsubmitAccount")
    public WebElement btnSubmitAccount;
}
