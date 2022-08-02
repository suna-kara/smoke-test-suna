package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage_Suna {

    public  BasePage_Suna(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(name = "USER_LOGIN")
    public WebElement userNameBox;

    @FindBy(name = "USER_PASSWORD")
    public  WebElement passwordBox;

    @FindBy(className = "login-btn")
    public  WebElement loginButton;

    @FindBy(xpath = "//span[.='Task']")
    public  WebElement clickTask;

    @FindBy(name = "ACTION[0][ARGUMENTS][data][TITLE]")
    public  WebElement ThingsToDo;

    @FindBy(id = "tasks-task-priority-cb")
    public  WebElement CheckBtn;

}
