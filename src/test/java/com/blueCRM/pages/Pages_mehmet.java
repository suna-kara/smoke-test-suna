package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Pages_mehmet {

    public Pages_mehmet() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement usernameInputBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;

    @FindBy(id = "LIVEFEED_search")
    public WebElement FilterAndSearchInputBox;

    @FindBy(xpath = "//span[@class='main-ui-filter-sidebar-item-text'][.!='Filter']")
    public List<WebElement> listInTheFilterAndSearch;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement addFieldButton;

    @FindBy(xpath = "//div[@class='main-ui-filter-wrapper main-ui-filter-theme-rounded']")
    public WebElement FilterAndSearchWindow;

    @FindBy(xpath = "//div[@class='main-ui-filter-field-list-item main-ui-select-inner-item']")
    public List<WebElement> noneSelectedOptions;

    @FindBy(xpath = "//div[@class='main-ui-filter-field-list-item main-ui-select-inner-item main-ui-checked']")
    public List<WebElement> selectedOptions;

    @FindBy(xpath = "//div[@class='main-ui-control-field']")
    public WebElement dateElement;

    @FindBy(xpath = "//span[@class='main-ui-select-name']")
    public WebElement insideOfDateElement;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button main-ui-filter-find']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='feed-time']")
    public WebElement timeFilterTitle;

    @FindBy(xpath = "//span[@class='main-ui-filter-add-item']")
    public WebElement saveFilterButton;

    @FindBy(xpath = "//input[@class='main-ui-filter-sidebar-edit-control']")
    public WebElement filterInputBox;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[@class='main-ui-filter-sidebar-item-text']")
    public List<WebElement> filterNameList;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoreDefaultFields;

    @FindBy(xpath = "//span[@class='main-ui-control-field-label']")
    public List<WebElement> currentList;

    @FindBy(xpath = "//span[@title='Configure filter']")
    public WebElement configureFilters;

    @FindBy(xpath = "(//span[@class='main-ui-item-icon main-ui-delete'])[2]")
    public WebElement workDeleteButton;

    @FindBy(xpath = "//span[.='Reset to default']")
    public WebElement resetToDefault;

    @FindBy(xpath = "//span[.='Continue']")
    public WebElement continueButton;









/*
    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        //Loop through the List of WebElement and select matching result "hockey"
        for (WebElement each : radioButtons) {
            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)){

                each.click();
                System.out.println( eachId + " is selected : " + each.isSelected());
                break;
            }
        }

    }

 */

}
