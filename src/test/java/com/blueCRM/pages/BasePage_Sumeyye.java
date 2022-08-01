package com.blueCRM.pages;

import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class BasePage_Sumeyye {

    public BasePage_Sumeyye () {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    pages_Sumeyye page = new pages_Sumeyye();

    public void userLogin () {
        BrowserUtils.sleep(5);
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
        page.loginBox.clear();
        page.loginBox.sendKeys(ConfigurationReader.getProperty("username"));
        page.passwordBox.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    }

    public void OGLogin () {
        BrowserUtils.sleep(5);
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
        page.loginBox.clear();
        page.loginBox.sendKeys(ConfigurationReader.getProperty("username2"));
        page.passwordBox.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    }

    public void ReviewerLogin () {
        BrowserUtils.sleep(5);
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
        page.loginBox.clear();
        page.loginBox.sendKeys(ConfigurationReader.getProperty("username3"));
        page.passwordBox.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    }

    public void logOut () {
        BrowserUtils.sleep(3);
        page.logoutName.click();
        page.logOutButton.click();
    }
}
