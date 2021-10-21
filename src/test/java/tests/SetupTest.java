package tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import java.util.Random;

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
        Assert.assertTrue(pdp.getProductNamePDP().equals(nameProductCategory));
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Verificar a criação de uma conta de usuário")
    public void testCreateAnAccount(){
//      Variáveis

        Random random = new Random();
        int id = random.nextInt(10);

        String cFirstName = "Clarck";
        String cLastName = "Joseph Kent";
        String mail = "superman"+ id+ "@gmail.com";
        String pass = "19302021";
        String day = "28";
        String month = "6";
        String year = "1938";
        String company = "DC Comics";
        String address1 = "Street Joe Shuster, 1129";
        String address2 = "Jupter";
        String city = " Cleveland";
        String state = "Ohio";
        String zipCode = "44197";
        String adtInformation = "";
        String homePhone = "555-0123";
        String mobPhone = "555-0124";
        String alias = "Via láctea";


//      Inicia as páginas
        HomePage home = new HomePage();
        LoginPage createAccount = new LoginPage();
        CreateAnAccountPage account = new CreateAnAccountPage();

//      Clica  no botão login e redireciona para a página de login
        home.clickBtnLogin();
        System.out.println("Clicou em Sign In e redirecionou para a página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl()
        .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

//      Insere o email no campo email adress e clica no botão Create an Account
        createAccount.fillEmailAdress(mail);
        System.out.println("Preencheu o campo Email Adress");
        createAccount.clickBtnCreateAnAccout();
        System.out.println("Clicou no botão Create an Account");

//      Insere as informações na página Create An Account
        account.clickRadioGender();
        account.fillCFirstName(cFirstName);
        account.fillCLastName(cLastName);
        account.checkMail();
        account.fillPasswd(pass);
        account.clickDayOfBirthday(day);
        account.clickMonthOfBirthday(month);
        account.clickYearOfBirthday(year);
        account.clickNewsLetter();
        account.clickSpecialOffers();
        account.fillCompany(company);
        account.fillAddress1(address1);
        account.fillAddress2(address2);
        account.fillCity(city);
        account.clickState(state);
        account.fillZipCode(zipCode);
        account.clickCountry();
        account.fillAdtIformation(adtInformation);
        account.fillHomePhone(homePhone);
        account.fillMobilePhone(mobPhone);
        account.fillAliasAdress(alias);

//      Validar se ao clicar na Create An Account ocorre o redirecionamento correto
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
        .getText().contains("CREATE AN ACCOUNT"));

        account.clickBtnRegister();

//      Validar se ao criar a conta o cliente foi para a página My Account
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading"))
        .getText().contains("MY ACCOUNT"));
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Verificar a compra de um produto")
    public void testShoppingCart(){

        String qty = "2";
        String size = "M";

        testLogin();
        testSearch();

//      Inicia as páginas
        SearchPage search = new SearchPage();
        ShoppingCartPage shop = new ShoppingCartPage();
//      Seleciona o produto
        search.clickSelectedProduct();
//      Seleciona a quantidade do produto
        search.fillQty(qty);
//      Seleciona o tamanho do produto
        search.clickSelectSize(size);
//      Seleciona a cor do produto
        search.selectColor();

//      Guarda o nome do produto e valor para conferir na finalização da compra
        String productName = search.getProductNameAddToCart();
        String productPrice = search.getProductPriceAddToCart();

//      Adiciona o produto ao carrinho
        search.clickBtnAddToCart();

//      Confirmação dos dados do cliente e do produto
        shop.clickBtnProceedToCheckout();
        shop.clickBtnProceedToCheckoutSummary();
        shop.clickBtnProceedToCheckoutAddress();
        shop.clickCheckboxAgree();
        shop.clickBtnProceedToCheckoutShipping();

//      Verificar se o produto escolhido está correto
        Assert.assertEquals(productName,shop.getProductNameOnCart());
        Assert.assertEquals(productPrice,shop.getProductPriceOnCart());

//      Seleciona o tipo de pagamento por transferência bancária
        shop.clickBtnTypePayment();

//      Finaliza a compra
        shop.clickBtnConfirmMyOrder();
        System.out.println("Compra finalizada com sucesso!");




    }

}
