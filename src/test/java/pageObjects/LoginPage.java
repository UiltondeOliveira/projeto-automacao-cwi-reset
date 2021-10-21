package pageObjects;

import elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Preencheu o Login")
    public void fillEmail(){
        email.sendKeys("superman1930@gmail.com");
    }

    @Step("Preencheu a senha")
    public void fillPasswd(){
        passwd.sendKeys("19302021");
    }

    @Step("Clicou em Sign In")
    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }

    public void fillEmailAdress(String mail){ email_create.sendKeys(mail);
    }
    public void clickBtnCreateAnAccout(){
        SubmitCreate.click();}
}
