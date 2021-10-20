package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElementMapper {

    @FindBy(css = "h1[itemprop=name]")
    public WebElement productNamePDP;

    @FindBy(className = "left-block")
    public WebElement productBlock;

    @FindBy(className = "quick-view")
    public WebElement quickView;

    @FindBy(css = "#quantity_wanted")
    public WebElement quantity;

    @FindBy(id = "uniform-group_1")
    public WebElement selectSize;

    @FindBy (id = "group_1")
    public WebElement sizeSelected;

    @FindBy(id = "color_to_pick_list")
    public WebElement selectColor;

    @FindBy(id = "color_14")
    public WebElement color;

    @FindBy(id = "add_to_cart")
    public WebElement btnAddToCart;
}
