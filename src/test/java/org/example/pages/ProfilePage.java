package org.example.pages;

import org.openqa.selenium.By;

public class ProfilePage extends BasePage{

    private final By selectedProfile = By.xpath("//span[@class='profile-name' and text()='Esra']");

    public void clickSelectedProfile(){
        methods.clickElement(selectedProfile);
    }
}
