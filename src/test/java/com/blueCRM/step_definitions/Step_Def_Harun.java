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

        Assert.assertTrue(actualFilters.equals(expectedFilters));
    }

    //AC2

    @When("user clicks on the add field button")
    public void user_clicks_on_the_add_field_button() {

        page.addFieldBtn.click();
    }

    @When("user adds {string} search field")
    public void user_adds_search_field(String fieldName) {
        String xPath = "//span[@class='main-ui-control-field-label'][.='"+fieldName+"']/parent::div";
        WebElement addElements = Driver.getDriver().findElement(By.xpath(xPath));

        String xPath1= "//div[@class='main-ui-select-inner-label'][.='"+fieldName+"']/parent::div";
        WebElement searchFieldElement = Driver.getDriver().findElement(By.xpath(xPath1));
        String check = searchFieldElement.getAttribute("class");
        boolean isSelected = check.endsWith("main-ui-checked");

        if(!isSelected){
            addElements.click();
        }
    }

    @Then("Verify the {string} should be added to search field")
    public void verify_the_should_be_added_to_search_field(String fieldName) {

    }


}
