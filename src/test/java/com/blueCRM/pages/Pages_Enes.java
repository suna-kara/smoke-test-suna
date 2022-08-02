package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Pages_Enes {

    public Pages_Enes(){
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

    @FindBy(xpath = "(//span[.='Message'])[1]")
    public WebElement messageTab;


    @FindBy(id = "lhe_button_title_blogPostForm")
    public WebElement TopicButton;

    @FindBy(id = "POST_TITLE")
    public WebElement TopicBox;

    @FindBy(id = "bx-destination-tag")
    public WebElement addMoreButton;


    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employessanddepartmentsButton;

    @FindBy(xpath = "//a[@class='bx-finder-company-department-employee  bx-finder-element'][1]")
    public WebElement departmentEmployees;

    @FindBy(xpath = "//a[@class='bx-finder-company-department-employee  bx-finder-element'][2]")
    public WebElement departmentEmployees2;

    @FindBy(xpath = "//a[@class='bx-finder-company-department-employee  bx-finder-element'][3]")
    public WebElement departmentEmployees3;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[2]")
    public WebElement selectedEmployess1;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[3]")
    public WebElement selectedEmployess2;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[1]")
    public WebElement selectedEmployess3;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;


    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;



    @FindBy(xpath = "(//span[@class='feed-add-post-del-but'])[2]")
    public WebElement deletesymbol1;

    @FindBy(xpath = "(//span[@class='feed-add-post-del-but'])[1]")
    public WebElement deletesymbolforAllEmployess;

    @FindBy(className = "feed-add-post-destination-text")
    public WebElement allEmployess;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement deletesymbolInEmployessMenu;

    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[1]")
    public WebElement MoreButton;

    @FindBy(xpath = "(//span[.='Delete'])[2]")
    public WebElement DeleteButton;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement textinSendedMessage;















}
