package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {

    WebDriver driver;


        @FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
         WebElement tricentisDemoWebShop;

        @FindBy(xpath = "//a[contains(text(),'Desktops')]")
        WebElement desktop;

        @FindBy(xpath= "//a[contains(text(),'Build your own cheap computer')]")
        WebElement buildYourOwnCheapComputer;

        @FindBy(xpath= "add-to-cart-button-72")
        WebElement addToCart;

        @FindBy(xpath= "termsofservice")
        WebElement termsOfServices;

        @FindBy(xpath= "checkout")
        WebElement checkout;

        @FindBy(xpath= "//input[@value='Checkout as Guest']")
        WebElement checkoutAsGuest;

        @FindBy(xpath= "//input[@id='BillingNewAddress_FirstName']")
        WebElement firstName;

        @FindBy(xpath= "//input[@id='BillingNewAddress_LastName']")
        WebElement lastName;

        @FindBy(xpath= "//input[@id='BillingNewAddress_Email']")
        WebElement email;

        @FindBy(xpath= "//input[@id='BillingNewAddress_City']")
        WebElement city;

        @FindBy(xpath= "//input[@id='BillingNewAddress_Address1']")
        WebElement address1;

        @FindBy(xpath= "//input[@id='BillingNewAddress_Address2']")
        WebElement address2;

        @FindBy(xpath= "//input[@id='BillingNewAddress_ZipPostalCode']")
        WebElement zipCode;

        @FindBy(xpath= "//input[@id='BillingNewAddress_PhoneNumber']")
        WebElement phoneNumber;

        @FindBy(className= "button-1 new-address-next-step-button")
        WebElement billngNextStepButton;

        @FindBy(id= "PickUpInStore")
        WebElement pickUpInStore;

        @FindBy(xpath= "button-1 new-address-next-step-button")
        WebElement nextStepButton;

        @FindBy(xpath= "//input[@id='paymentmethod_0']")
        WebElement paymentMethod;

        @FindBy(xpath= "(//input[@value='Continue'])[4]")
        WebElement continueButton;

        @FindBy(xpath= "//div[@id='confirm-order-buttons-container']")
        WebElement confirmOrderButton;



        public ShoppingPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void tricentisDemoWebShop() {
            tricentisDemoWebShop.isDisplayed();


        }

         public void desktop() {
              desktop.click();

        }

         public void buildYourOwnCheapComputer(){
        buildYourOwnCheapComputer.click();

        }

         public void addToCart()  {


          }

         public void termsOfServices()  {
             termsOfServices.click();
             checkout.click();



         }


         public void billingAndShipping() {
             checkoutAsGuest.click();
             firstName.sendKeys("");
             lastName.sendKeys("");





         }

         public tricentisDemoWebShop  {


         }


    }




