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
        BasePage.mouseOver(newsLetter);
        newsLetter.click();
    }

    public void clickSpecialOffers(){
        BasePage.mouseOver(offers);
        offers.click();
    }

    public void fillFirstName(String fName){
        firstName.sendKeys(fName);
    }

    public void fillLastName(String lName){
        lastName.sendKeys(lName);
    }

    public void fillCompany(String nCompany){
        company.sendKeys(nCompany);
    }

    public void fillAddress1(String adrs1){
        address1.sendKeys(adrs1);
    }

    public void fillAddress2(String adrs2){
        address2.sendKeys(adrs2);
    }

    public void fillCity(String nCity){
        city.sendKeys(nCity);
    }

    public void clickState(String nState){
        BasePage.mouseOver(selectState);
        selectState.click();
        Select dropDown = new Select(id_state);
        dropDown.selectByVisibleText(nState);
    }

    public void fillZipCode(String zpCode){
        postcode.sendKeys(zpCode);
    }

    public void clickCountry(){
        selectCountry.click();
    }

    public void fillAdtIformation(String adtInoformation){
        other.sendKeys(adtInoformation);
    }

    public void fillHomePhone(String homePhone){
        phone.sendKeys(homePhone);
    }

    public void fillMobilePhone(String mobPhone){
        phone_mobile.sendKeys(mobPhone);
    }

    public void fillAliasAdress(String aliasAdress){
        alias.sendKeys(aliasAdress);
    }

    public void clickBtnRegister(){
        btnSubmitAccount.click();
    }

}
