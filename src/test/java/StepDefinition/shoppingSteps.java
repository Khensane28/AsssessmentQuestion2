package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppingSteps {
    WebDriver driver;


    @Given("User is on Demo web shop login page")
    public void user_is_on_demo_web_shop_login_page() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        driver.manage().window().maximize();


    }

    @And("User  logins with correct <username>")
    public void userLoginsWithCorrectUsername(Object username) {
        driver.findElement(By.id("Email")).sendKeys((CharSequence) username);
    }

    @And("User  logins with correct <password>")
    public void userLoginsWithCorrectPassword(Object password) {
        driver.findElement(By.id("Password")).sendKeys((CharSequence) password);
    }


    @When("User clicks login button")
    public void user_clicks_login_button() {
        driver.findElement(By.className("button-1 login-button")).click();

    }


    @And("The home page is displayed")
    public void the_home_page_is_displayed() {
        driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();
    }


    @And("User navigates to desktop category")
    public void user_navigates_to_desktop_category() {
        driver.findElement(By.xpath("//a[contains(text(),'Desktops')]")).click();


    }

    @And("User chooses {string}")
    public void user_chooses(String string) {
        driver.findElement(By.xpath("//a[contains(text(),'Build your own cheap computer')]")).click();
    }

    @When("User add it to cart")
    public void user_add_it_to_cart() {
        driver.findElement(By.id("add-to-cart-button-72")).click();
    }

    @And("User accept Ts & Cs and checkout")
    public void user_accept_ts_cs_and_checkout() {
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();

    }


    @And("User complete Billing and Shipping details")
    public void userCompleteBillingAndShippingDetails() {
        driver.findElement(By.xpath("//input[@value='Checkout as Guest']")).click();
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']")).sendKeys("Khensane");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']")).sendKeys("Sithole");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Email']")).sendKeys("sitholesithole71@gmail.com");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("53 smithers street");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("The orchards ext 11 ");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']")).sendKeys("Pretoria");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("0201");
        driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("0794354344");
        driver.findElement(By.className("button-1 new-address-next-step-button")).click();
        driver.findElement(By.id("PickUpInStore")).click();


    }

    @And("Users select Payment method CoD")
    public void usersSelectPaymentMethodCoD() {
        driver.findElement(By.id("button-1 new-address-next-step-button")).click();
        driver.findElement(By.xpath("//input[@id='paymentmethod_0']")).click();
        driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();


    }

    @Then("User confirm order")
    public void userConfirmOrder() {
        driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']")).click();
    }

}





