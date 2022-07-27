package com.blueCRM.step_definitions;

import com.blueCRM.pages.Pages_Irem;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class step_def_irem {

    Pages_Irem page = new Pages_Irem();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Given("User should login with correct credential")
    public void user_should_login_with_correct_credential() {

        Driver.getDriver().get("https://qa.azulcrm.com/");

        BrowserUtils.sleep(1);

        page.usernamebox.sendKeys("helpdesk1@cybertekschool.com");
        // Faker faker = new Faker();
        // messagePage.usernamebox.sendKeys("hr" + faker.numerify("##") + "@cybertekschool.com");


        BrowserUtils.sleep(1);
        page.passwordbox.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(1);
        page.loginbutton.click();

/*
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleContains("portal"));
 */

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));


        Assert.assertTrue(page.sendmessagetext.isDisplayed());

        BrowserUtils.sleep(2);

        actions.click(page.sendmessagetext).perform();

        BrowserUtils.sleep(2);
    }
    @When("User, Should be click Add Mention button.")
    public void user_should_be_click_add_mention_button() {

    }
    @When("User should be click Emmployess and departments button")
    public void user_should_be_click_emmployess_and_departments_button() {

    }
    @Then("User should be add deparmants employess")
    public void user_should_be_add_deparmants_employess() {

    }
    @Then("Verification The chosen departments employess should be see in")
    public void verification_the_chosen_departments_employess_should_be_see_in() {

    }

}
