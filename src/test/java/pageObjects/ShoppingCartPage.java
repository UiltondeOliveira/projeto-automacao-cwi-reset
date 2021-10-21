package pageObjects;

import elementMapper.ShoppingCartPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ShoppingCartPage extends ShoppingCartPageElementMapper {
    public ShoppingCartPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public String getPageTitle(){
        return pageTitle.getText();
    }

    public void clickBtnProceedToCheckout(){
        btnProceedToCheckout.click();
    }

    public void clickBtnProceedToCheckoutSummary(){
        btnProceedToCheckoutSummary.click();
    }

    public void clickBtnProceedToCheckoutAddress(){
        btnProceedToCheckoutAddress.click();
    }

    public void clickBtnProceedToCheckoutShipping(){
        btnProceedToCheckoutShipping.click();
    }
    public void clickCheckboxAgree(){
        BasePage.mouseOver(checkboxAgree);
        checkboxAgree.click();
    }

    public String getProductNameOnCart(){
        return productName.getText();
    }

    public String getProductPriceOnCart(){
        return productPrice.getText();
    }

    public void clickBtnTypePayment(){
        btnTypePayment.click();
    }

    public void clickBtnConfirmMyOrder(){
        btnConfirmMyOrder.click();
    }

}
