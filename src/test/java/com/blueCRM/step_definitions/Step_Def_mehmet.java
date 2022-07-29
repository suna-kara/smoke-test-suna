package com.blueCRM.step_definitions;

import com.blueCRM.pages.Pages_mehmet;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import com.github.javafaker.Faker;
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
        String email = "hr"+faker.numerify("6#")+"@cybertekschool.com";
        pages_mehmet.usernameInputBox.sendKeys(email);
        BrowserUtils.sleep(1);
        pages_mehmet.passwordInputBox.click();
        pages_mehmet.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        pages_mehmet.loginButton.click();
        BrowserUtils.sleep(1);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigurationReader.getProperty("mehmetVerifyUrl"));
        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());

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
        List<WebElement> listedElements = pages_mehmet.listInTheFilterAndSearch;
        List<String> textOfListedElements = new ArrayList<>();
        BrowserUtils.sleep(1);
        for (WebElement each : listedElements) {
            textOfListedElements.add(each.getText());
        }
        System.out.println(textOfListedElements);
        Assert.assertTrue(textOfListedElements.containsAll(expectedFilters));
    }

    // AC : 2


}
