package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

        @FindBy(id = "Email")
        WebElement enterEmail;

        @FindBy(id = "Password")
        WebElement EnterPassword;

        @FindBy(className= "button-1 login-button")
        WebElement loginButton;


    public void LoginPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

    public void login(String email, String password) {
        enterEmail.sendKeys("sibongilesithole71@Gmail.com");
        EnterPassword.sendKeys("Sibongile71#");
        loginButton.click();
    }

}



