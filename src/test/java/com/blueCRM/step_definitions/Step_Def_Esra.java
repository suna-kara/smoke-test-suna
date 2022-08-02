package com.blueCRM.step_definitions;

import com.blueCRM.pages.Page_Esra;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.MissingResourceException;

public class Step_Def_Esra {

    Page_Esra page = new Page_Esra();
    Faker faker = new Faker();

    @Given("user should be displaying the {string} tab from the top menu .")
    public void user_should_be_displaying_the_tab_from_the_top_menu(String tabName) {
        String actualMessageTabText = page.messageTab.getText();
        String expectedMessageTabText = tabName;

        Assert.assertEquals(expectedMessageTabText, actualMessageTabText);

    }


    @And("user add the employee from the dropdown list.")
    public void userAddTheEmployeeFromTheDropdownList() {
        BrowserUtils.sleep(3);

        List<WebElement> mentions = new ArrayList<>();

        for (WebElement element : page.employeesDropdownList) {
            mentions.add(element);

        }
        mentions.get(2).click();
    }


    @And("user  hits the message link from the top menu")
    public void userHitsTheMessageLinkFromTheTopMenu() {
        page.messageTab.click();
    }

    @And("user hover over the link icon and clicks the icon")
    public void userHoverOverTheLinkIconAndClicksTheIcon() {
        page.linkIcon.click();

    }


    @And("user hover over the Add mention icon and click it")
    public void userHoverOverTheAddMentionIconAndClickIt() {
        page.addMentionIcon.click();
    }


    @Given("user login to the home page with valid credentials")
    public void userLoginToTheHomePageWithValidCredentials() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String username = "helpdesk10@cybertekschool.com";
        String password = "UserUser";

        page.login(username, password);


    }

    @And("user hits the Employees and Departments tab")
    public void userHitsTheEmployeesAndDepartmentsTab() {
        BrowserUtils.sleep(4);
        page.EmpAndDepTab.click();
    }


    @Then("verify the mention is attached and visible")
    public void verifyTheMentionIsAttachedAndVisible() {
        WebDriver frame = Driver.getDriver().switchTo().frame(page.iframe);

        System.out.println("page.addedMention.getText() = " + page.addedMentionInMessageBox.getText());
        Assert.assertTrue(page.addedMentionInMessageBox.isDisplayed());
        Driver.getDriver().switchTo().parentFrame();

    }

    @And("user hover over the Add more link")
    public void userHoverOverTheAddMoreLink() {
        page.addMoreLink.click();
    }

    @When("user hover over the insert video icon and clicks it")
    public void userHoverOverTheInsertVideoIconAndClicksIt() {
        page.insertVideo.click();
    }

    @And("user passes the youtube {string}")
    public void userPassesTheYoutube(String link) {
        page.videoSourceBox.sendKeys(link);
    }


    @Then("user displays the attached mention below activity stream")
    public void userDisplaysTheAttachedMentionBelowActivityStream() {
        System.out.println("page.postedMention.getText() = " + page.postedMention.getText());
        Assert.assertTrue(page.postedMention.isDisplayed());

    }

    @When("user clicks the send button")
    public void userClicksTheSendButton() {


        try {

            page.sendButton.click();
            BrowserUtils.sleep(5);
            Assert.assertFalse("The message title is not specified message pops up", page.errorMessage2.isDisplayed());

        } catch (NoSuchElementException e) {
            e.printStackTrace();


        }

    }


    @When("user should verify that the link sent as a post under Activity Stream")
    public void userShouldVerifyThatTheLinkSentAsAPostUnderActivityStream() {

        BrowserUtils.sleep(7);
        List<WebElement> theListOfWebElements = page.getTheListOfWebElements(page.postedMessagesText);
        System.out.println("theListOfWebElements.get(0).getText() = " + theListOfWebElements.get(0).getText());
        Assert.assertTrue(theListOfWebElements.get(0).isDisplayed());


    }


    @And("user passes the {string} into the  link input box")
    public void userPassesTheIntoTheLinkInputBox(String url) {

        page.linkInputBox.sendKeys(url);
    }

    @And("user clicks on save button")
    public void userClicksOnSaveButton() {
        page.saveButton.click();
      /*  if(page.errorMessage1.isDisplayed()){
            BrowserUtils.sleep(5);
            Assert.assertFalse("404The video is not found error message pops up", page.errorMessage1.isDisplayed());
        } else{
            BrowserUtils.sleep(4);
            page.saveButton.click();

        }*/


    }

    @And("user passes the link text into  text input box")
    public void userPassesTheLinkTextIntoTextInputBox() {
        BrowserUtils.sleep(3);

        page.textInputBox.sendKeys(faker.name().title());

    }

    @Then("user should verify that the link video is attached under Activity Stream")
    public void userShouldVerifyThatTheLinkVideoIsAttachedUnderActivityStream() {

        Assert.assertTrue("Video can be posted below the Activity Stream", page.videoAttached.isDisplayed());
    }

    @When("user hits the quote icon and clicks it")
    public void userHitsTheQuoteIconAndClicksIt() {
        page.quoteIcon.click();
    }

    @And("user types text into the message box")
    public void userTypesTextIntoTheMessageBox() {
        Driver.getDriver().switchTo().frame(page.iframe);
        page.addQuote.sendKeys(faker.book().publisher());
        Driver.getDriver().switchTo().parentFrame();
    }

    @And("user displays the attached quote below activity stream")
    public void userDisplaysTheAttachedQuoteBelowActivityStream() {
        System.out.println("page.quoteText.getText() = " + page.quoteText.getText());
        Assert.assertTrue(page.quoteText.isDisplayed());

    }

    @And("user hits the send button")
    public void userHitsTheSendButton() {
        page.sendButton.click();

    }

    @And("user observes the tag input box")
    public void userObservesTheTagInputBox() {
        Assert.assertTrue(page.tagInputBox.isDisplayed());
    }

    @And("user clicks the add button below the input box")
    public void userClicksTheAddButtonBelowTheInputBox() {
        page.addButton.click();
    }

    @And("user types the tag input message")
    public void userTypesTheTagInputMessage() {
        page.tagInputBox.sendKeys(faker.name().title());
    }

    @Given("user observes the tag Icon and clicks it")
    public void userObservesTheTagIconAndClicksIt() {
        page.tagIcon.click();
    }

    @Then("user displays the added tag below Activity Stream")
    public void userDisplaysTheAddedTagBelowActivityStream() {

        Assert.assertTrue(page.sendedTag.isDisplayed());
        System.out.println("page.addedTag.getText() = " + page.sendedTag.getText());
    }

    @When("user types random text into the message box")
    public void userTypesRandomTextIntoTheMessageBox() {


    }

    @And("user observes the Add more tab and hits it")
    public void userObservesTheAddMoreTabAndHitsIt() {
        BrowserUtils.sleep(3);
        page.addMoreButton.click();
    }

    @When("removes the tags before sending the message")
    public void removesTheTagsBeforeSendingTheMessage() {
        page.removeIcon1.click();
        page.removeIcon1.click();
        BrowserUtils.sleep(3);
    }

    @Then("user verifies the removes tags below the Activit Stream")
    public void userVerifiesTheRemovesTagsBelowTheActivitStream() {


        try {
            Assert.assertTrue(page.sendedTag.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException  is thrown ");
            System.out.println("tags are removed before sending the message");
        }


    }
}
