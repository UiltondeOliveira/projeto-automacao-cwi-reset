package pageObjects;

import elementMapper.HomePageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {

    public HomePage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Clicou em Sign In e redirecionou para a página de login")
    public void clickBtnLogin(){
        login.click();
    }

    public void clickSearchBox(){
        searchBox.click();
    }

    public void sendKeysSearchBox(String keys){
        searchBox.sendKeys(keys);
    }

    public void clickBtnSubmitSearch(){
        btnSubmitSearch.click();
    }

    public void doSearch(String quest){
        clickSearchBox();
        sendKeysSearchBox(quest);
        clickBtnSubmitSearch();
    }

    public void clickCategoryTShirts(){
        menuTShirts.click();
    }
}
