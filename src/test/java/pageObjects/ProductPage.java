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

}
