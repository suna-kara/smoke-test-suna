package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class pages_Sumeyye {

    public pages_Sumeyye() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name= 'USER_LOGIN']")
    public WebElement loginBox;

    @FindBy(xpath = "//input[@name= 'USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(xpath = "//span[starts-with(@id, 'bx-ilike-button-BLOG_POST')]")
    public List<WebElement> like;

    @FindBy(xpath = "//span[@data-reaction='like']")
    public WebElement PostTU;

    @FindBy(xpath = "//div[@class = 'feed-com-add']")
    public List<WebElement> commentBox;
    //iframe
    @FindBy(className = "bx-editor-iframe")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable = 'true']")
    public WebElement iframecommentBox;

    @FindBy(xpath = "(//button[@class = 'ui-btn ui-btn-lg ui-btn-primary']) [1]")
    public WebElement sendButton2;

    @FindBy (xpath = "//button[@class = 'ui-btn ui-btn-sm ui-btn-primary']")
    public WebElement sendButton;

    @FindBy(xpath = " (//div [*='Just writing a comment for test'])[1]")
    public WebElement commentText;

    @FindBy(xpath = "(//div[@class= 'feed-com-text'])[4]")
    public WebElement commentText2;

    @FindBy(xpath = "(//div[@class= 'feed-com-text'])[4]")
    public WebElement commentText3;

    @FindBy(xpath = "(//span[@data-follow])[1]")
    public WebElement unfollowB;

    @FindBy(xpath = "//span[starts-with(@id, 'bx-ilike-button-BLOG_COMMENT_')]")
    public List<WebElement> likes;

    @FindBy(xpath = "//span[starts-with(@data-like-id, 'BLOG_COMMENT_')]")
    public List<WebElement> reviewTUs;

    @FindBy (xpath = "(//a[@class = 'feed-com-reply feed-com-reply-Y'])[1]")
    public WebElement reviewReply;

    @FindBy (xpath = "(//a[@class = 'feed-com-reply feed-com-reply-Y'])[2]")
    public WebElement ownCommentReply;

    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[3]")
    public WebElement moreButton;

    @FindBy (xpath = "//span[@class = 'menu-popup-item-text']")
    public List<WebElement> moreMenu;

    @FindBy (xpath = "//span[@id = 'pagetitle']")
    public WebElement pageTitle;

    @FindBy (xpath = "//span[@class='comment-menu-link-icon']")
    public WebElement doneIcon;

    @FindBy (xpath = "//div[@class= 'ui-notification-balloon-message']")
    public WebElement message;

    @FindBy (xpath = "(//div[@class='feed-com-user-box'])[1]")
    public WebElement reviewerName;

    @FindBy (xpath = "//span[@id = 'pagetitle']")
    public WebElement profileTitle;

    @FindBy (xpath = "//span[@class = 'menu-item-link-text']")
    public WebElement backToActivityStream;

    @FindBy (xpath = "//div[starts-with(@id, 'log_entry_favorites')]")
    public WebElement star;

    @FindBy (xpath = "//div[@title = 'Remove from favorites']")
    public WebElement orangeStar;

    @FindBy (xpath = "(//button[@class= 'ui-btn ui-btn-sm ui-btn-link'])[1]")
    public WebElement cancelButton;

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement Postbox;

    @FindBy (id = "blog-submit-button-save")
    public WebElement mainsendButton;

  @FindBy (id = "user-block")
    public WebElement logoutName;

  @FindBy (xpath = "//a[@href = '/auth/?logout=yes&backurl=%2Fstream%2F']")
    public WebElement logOutButton;
}

//record-BLOG_1978-198