package com.blueCRM.step_definitions;

import com.blueCRM.pages.Pages_Enes;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;

public class step_def_Enes {

    Pages_Enes pages_enes = new Pages_Enes();
    Faker faker = new Faker();




    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        BrowserUtils.sleep(1);

        pages_enes.usernamebox.sendKeys(ConfigurationReader.getProperty("username"));

        BrowserUtils.sleep(1);
        pages_enes.passwordbox.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(1);
        pages_enes.loginbutton.click();




    }
    @When("user clicks on the message tab")
    public void user_clicks_on_the_message_tab() {

        BrowserUtils.sleep(2);
        pages_enes.messageTab.click();

    }
    @When("user clicks on the topic button")
    public void user_clicks_on_the_topic_button() {


        if (!(pages_enes.TopicBox.isDisplayed())){
            BrowserUtils.sleep(2);
            pages_enes.TopicButton.click();
        }



    }
    @When("user writes their topic name in the Topic")
    public void user_writes_their_topic_name_in_the_topic() {


        BrowserUtils.sleep(2);

        if ((pages_enes.TopicBox.isDisplayed())){
            pages_enes.TopicBox.sendKeys(faker.name().title());
        }





    }
    @When("user writes their message in the message field")
    public void user_writes_their_message_in_the_message_field() {


        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        BrowserUtils.sleep(2);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pages_enes.textBox));

        pages_enes.textBox.sendKeys(faker.lorem().paragraph());

        Driver.getDriver().switchTo().parentFrame();


    }
    @Then("Verify that users send a message by fiiling in the mandatory fields")
    public void verify_that_users_send_a_message_by_fiiling_in_the_mandatory_fields() {


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pages_enes.addMoreButton));
        pages_enes.addMoreButton.click();

        BrowserUtils.sleep(2);

        pages_enes.employessanddepartmentsButton.click();

        BrowserUtils.sleep(2);

        pages_enes.departmentEmployees.click();

        BrowserUtils.sleep(2);

        pages_enes.departmentEmployees2.click();

        BrowserUtils.sleep(2);

        assertTrue(pages_enes.selectedEmployess1.isDisplayed());
        assertTrue(pages_enes.selectedEmployess2.isDisplayed());

        BrowserUtils.sleep(2);

        pages_enes.deletesymbol1.click();

        BrowserUtils.sleep(3);



        pages_enes.deletesymbol1.click();

        BrowserUtils.sleep(2);

        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.elementToBeClickable(pages_enes.deletesymbolInEmployessMenu));
        pages_enes.deletesymbolInEmployessMenu.click();

        pages_enes.sendButton.click();






    }


    @Then("Verify User should be sees message delivery as all employees by default")
    public void verifyUserShouldBeSeesMessageDeliveryAsAllEmployeesByDefault() {

        Assert.assertTrue(pages_enes.allEmployess.isDisplayed());

    }

    @And("User should be changeable in The message delivery")
    public void userShouldBeChangeableInTheMessageDelivery() {

        pages_enes.deletesymbolforAllEmployess.click();




        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pages_enes.addMoreButton));
        pages_enes.addMoreButton.click();

        BrowserUtils.sleep(2);

        pages_enes.employessanddepartmentsButton.click();



        BrowserUtils.sleep(2);

        pages_enes.departmentEmployees.click();

        BrowserUtils.sleep(2);

        pages_enes.departmentEmployees2.click();

        BrowserUtils.sleep(2);

        assertTrue(pages_enes.selectedEmployess3.isDisplayed());
        assertTrue(pages_enes.selectedEmployess1.isDisplayed());

        BrowserUtils.sleep(2);







    }

    @Then("Verify Message delivery must have been modified")
    public void verifyMessageDeliveryMustHaveBeenModified() {

        assertTrue(pages_enes.selectedEmployess1.isDisplayed());
        assertTrue(pages_enes.selectedEmployess3.isDisplayed());


    }

    @And("That users send a message by fiiling in the mandatory fields")
    public void thatUsersSendAMessageByFiilingInTheMandatoryFields() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pages_enes.addMoreButton));
        pages_enes.addMoreButton.click();

        BrowserUtils.sleep(2);

        pages_enes.employessanddepartmentsButton.click();

        BrowserUtils.sleep(2);

        pages_enes.departmentEmployees.click();

        BrowserUtils.sleep(2);

        pages_enes.departmentEmployees2.click();

        BrowserUtils.sleep(2);

        assertTrue(pages_enes.selectedEmployess1.isDisplayed());
        assertTrue(pages_enes.selectedEmployess2.isDisplayed());

        BrowserUtils.sleep(2);

        pages_enes.deletesymbol1.click();

        BrowserUtils.sleep(3);



        pages_enes.deletesymbol1.click();

        BrowserUtils.sleep(2);

        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.elementToBeClickable(pages_enes.deletesymbolInEmployessMenu));
        pages_enes.deletesymbolInEmployessMenu.click();


    }

    @And("user clicks cancel button")
    public void userClicksCancelButton() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pages_enes.cancelButton));
        pages_enes.cancelButton.click();




    }


    @And("User click more button than click delete button")
    public void userClickMoreButtonThanClickDeleteButton() {

        BrowserUtils.sleep(2);

        pages_enes.MoreButton.click();

        BrowserUtils.sleep(2);

        pages_enes.DeleteButton.click();

        Alert a = Driver.getDriver().switchTo().alert();
        a.accept();

    }

    @Then("Verify The message mustn't display on screen")
    public void verifyTheMessageMustnTDisplayOnScreen() {
    }
}
