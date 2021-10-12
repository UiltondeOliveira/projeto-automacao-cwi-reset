package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {
    @FindBy(className = "login")
    public WebElement login;

    @FindBy(id = "search_query_top")
    public WebElement searchBox;

    @FindBy(name = "submit_search")
    public WebElement btnSubmitSearch;
}
