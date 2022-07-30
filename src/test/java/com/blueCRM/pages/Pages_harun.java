package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar']")
    public WebElement filterSearchWindow;

    @FindBy(xpath = "//button[contains(@class,'main-ui-filter-find')]")
    public WebElement searchSubmitButton;

    @FindBy(xpath = "//span[@class='main-ui-filter-sidebar-item-text'][text()!='Filter']")
    public List<WebElement> filterListElements;

    @FindBy(xpath = "//span[.='Add field']")
    public WebElement addFieldBtn;

    @FindBy (xpath = "((//div[.='Date'])[2])")
    public WebElement dateBox;

    @FindBy (xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoreFieldLinks;

    @FindBy(xpath = "//div[contains(@class,'feed-post-block')]")
    public List<WebElement> searchResult;

    @FindBy(xpath = "//span[@class='main-ui-filter-add-item']")
    public WebElement saveFilterBtn;

    @FindBy(xpath = "//input[@class='main-ui-filter-sidebar-edit-control']")
    public WebElement filterNameEntryBox;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveChangesBtn;

    @FindBy(xpath = "//span[@title='Configure filter']")
    public WebElement configureFilters;

    @FindBy(xpath = "(//span[@class='main-ui-item-icon main-ui-delete'])[2]")
    public WebElement workDeleteBtn;

    @FindBy(xpath = "//span[.='Reset to default']")
    public WebElement resetToDefaultBtn;

    @FindBy(xpath = "//span[text()='Continue']")
    public WebElement continueResettingSearchFilters;




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


    public boolean isSearchFieldSelected(String field){
        String xPath = "//div[@class='main-ui-select-inner-label'][text()='"+field+"']/parent::div";
        WebElement searchFieldElement = Driver.getDriver().findElement(By.xpath(xPath));
        String isChecked = searchFieldElement.getAttribute("class");
        return isChecked.endsWith("main-ui-checked");
    }

    public void addSearchField(String fieldName){
        String xPath = "//div[@class='main-ui-select-inner-label'][text()='"+fieldName+"']/parent::div";
        WebElement searchFieldElement = Driver.getDriver().findElement(By.xpath(xPath));

        if(!isSearchFieldSelected(fieldName)){
            searchFieldElement.click();
        }
    }

    public void removeSearchField(String fieldName){
        String xPath = "//div[@class='main-ui-select-inner-label'][text()='"+fieldName+"']/parent::div";
        WebElement searchFieldElement = Driver.getDriver().findElement(By.xpath(xPath));
        if(isSearchFieldSelected(fieldName)){
            searchFieldElement.click();
        }
    }

    public boolean isDefaultFieldSelected(List<String> expectedDefaultFields){
        String xpath = "//span[@class='main-ui-control-field-label']";
        List<WebElement> actualFieldElements = Driver.getDriver().findElements(By.xpath(xpath));
        List<String> actualFields = new ArrayList<>();
        for (WebElement actualFieldElement : actualFieldElements) {
            actualFields.add(actualFieldElement.getAttribute("title"));
        }

        return actualFields.containsAll(expectedDefaultFields);
    }






}
