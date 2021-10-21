package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPageElementMapper {

    @FindBy(className = "cart_title")
    public WebElement pageTitle;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public WebElement btnProceedToCheckout;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public WebElement btnProceedToCheckoutSummary;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    public WebElement btnProceedToCheckoutAddress;

    @FindBy(id = "cgv")
    public WebElement checkboxAgree;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    public WebElement btnProceedToCheckoutShipping;

    @FindBy(xpath = "//*[@id=\"product_5_24_0_588208\"]/td[2]/p")
    public WebElement productName;

    @FindBy(xpath = "//*[@id=\"product_price_5_24_588208\"]/span[1]")
    public WebElement productPrice;

    @FindBy(css = "#HOOK_PAYMENT > div:nth-child(1) > div > p > a")
    public WebElement btnTypePayment;

    @FindBy(css = "#cart_navigation > button")
    public WebElement btnConfirmMyOrder;




}
