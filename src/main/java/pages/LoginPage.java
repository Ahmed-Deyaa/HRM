package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(tagName = "button")
    private WebElement loginButton;

    @FindBy(id = "spanMessage")
    private WebElement failedLoginText;


    private void enterUsername(String username){
        usernameField.sendKeys(username);
    }

    private void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void enterCredentials(String username,String password){
        enterUsername(username);
        enterPassword(password);
    }

    public HomePage clickOnLoginButton(){
        loginButton.click();
        return new HomePage(driver);
    }

    public String getFailedLoginText(){
        wait.until(ExpectedConditions.visibilityOf(failedLoginText));
        return failedLoginText.getText();
    }
}
