package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Pages_harun {

    public Pages_harun() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginBtn;

    @FindBy(xpath = "//input[@id='LIVEFEED_search']")
    public WebElement filterAndSearch;

    @FindBy(xpath = "//div[@class='main-ui-filter-wrapper main-ui-filter-theme-rounded']")
    public WebElement filterSearchWindow;

    @FindBy(xpath = "//button[contains(@class,'main-ui-filter-find')]")
    public WebElement searchSubmitButton;

    @FindBy(xpath = "//span[@class='main-ui-filter-sidebar-item-text'][text()!='Filter']")
    public List<WebElement> filterListElements;

    @FindBy(xpath = "//span[.='Add field']")
    public WebElement addFieldBtn;







    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginBtn.click();
    }



    public static void sleep(int second){
        second *= 1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }



    /**
     * Waits for the provided element to be visible on the page
     *
     * @param element
     * @param timeToWaitInSec
     * @return
     */
    /*
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        //return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Waits for provided element to be clickable
     *
     * @param element
     * @param timeout
     * @return
     */
    //public static WebElement waitForClickablility(WebElement element, int timeout) {
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        //return wait.until(ExpectedConditions.elementToBeClickable(element));
    //}




}
