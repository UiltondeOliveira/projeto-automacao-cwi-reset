package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillEmail(){
        email.sendKeys("superman1930@gmail.com");
    }

    public void fillPasswd(){
        passwd.sendKeys("19302021");
    }

    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }

    public void fillEmailAdress(String mail){ email_create.sendKeys(mail);
    }
    public void clickBtnCreateAnAccout(){
        SubmitCreate.click();}
}
