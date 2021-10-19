package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.*;

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
        CategoryPage category = new CategoryPage();

//      Clicar na categoria T-Shirt
        home.clickCategoryTShirts();

//      Validar se ao clicar na categoria T-Shirts ocorre o redirecionamento correto
        assertTrue(category.isPageTShirts());
    }

    @Test
    public void testAddProductToProductPage(){
//      Acessar a categoria T-Shirts
        testAccessCategoryTSshirts();

//      Inicia as páginas
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();

//      Salva o nome do produto na página de categoria
        String nameProductCategory = category.getProductNameCategory();

//      Clicar em More e direcionar para a página do produto
        category.clickProductAddToProductPage();

//      Validar se o produto está na página de detalhes do produto corretamente
        assertTrue(pdp.getProductNamePDP().equals(nameProductCategory));
    }

    @Test
    public void testCreateAnAccount(){

        String firstName = "José";
        String lastName = "Rodrigues";
        String mail = "joserodrigues@gmail.com";
        String pass = "12345";
        String day = "14";
        String month = "5";
        String year = "1987";

//      Inicia as páginas
        HomePage home = new HomePage();
        LoginPage createAccount = new LoginPage();
        CreateAnAccountPage account = new CreateAnAccountPage();

//      Clica  no botãao login e redireciona para a página de login
        home.clickBtnLogin();
        System.out.println("Clicou em Sign In e redirecionou para a página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
        .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

//      Insere o email no campo email adress e clica no botão Create an Account
        createAccount.fillEmailAdress(mail);
        System.out.println("Preencheu o campo Email Adress");
        createAccount.clickBtnCreateAnAccout();
        System.out.println("Clicou no botão Create an Account");

//      Validar se ao clicar na Create An Account ocorre o redirecionamento correto
//      Assert.assertTrue(account.isPageCreateAnAccount());


//      Insere as informações na página Create An Account
        account.clickRadioGender();
        account.fillCFirstName(firstName);
        account.fillCLastName(lastName);
        account.checkMail();
        account.fillPasswd(pass);
        account.clickDayOfBirthday(day);
        account.clickMonthOfBirthday(month);
        account.clickYearOfBirthday(year);


    }
}
