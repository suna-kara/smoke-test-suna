package com.blueCRM.pages;

import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_ZSS {
    public LoginPage_ZSS(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "login-inp")
    public WebElement userNameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement userPasswordInput;

    @FindBy(css = ".login-btn")
    public WebElement loginButton;

    public void login(){
        Driver.getDriver().get("https://qa.azulcrm.com/");
        userNameInput.sendKeys(ConfigurationReader.getProperty("username"));
        userPasswordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
}
