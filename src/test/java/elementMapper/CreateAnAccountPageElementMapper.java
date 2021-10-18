package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateAnAccountPageElementMapper {
    @FindBy(css = ".clearfix .radio-inline")
    public WebElement gender;

    @FindBy(id = "id_gender1")
    public WebElement radioGender;

    @FindBy(id = "customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lastName;

    @FindBy(id = "email")
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

}
