package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage_Enes {

    public BasePage_Enes(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernamebox;

    @FindBy(id = "user-block")
    public WebElement usernamemenu;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordbox;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginbutton;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutbutton;

    @FindBy(xpath = "//span[@class='feed-add-post-micro-title']")
    public WebElement sendmessagetext;

    @FindBy(className = "bxhtmled-right-c")
    public WebElement linkUrlBox;

    @FindBy(xpath = "//body[@style=\"min-height: 184px;\"]")
    public WebElement textBox;


}
