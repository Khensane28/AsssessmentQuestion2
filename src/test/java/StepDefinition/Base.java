package StepDefinition;

import Pages.LoginPage;
import Pages.ShoppingPage;
import Utilities.BroswerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BroswerFactory.BrowserFactory browserFactory = new BroswerFactory.BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("CHROME", "https://www.way2automation.com/angularjs-protractor/webtables/");
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
     ShoppingPage shoppingPage = PageFactory.initElements(driver,ShoppingPage.class);


}
