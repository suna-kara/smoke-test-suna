package com.blueCRM.pages;

import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import org.openqa.selenium.Keys;

public class SumeyyeBase {
    pages_Sumeyye page = new pages_Sumeyye();

    public void userLogin () {
        BrowserUtils.sleep(5);
        Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
        page.loginBox.clear();
        page.loginBox.sendKeys(ConfigurationReader.getProperty("username"));
        page.passwordBox.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);
    }
}
