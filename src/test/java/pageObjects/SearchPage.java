package pageObjects;

import elementMapper.SearchPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class SearchPage extends SearchPageElementMapper {

    public SearchPage (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public String getTextNavPage(){
        return navPage.getText();
    }

    public String getTextLighter(){
        return lighter.getText();
    }

    public String getTextHeadingCounter(){
        return headingCounter.getText();
    }

    public boolean isSearchPage(){
        return getTextNavPage().equals("Search");
    }

    public void clickSelectedProduct(){
        BasePage.mouseOver(selectProduct);
        selectProduct.click();
    }

    public void fillQty(String qty){
        quantity.click();
        quantity.clear();
        quantity.sendKeys(qty);
    }

    public void clickSelectSize(String size){
        BasePage.mouseOver(selectSize);
        selectSize.click();
        Select dropDown = new Select(sizeSelected);
        dropDown.selectByVisibleText(size);
    }

    public void selectColor(){
        BasePage.mouseOver(selectColor);
        coloPick.click();
    }

    public void clickBtnAddToCart(){
        BasePage.mouseOver(btnAddToCart);
        btnAddToCart.click();
    }

    public String getProductNameAddToCart(){
        return productNameAddToCart.getText();
    }

    public String getProductPriceAddToCart(){
        return productPriceAddToCart.getText();
    }

}
