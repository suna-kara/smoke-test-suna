package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Page_Esra {

    public Page_Esra() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Message'][1]")
    public WebElement messageTab;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addMentionIcon;
    // @FindBy(id = "destDepartmentTab_mention84576057")
    // public WebElement EmpAndDepTab;
    @FindBy(xpath = "//div[@class='bx-finder-box-tabs']/a[2]")
    public WebElement EmpAndDepTab;

    @FindBy(xpath = "//a[@id='dest_2179_772']")
    public WebElement selectedEmployee;

    @FindBy(id = "bx-destination-tag")
    public WebElement addMoreLink;

    @FindBy(xpath = "//span[@class='bxhtmled-metion'][1]")
    public WebElement addedMentionInMessageBox;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name']")
    public List<WebElement> employeesDropdownList;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement clearTheMessageBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textInputBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkInputBox;

    @FindBy(id = "undefined")
    public WebElement saveButton;

    @FindBy(id = "post-tags-add-new-blogPostForm")
    public WebElement addMoreButton;

    @FindBy(xpath ="//div[@class='feed-post-text-block-inner-inner']")
    public List <WebElement >postedMessagesText;


    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkIcon;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement postedMention;

    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement insertVideo;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errorMessage2;

    @FindBy(xpath = "//span[@class='bxhtmled-video-error']")
    public WebElement errorMessage1;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceBox;

    @FindBy(id = "//div[@id='blg-post-img-2276']")
    public WebElement videoAttached;

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement quoteIcon;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement addQuote;

     @FindBy(xpath="//div[@class='feed-post-text-block-inner-inner']")
    public WebElement quoteText;

     @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement tagIcon;


     @FindBy(id = "TAGS_blogPostForm67abSn")
    public WebElement tagInputBox;


     @FindBy(xpath = "//span[.='Add']")
    public WebElement addButton;


     @FindBy(xpath = "//div[@class='feed-com-files-cont']")
     public WebElement sendedTag;

     @FindBy(xpath = "//span[@class='feed-add-post-tags']")
     public List<WebElement> attachedTags;

     @FindBy(xpath = "(//span[@class='feed-add-post-del-but'])[2]")
     public WebElement removeIcon1;

     @FindBy(xpath = "(//span[@class='feed-add-post-del-but'])[3]")
     public WebElement removeIcon2;


//span[@class='feed-add-post-tags']



    @FindBy(xpath = "//input[@type='text']")
    public WebElement username;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;


    public void login(String username, String password) {

        this.username.clear();
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();


    }

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }



    public  List<WebElement>getTheListOfWebElements(List<WebElement> list) {
        List<WebElement> elemTexts = new ArrayList<>();
        for (WebElement eachElement : list) {
            elemTexts.add(eachElement);
        }
        return elemTexts;
    }


}
