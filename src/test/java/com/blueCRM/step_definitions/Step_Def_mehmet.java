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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Step_Def_mehmet {
    Pages_mehmet pages_mehmet = new Pages_mehmet();
    Faker faker = new Faker();

    @Given("User is on the blueCRM login page")
    public void user_is_on_the_blueCRM_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        pages_mehmet.usernameInputBox.click();
        String email = "hr"+faker.numerify("16")+"@cybertekschool.com";
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
            Assert.assertTrue(textOfListedElements.equals(expectedFilters));
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
                                                        //7 Element
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

    // AC:3

    @When("Users click on the date")
    public void users_click_on_the_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Users select one of the options they want which are inside of the date dropdown")
    public void users_select_one_of_the_options_they_want_which_are_inside_of_the_date_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Users click search button")
    public void users_click_search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify filters work as expected")
    public void verify_filters_work_as_expected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





}
