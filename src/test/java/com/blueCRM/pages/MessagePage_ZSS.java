package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MessagePage_ZSS {
    public MessagePage_ZSS(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
    public WebElement messageBox;


    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadFileButton;

    @FindBy(name="bxu_files[]")
    public WebElement uploadFilesAndImages;

    @FindBy(xpath = "//span[@class=\"wd-fa-add-file-light\"]")
    public WebElement uploadFilesAndImagesBox;

    @FindBy(css = "input[name='BLOG_POST_DISK_ATTACHED_OBJECT_ALLOW_EDIT']")
    public WebElement allowRecipientsCheckBox;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-more']")
    public WebElement moreButton;

    @FindBy (xpath= "//span[@title='Image']")
    public WebElement imageButton;

    @FindBy(id = "bx_image-src")
    public WebElement imagePathBox;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement imagePathSaveButton;

    @FindBy(css = "span[title='Click to insert file']")
    public WebElement displayedFileNameBox;

    @FindBy(css = "span[class='f-wrap']")
    public WebElement displayedFileNameText;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public List<WebElement> listOfMultipleFileNameText;

    @FindBy(xpath = "//span[@class='insert-btn']")
    public WebElement insertInTextButton;

    @FindBy(xpath = "//span[contains(@id, 'bxid')]")
    public WebElement insideTheMessageBox;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement deleteButton;
    @FindBy(xpath = "//span[@class='files-name-edit-btn']")
    public WebElement renameFileButton;

    @FindBy(css = "input[class='files-name-edit-inp']")
    public WebElement renameFileEditBox;

    @FindBy(xpath = "//img[@class='files-preview']")
    public WebElement uploadedImagePreviewButton;

    @FindBy(id= "bx-wufd-preview-img-wufdp_0.040459482325975404")
    public WebElement imagePreviewPopUp;

    @FindBy(xpath = "(//div[@class='feed-post-block feed-post-block-files feed-post-block-separator feed-post-block-short'])[1]//a[@class='feed-com-file-name']")
    public WebElement fileNameDisplayedAfterSendingMessage;

    @FindBy(xpath = "(//div[@class='feed-post-block feed-post-block-files feed-post-block-separator feed-post-block-short'])[1]//a[@class='feed-add-post-destination-new']")
    public WebElement emailNameDisplayedAfterSendingMessage;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//a[.='Add more']")
    public WebElement addEmployeeButton;

    @FindBy(xpath = "//a[@class='bx-finder-box-item-t7 bx-finder-element bx-lm-element-user']")
    public List<WebElement> listOfEmployees;

    public boolean isElementPresent(WebElement element) {
        try {
            element.isDisplayed();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}
