package org.example.pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage{

    private final By selectedContent = By.xpath("(//div[@class='slider-item slider-item-2'])[3]");
    private final By addToMyListButton = By.xpath("//button[@class='color-supplementary hasIcon round ltr-uhap25' and @aria-label='Listeme Ekle']");
    private final By typeTitle = By.cssSelector("[href='/Kids']");
    private final By myListButton = By.cssSelector("[href='/browse/my-list']");
    public void scrollPage(){
        for(int i=0;i<3;i++){
            methods.scrollPage();
        }
        methods.waitBySeconds(2);
    }

    public void addMovieToMyList(){
        methods.hoverElement(selectedContent);
        methods.waitBySeconds(1);
        methods.clickElement(addToMyListButton);
        methods.hoverElement(typeTitle);
        methods.waitByMilliSeconds(500);
        methods.clickElement(myListButton);
    }
}
