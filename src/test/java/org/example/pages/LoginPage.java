package org.example.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By loginPageTitle = By.cssSelector("[data-uia='login-page-title']");
    private final By emailTextBox = By.id("id_userLoginId");
    private final By passwordTextBox = By.id("id_password");
    private final By signInButton = By.cssSelector("[class='btn login-button btn-submit btn-small']");

    public void assertLoginPageLoaded(){
        Assertions.assertTrue(methods.isElementVisible(loginPageTitle,5));
    }

    public void inputCredentials(String email, String password){
        methods.sendKeys(emailTextBox, email);
        methods.sendKeys(passwordTextBox, password);
    }

    public void clickSignIn(){
        methods.clickElement(signInButton);
    }

}
