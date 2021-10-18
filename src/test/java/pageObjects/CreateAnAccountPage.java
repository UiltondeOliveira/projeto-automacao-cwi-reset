package pageObjects;

import elementMapper.CreateAnAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class CreateAnAccountPage extends CreateAnAccountPageElementMapper {
    public CreateAnAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void clickRadioGender(){
        BasePage.mouseOver(gender);
        radioGender.click();
    }

    public void fillFirstName(String fName){
        firstName.sendKeys(fName);
    }

    public void fillLastName(String lName){
        lastName.sendKeys(lName);
    }

    public void checkMail(){
        email.click();
    }

    public void fillPasswd(String pass){
        password.sendKeys(pass);
    }

    public void clickDayOfBirthday(String day){
        BasePage.mouseOver(selectDays);
        days.click();
        Select dropDown = new Select(days);
        dropDown.selectByValue(day);
    }

    public void clickMonthOfBirthday(String month){
        BasePage.mouseOver(selectMonths);
        months.click();
        Select dropDown = new Select(months);
        dropDown.selectByValue(month);
    }

    public void clickYearOfBirthday(String year){
        BasePage.mouseOver(selectYears);
        years.click();
        Select dropDown = new Select(years);
        dropDown.selectByValue(year);
    }

}
