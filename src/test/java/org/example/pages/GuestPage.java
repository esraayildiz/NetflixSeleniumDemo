package org.example.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class GuestPage extends BasePage{


    private final By welcomeTitle = By.xpath("//div[@class='our-story-card-text']/h1[@class='our-story-card-title' and @data-uia='hero-title']");
    private final By loginButton = By.cssSelector("[href=\"/login\"]");


    public void assertPageLoaded(){
        Assertions.assertTrue(methods.isElementVisible(welcomeTitle,5));
    }

    public void clickLogin(){
        methods.clickElement(loginButton);
    }
}
