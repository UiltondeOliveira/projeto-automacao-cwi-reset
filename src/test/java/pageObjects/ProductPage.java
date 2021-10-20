package pageObjects;

import elementMapper.ProductPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class ProductPage extends ProductPageElementMapper {

    public ProductPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public String getProductNamePDP(){
        return productNamePDP.getText();
    }

    public void clickQuickView(){
        BasePage.mouseOver(productBlock);
        quickView.click();
    }

    public void clickQty(){
        quantity.click();
        quantity.sendKeys("2");
    }

    public void clickSelectSize(String size){
        BasePage.mouseOver(selectSize);
        selectSize.click();
        Select dropDown = new Select(sizeSelected);
        dropDown.selectByVisibleText(size);
    }

    public void selectColor(){
        BasePage.mouseOver(selectColor);
        color.click();
    }

    public void clickBtnAddToCart(){
        BasePage.mouseOver(btnAddToCart);
        btnAddToCart.click();
    }
}
