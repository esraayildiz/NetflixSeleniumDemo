package org.example.pages;

import org.openqa.selenium.By;

public class ListPage extends BasePage{

    private final By selectedContent = By.cssSelector("[class='slider-item slider-item-0']");
    private final By clickPlayButton = By.cssSelector("[class='color-primary hasLabel hasIcon ltr-1jtux27']");
    public void clickSelectedContent(){
        methods.waitBySeconds(2);
        methods.clickElement(selectedContent);
        methods.waitBySeconds(2);
        methods.clickElement(clickPlayButton);
    }

}
