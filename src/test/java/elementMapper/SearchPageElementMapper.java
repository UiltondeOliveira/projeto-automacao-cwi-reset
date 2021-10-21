package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageElementMapper {
    @FindBy(className = "navigation_page")
    public WebElement navPage;

    @FindBy(className = "lighter")
    public WebElement lighter;

    @FindBy(className = "heading-counter")
    public WebElement headingCounter;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]")
    public WebElement selectProduct;

    @FindBy(css = "#quantity_wanted")
    public WebElement quantity;

    @FindBy(id = "uniform-group_1")
    public WebElement selectSize;

    @FindBy (id = "group_1")
    public WebElement sizeSelected;

    @FindBy(id = "color_to_pick_list")
    public WebElement selectColor;

    @FindBy(id = "color_14")
    public WebElement coloPick;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/div/div[3]/h1")
    public WebElement productNameAddToCart;

    @FindBy(id = "our_price_display")
    public WebElement productPriceAddToCart;

    @FindBy(id = "add_to_cart")
    public WebElement btnAddToCart;





}
