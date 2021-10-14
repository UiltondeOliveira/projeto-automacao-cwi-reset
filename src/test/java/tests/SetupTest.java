package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a URL!");
    }

    @Test
    public void testLogin(){

        //Inciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickBtnLogin();
        System.out.println("Clicou em Sign In e redirecionou para a página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
        .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

        login.fillEmail();
        System.out.println("Preencheu o Login");
        login.fillPasswd();
        System.out.println("Preencheu a senha");
        login.clickBtnSubmitLogin();
        System.out.println("Clicou em Sign In");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
        .contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Valida a url da minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
        .getText().contains("MY ACCOUNT"));
        System.out.println("Validou Minha Conta no site");
    }

    @Test
    public void testSearch(){

        String quest = "DRESS";
        String questResult = "7";
//        Iniciar as páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

//        Fazer a pesquisa
        home.doSearch(quest);

//      Validar a pesquisa
        Assert.assertTrue(search.isSearchPage());
        Assert.assertEquals(search.getTextLighter().replace("\"",""),quest);
        assertThat(search.getTextHeadingCounter(), CoreMatchers.containsString(questResult));
    }

    @Test
    public void testAccessCategoryTSshirts(){
//      Iniciar as páginas
        HomePage home = new HomePage();

//      Clicar na categoria T-Shirt
        home.clickCategoryTShirts();
    }
}
