package pageObjects;

import elementMapper.CreateAnAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

import java.util.Locale;

public class CreateAnAccountPage extends CreateAnAccountPageElementMapper {
    public CreateAnAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void clickRadioGender(){
        BasePage.mouseOver(gender);
        radioGender.click();
    }

    public void fillCFirstName(String cfName){
        cFirstName.sendKeys(cfName);
    }

    public void fillCLastName(String clName){
        cLastName.sendKeys(clName);
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

    public void clickNewsLetter(){

    }

    public void clickSpecialOffers(){

    }

    public void fillFistName(){

    }

    public void fillLastName(){

    }

    public void fillCompany(){

    }

    public void fillAddress1(){

    }

    public void fillAddress2(){

    }

}
