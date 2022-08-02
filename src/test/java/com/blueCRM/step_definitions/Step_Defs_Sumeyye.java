package com.blueCRM.step_definitions;

import com.blueCRM.pages.BasePage_Sumeyye;
import com.blueCRM.pages.pages_Sumeyye;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class Step_Defs_Sumeyye {
    BasePage_Sumeyye basePage = new BasePage_Sumeyye();
    pages_Sumeyye page = new pages_Sumeyye();

    //Pre-part
    @When("commentator logs in")
    public void commentator_logs_in() {
        basePage.OGLogin();
    }

    @When("commentator clicks on post box")
    public void commentator_clicks_on_post_box() {
        page.Postbox.click();
    }

    @When("user writes original comment")
    public void user_writes_original_comment() {
        Driver.getDriver().switchTo().frame(page.iframe);
        page.iframecommentBox.sendKeys("ORIGINAL COMMENT");
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.sleep(3);
        page.mainsendButton.click();
    }

    @When("user logs out")
    public void user_logs_out() {
        basePage.logOut();
    }

    @When("reviewer logs in")
    public void reviewer_logs_in() {
        basePage.ReviewerLogin();
    }

    @When("user writes review comment")
    public void user_writes_review_comment() {
        page.commentBox.get(0).click();
        Driver.getDriver().switchTo().frame(page.iframe);
        page.iframecommentBox.sendKeys("Review Comment");
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.sleep(3);
        page.sendButton.click();
    }

    //Scenarios

    @When("user is on the login page")
    public void user_is_on_the_login_page() {
        basePage.userLogin();
    }

    @When("User Writes a comment on a post")
    public void user_writes_a_comment_on_a_post() {
        page.commentButton.click();
        Driver.getDriver().switchTo().frame(page.iframe);
        page.iframecommentBox.sendKeys("Replying to OG Comment");
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.sleep(3);
        page.sendButton.click();
    }

    @When("user clicks on like")
    public void userClicksOnLike() {
        page.like.get(0).click();
    }

    @Then("a thumbs up appears on the left of the post")
    public void a_thumbs_up_appears_on_the_left_of_the_post() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(page.PostTU.isDisplayed());
        BrowserUtils.sleep(2);
    }

    @When("user clicks on unfollow")
    public void userClicksOnUnfollow() {
        page.unfollowB.click();
    }

    @Then("follow must be displayed")
    public void followMustBeDisplayed() {
        String follow = page.unfollowB.getText();
        Assert.assertEquals("Follow", follow);
    }

    @When("user clicks on like on review")
    public void userClicksOnLikeOnReview() {
        page.likes.get(0).click();
    }

    @Then("a thumbs up appears on the right of the post")
    public void aThumbsUpAppearsOnTheRightOfThePost() {
        Assert.assertTrue(page.reviewTUs.get(0).isDisplayed());
    }

    @When("user clicks on reviewer's comment box")
    public void userClicksOnTheCommentBox() {
        page.reviewReply.click();
    }

    @And("user writes something")
    public void userWritesSomething() {
        Driver.getDriver().switchTo().frame(page.iframe);
        page.iframecommentBox.sendKeys("Replying to reviewer's Comment");
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.sleep(3);
        page.sendButton.click();
    }

    @Then("the comment appears on the post thread")
    public void theCommentAppearsOnThePostThread() {
        System.out.println(page.reviewerCommentAssert.getText());
        // Assert.assertTrue(page.reviewerCommentAssert.getText().contains("Replying to reviewer's Comment"));
    }

    @When("user clicks on like on own comment")
    public void userClicksOnLikeOnOwnComment() {
        page.likes.get(2).click();
    }

    @Then("a thumbs up appears on own comment")
    public void aThumbsUpAppearsOnOwnComment() {
        Assert.assertTrue(page.reviewTUs.get(2).isDisplayed());
    }

    @When("user clicks on reply on own comment")
    public void userClicksOnReplyOnOwnComment() {
        page.ownCommentReply.click();
    }

    @And("user writes something on own comment")
    public void userWritesSomethingOnOwnComment() {
        Driver.getDriver().switchTo().frame(page.iframe);
        page.iframecommentBox.sendKeys("Replying to Own Comment");
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.sleep(3);
        page.sendButton.click();
    }

    @Then("the own comment appears on the post thread")
    public void theOwnCommentAppearsOnThePostThread() {
        System.out.println(page.ownCommentReplyAssert.getText());
       // Assert.assertTrue(page.ownCommentReplyAssert.getText().contains("hr35@cybertekschool.com"));
    }

    @When("user clicks on more below the comment")
    public void user_clicks_on_more_below_the_comment() {
        page.moreButton.click();
    }

    @When("user clicks on view comment")
    public void user_clicks_on_view_comment() {
        page.moreMenu.get(0).click();
    }

    @Then("user is directed to conversations page")
    public void user_is_directed_to_conversations_page() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(page.pageTitle.getText().equals("Conversations"));
        page.backToActivityStream.click();
    }

    @And("user clicks on copy link")
    public void userClicksOnCopyLink() {
        page.moreMenu.get(1).click();

    }

    @Then("a tick appears next to the option")
    public void aTickAppearsNextToTheOption() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(page.doneIcon.isDisplayed());
    }

    @And("user clicks on edit")
    public void userClicksOnEdit() {
        page.moreMenu.get(2).click();
    }

    @Then("comment box opens")
    public void commentBoxOpens() {
        page.cancelButton.click();
    }

    @And("user clicks on delete")
    public void userClicksOnDelete() {
        page.moreMenu.get(3).click();
    }

    @Then("the comment disappears")
    public void theCommentDisappears() {
        Alert a = Driver.getDriver().switchTo().alert();
        a.dismiss();
    }

    @And("user clicks on create task")
    public void userClicksOnCreateTask() {
        page.moreMenu.get(4).click();
    }

    @Then("a sign with the words task has been created appears on top right")
    public void aSignWithTheWordsTaskHasBeenCreatedAppearsOnTopRight() {
        Assert.assertTrue(page.message.isDisplayed());
    }

    @When("user clicks on reviewer's name")
    public void userClicksOnReviewerSName() {
        page.reviewerName.click();
    }

    @Then("the reviewer's name is displayed")
    public void theReviewerSNameIsDisplayed() {
        Assert.assertTrue(page.profileTitle.getText().contains("@cybertekschool.com"));
        page.backToActivityStream.click();
    }

    @When("user clicks on the star")
    public void userClicksOnTheStar() {
     //   BrowserUtils.sleep(3);
      //  page.star.click();
    }

    @Then("the star area becomes orange")
    public void theStarAreaBecomesOrange() {
     //   Assert.assertTrue(page.orangeStar.isDisplayed());

    }
}
