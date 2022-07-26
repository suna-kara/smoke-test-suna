package com.blueCRM.step_definitions;

import com.blueCRM.pages.Pages_harun;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    }

    @Then("the following default filters should be displayed")
    public void the_following_default_filters_should_be_displayed(List<String> expectedFilters) {
        List<WebElement> filterListElements = page.filterListElements;
        List<String> actualFilters = BrowserUtils.getElementsText(filterListElements);

        Assert.assertTrue(actualFilters.containsAll(expectedFilters));
    }
}
