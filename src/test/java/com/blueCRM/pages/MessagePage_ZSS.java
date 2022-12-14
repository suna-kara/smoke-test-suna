package com.blueCRM.pages;

import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MessagePage_ZSS {
    public MessagePage_ZSS(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(className = "login-inp")
    public WebElement userNameInput_z;

    @FindBy(name = "USER_PASSWORD")
    public WebElement userPasswordInput_z;

    @FindBy(css = ".login-btn")
    public WebElement loginButton_z;

    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
    public WebElement messageBox_z;


    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFileButton_z;

    @FindBy(name="bxu_files[]")
    public WebElement uploadFilesAndImages;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light'])[1]")
    public WebElement uploadFilesAndImagesBox;

    @FindBy(css = "input[name='BLOG_POST_DISK_ATTACHED_OBJECT_ALLOW_EDIT']")
    public WebElement allowRecipientsCheckBox;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-more']")
    public WebElement moreButton_z;

    @FindBy (xpath= "//span[@title='Image']")
    public WebElement imageButton_z;

    @FindBy(id = "bx_image-src")
    public WebElement imagePathBox;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement imagePathSaveButton;

    @FindBy(css = "span[title='Click to insert file']")
    public WebElement displayedFileNameBox;

    @FindBy(css = "input[class='files-name-edit-inp']")
    public WebElement getDisplayedFileNameText_value;

    @FindBy(css = "input[class='f-wrap']")
    public WebElement displayedFileNameText;

    @FindBy(xpath = "//input[@class='files-name-edit-inp']")
    public WebElement fileNameLink;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public List<WebElement> listOfMultipleFileNameText;

    @FindBy(xpath = "//span[@class='insert-btn']")
    public WebElement insertInTextButton;

    @FindBy(xpath = "//span[contains(@id, 'bxid')]")
    public WebElement insideTheMessageBox;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement deleteButton_z;
    @FindBy(xpath = "//span[@class='files-name-edit-btn']")
    public WebElement renameFileButton;

    @FindBy(css = "input[class='files-name-edit-inp']")
    public WebElement renameFileEditBox;

    @FindBy(xpath = "//img[@class='files-preview']")
    public WebElement uploadedImagePreviewButton;

    @FindBy(xpath = "(//span[@class='feed-com-files-photo'])[1]//img")
    public WebElement imageInActivityStream;

    @FindBy(xpath = "(//div[@class='feed-post-block feed-post-block-files feed-post-block-separator feed-post-block-short'])[1]//a[@class='feed-com-file-name']")
    public WebElement fileNameDisplayedAfterSendingMessage;


    @FindBy(xpath = "(//div[@class='feed-post-block feed-post-block-files feed-post-block-separator feed-post-block-short'])[1]//a[@class='feed-add-post-destination-new']")
    public WebElement emailNameDisplayedAfterSendingMessage;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendMessageButton_z;

    @FindBy(xpath = "//a[.='Add more']")
    public WebElement addEmployeeButton_z;

    @FindBy(xpath = "//a[@class='bx-finder-box-item-t7 bx-finder-element bx-lm-element-user']")
    public List<WebElement> listOfEmployees_z;

    public boolean isElementPresent(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void login(){
        Driver.getDriver().get("https://qa.azulcrm.com/");
        userNameInput_z.sendKeys(ConfigurationReader.getProperty("username"));
        userPasswordInput_z.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton_z.click();
    }

}
