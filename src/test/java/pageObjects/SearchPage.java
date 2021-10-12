package pageObjects;

import elementMapper.SearchPageElementMapper;
import org.openqa.selenium.support.PageFactory;
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
}
