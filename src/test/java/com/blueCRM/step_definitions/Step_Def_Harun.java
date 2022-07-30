package com.blueCRM.step_definitions;

import com.blueCRM.pages.Pages_harun;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Step_Def_Harun {

    Pages_harun page = new Pages_harun();

    @Given("user is logged in as Help Desk")
    public void user_is_logged_in_as_help_desk() {
        String url = "https://qa.azulcrm.com/";
        String username = "helpdesk10@cybertekschool.com";
        String password = "UserUser";
        Driver.getDriver().get(url);
        page.login(username, password);

    }
    @When("user clicks on filter and search box")
    public void user_clicks_on_filter_and_search_box() {
        page.filterAndSearch.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page.filterSearchWindow));
    }

    @Then("the following default filters should be displayed")
    public void the_following_default_filters_should_be_displayed(List<String> expectedFilters) {
        List<WebElement> filterListElements = page.filterListElements;
        List<String> actualFilters = BrowserUtils.getElementsText(filterListElements);

        Assert.assertTrue(actualFilters.containsAll(expectedFilters));
    }

    //AC2

    @When("user clicks on the add field button")
    public void user_clicks_on_the_add_field_button() {

        page.addFieldBtn.click();
    }

    @When("user adds {string} search field")
    public void user_adds_search_field(String fieldName) {

        page.addSearchField(fieldName);

    }

    @Then("Verify the {string} should be added to search field")
    public void verify_the_should_be_added_to_search_field(String fieldName) {
        Assert.assertTrue("Verify the "+fieldName+" is selected",page.isSearchFieldSelected(fieldName));
    }

    //AC3
    @When("user removes {string} from search field")
    public void user_removes_from_search_field(String fieldName) {
        page.removeSearchField(fieldName);
    }
    @Then("the {string} should be removed")
    public void the_should_be_removed(String fieldName) {
        Assert.assertFalse("Verify the "+fieldName+" is selected",page.isSearchFieldSelected(fieldName));
    }

    //////////
    @When("user clicks on the save filter button")
    public void user_clicks_on_the_save_filter_button() {
        page.saveFilterBtn.click();
    }
    @When("user enters new {string}")
    public void user_enters_new(String filterName) {
        page.filterNameEntryBox.sendKeys(filterName);
    }
    @When("user clicks on the save button")
    public void user_clicks_on_the_save_button() {
        page.saveChangesBtn.click();
        BrowserUtils.sleep(3);
    }
    @Then("the {string} should be added")
    public void the_should_be_added(String filterName) {
        List<String> actualFiltersName = BrowserUtils.getElementsText(page.filterListElements);
        Assert.assertTrue(actualFiltersName.contains(filterName.toUpperCase()));
    }

    ////////////////////
    @When("user clicks on {string} option")
    public void user_clicks_on_option(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(page.dateBox));
        page.dateBox.click();
    }
    @When("user clicks on restore default fields link")
    public void user_clicks_on_restore_default_fields_link() {
        page.saveFilterBtn.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(page.restoreFieldLinks));
        page.restoreFieldLinks.click();
    }
    @Then("the following default search fields should be selected")
    public void the_following_default_search_fields_should_be_selected(List<String> defaultFields) {
        Assert.assertTrue(page.isDefaultFieldSelected(defaultFields));
    }

    ///////////////
    @When("user clicks on the configure filters button")
    public void user_clicks_on_the_configure_filters_button() {
        page.configureFilters.click();
    }
    @When("user deletes the work filter")
    public void user_deletes_the_work_filter() {
        page.workDeleteBtn.click();
    }
    @When("user clicks on reset to default button")
    public void user_clicks_on_reset_to_default_button() {
        page.resetToDefaultBtn.click();
    }
    @When("user clicks on the continue button")
    public void user_clicks_on_the_continue_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page.filterSearchWindow));
        page.continueResettingSearchFilters.click();
    }





}
