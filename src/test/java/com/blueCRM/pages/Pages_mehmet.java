package com.blueCRM.pages;

import com.blueCRM.utilities.Driver;
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

    @FindBy(xpath = "//span[@class='main-ui-control-field-label']")
    public List<WebElement> currentList;

}
