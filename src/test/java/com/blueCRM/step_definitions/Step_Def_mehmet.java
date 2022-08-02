package com.blueCRM.step_definitions;

import com.blueCRM.pages.Pages_mehmet;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Step_Def_mehmet {
    Pages_mehmet pages_mehmet = new Pages_mehmet();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("User is on the blueCRM login page")
    public void user_is_on_the_blueCRM_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        pages_mehmet.usernameInputBox.click();
        String email = "hr"+faker.numerify("2#")+"@cybertekschool.com";
        pages_mehmet.usernameInputBox.sendKeys(email);
        BrowserUtils.sleep(1);
        pages_mehmet.passwordInputBox.click();
        pages_mehmet.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        pages_mehmet.loginButton.click();
        BrowserUtils.sleep(1);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigurationReader.getProperty("mehmetVerifyUrl"));
        System.out.println("Url = " + Driver.getDriver().getCurrentUrl());
    }

    // AC : 1
    @When("Users click on filter and search input box")
    public void users_click_on_filter_and_search_input_box() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pages_mehmet.FilterAndSearchInputBox));
        pages_mehmet.FilterAndSearchInputBox.click();
    }
    @Then("Verify filters and search box should be contain the following in order as default")
    public void verify_filters_and_search_box_should_be_contain_the_following_in_order_as_default(List<String> expectedFilters) {

        if(pages_mehmet.FilterAndSearchWindow.isDisplayed()){
            List<WebElement> listedElements = pages_mehmet.listInTheFilterAndSearch;
            List<String> textOfListedElements = new ArrayList<>();
            BrowserUtils.sleep(1);
            for (WebElement each : listedElements) {
                textOfListedElements.add(each.getText());
            }
            System.out.println(textOfListedElements);
            Assert.assertTrue(textOfListedElements.containsAll(expectedFilters));
        }
    }

    // AC : 2

    @When("Users click on the add field button")
    public void users_click_on_the_add_field_button() {
        pages_mehmet.addFieldButton.click();
        BrowserUtils.sleep(2);
    }

    @And("Users add all option in search field")
    public void users_add_search_field() {
                                                        //3 Element
        List<WebElement> currentElementList = pages_mehmet.noneSelectedOptions;

        for (WebElement each : currentElementList) {
            if (currentElementList.size()>=1){
                each.click();
            }continue;

        }
    }

    @Then("Verify that the all options is selected")
    public void verify_that_the_all_options_is_selected(List<String> expectedList) {
        List<WebElement> currentElementList = pages_mehmet.selectedOptions;
        List<String> actualElementList = new ArrayList<>();
        for (WebElement each : currentElementList) {
            actualElementList.add(each.getText());
        }
        System.out.println("Actual List: "+actualElementList);
        System.out.println("Expected List: "+expectedList);
        Assert.assertTrue(actualElementList.containsAll(expectedList));
    }

    @And("Users remove all option in the search field")
    public void users_remove_all_option_in_the_search_field() {
        List<WebElement> currentElementList = pages_mehmet.selectedOptions;
        for (WebElement each : currentElementList) {
            if (currentElementList.size()>=1){
                each.click();
            }continue;
        }
    }

    @Then("Verify that the all options is not selected")
    public void verify_that_the_all_options_is_not_selected(List<String> expectedList) {
        List<WebElement> currentElementList = pages_mehmet.noneSelectedOptions;
        List<String> actualElementList = new ArrayList<>();
        for (WebElement each : currentElementList) {
            actualElementList.add(each.getText());
        }
        System.out.println("Actual Removed List: "+actualElementList);
        System.out.println("Expected Removed List: "+expectedList);
        Assert.assertTrue(actualElementList.containsAll(expectedList));
    }

    //AC:3
    @When("Users click on the date")
    public void users_click_on_the_date() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pages_mehmet.dateElement));
        pages_mehmet.dateElement.click();
    }
    @When("Users select one of the options they want which are inside of the date dropdown")
    public void users_select_one_of_the_options_they_want_which_are_inside_of_the_date_dropdown() {
        pages_mehmet.dateList.get(1).click();
        actions.sendKeys(Keys.ENTER);

    }
    @When("Users click search button")
    public void users_click_search_button() {

        pages_mehmet.searchButton.click();
        BrowserUtils.sleep(2);
    }
    @Then("Verify date filters work as expected")
    public void verify_date_filters_work_as_expected() {
        String expectedTitle = "yesterday";
        List<WebElement> listName = pages_mehmet.filterTitle;
        for (WebElement each : listName) {
            Assert.assertTrue(each.getText().contains(expectedTitle));
        }
    }

    //AC:4
    @When("Users click on the type dropdown")
    public void users_click_on_the_type_dropdown() {
        pages_mehmet.typeElement.click();
    }
    @When("Users select one of the options they want which are inside of the type dropdown")
    public void users_select_one_of_the_options_they_want_which_are_inside_of_the_type_dropdown() {
        pages_mehmet.typeList.get(1).click();
        actions.sendKeys(Keys.ENTER);
    }
    @Then("Verify type filters work as expected")
    public void verify_type_filters_work_as_expected() {
        String expectedButton = "MARK AS READ";
        List<WebElement> button = pages_mehmet.readBy;
        for (WebElement each : button) {
            System.out.println(each.getText());
            Assert.assertTrue(each.getText().contains(expectedButton));
        }
    }




    //AC:5
    @When("Users click on the save filter button")
    public void users_click_on_the_save_filter_button() {
        pages_mehmet.saveFilterButton.click();
    }
    @When("Users enter new {string}")
    public void users_enter_new(String filterName) {
        pages_mehmet.filterInputBox.sendKeys(filterName);
    }
    @When("Users click on save button")
    public void users_click_on_save_button() {
        pages_mehmet.saveButton.click();
    }
    @Then("Verify the {string} is displayed")
    public void verify_the_is_displayed(String filterName) {
        List<WebElement> listOfFilter = pages_mehmet.filterNameList;
        List<String> listOfFilterNames = new ArrayList<>();
        for (WebElement each : listOfFilter) {
            listOfFilterNames.add(each.getText());
        }
        Assert.assertTrue(listOfFilterNames.contains(filterName));
    }

    //AC:6
    @When("Users click restore default fields link")
    public void users_click_restore_default_fields_link() {
        pages_mehmet.restoreDefaultFields.click();
    }
    @Then("Verify that the list is displayed as default.")
    public void verify_that_the_list_is_displayed_as_default(List<String> expectedList) {
        List<WebElement> currentList = pages_mehmet.currentList;
        List<String> actualList = new ArrayList<>();
        for (WebElement each : currentList) {
            actualList.add(each.getText());
        }
        Assert.assertEquals(expectedList,actualList);
    }

    //AC:7
    @When("Users click on configure filter button")
    public void users_click_on_configure_filter_button() {
        pages_mehmet.configureFilters.click();
    }
    @When("Users delete work filter")
    public void users_delete_work_filter() {
        pages_mehmet.workDeleteButton.click();
    }
    @When("Users click the save button")
    public void users_click_the_save_button() {
        pages_mehmet.saveButton.click();
    }
    @When("Users click to reset the default button")
    public void users_click_to_reset_the_default_button() {
        pages_mehmet.resetToDefault.click();
    }
    @When("Users click to continue button")
    public void users_click_to_continue_button() {
        pages_mehmet.continueButton.click();
    }





}
