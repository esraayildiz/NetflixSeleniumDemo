package org.example.pages;

import org.openqa.selenium.By;

public class PlaybackPage extends BasePage{

    private final By backButton = By.cssSelector("[aria-label='Back to Browse']");

    public void clickBackToBrowse(){
        methods.clickElement(backButton);
    }
}
