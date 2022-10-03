package org.example.test;

import org.example.driver.Driver;
import org.example.pages.*;
import org.junit.jupiter.api.Test;

public class AppTest extends Driver {

    GuestPage guestPage;
    LoginPage loginPage;
    ProfilePage profilePage;
    MainPage mainPage;
    ListPage listPage;
    PlaybackPage playbackPage;

    @Test
    public void guestPageTest(){


        init();
        guestPage.assertPageLoaded();
        guestPage.clickLogin();

        loginPage.assertLoginPageLoaded();
        loginPage.inputCredentials("emailgirin","sifregirin");
        loginPage.clickSignIn();

        profilePage.clickSelectedProfile();

        mainPage.scrollPage();
        mainPage.addMovieToMyList();

        listPage.clickSelectedContent();

        playbackPage.clickBackToBrowse();
    }

    public void init(){
        guestPage = new GuestPage();
        loginPage = new LoginPage();
        profilePage = new ProfilePage();
        mainPage = new MainPage();
        listPage = new ListPage();
        playbackPage = new PlaybackPage();
    }

}
