package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AskLogin extends Page {
    public AskLogin() {
        url = "http://ask-stage.portnov.com/#/login";
    }

    @FindBy (xpath = "//*[@formcontrolname='email']")
    private WebElement emailField;

    @FindBy (xpath = "//*[@formcontrolname='password']")
    private WebElement passwordField;

    @FindBy (xpath = "//*[@type='submit']")
    private WebElement submitButton;

    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        submitButton.click();
    }
}
