package com.blueCRM.step_definitions;

import com.blueCRM.pages.MessagePage_ZSS;
import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Map;

import static org.junit.Assert.*;

public class StepDefinitions_ZSS {
    MessagePage_ZSS mesaggePage= new MessagePage_ZSS();
    Actions actions= new Actions(Driver.getDriver());


    @Given("User is expected to login with valid credentials")
    public void user_is_expected_to_login_with_and(Map<String, String> credentials) {
        Driver.getDriver().get("https://qa.azulcrm.com/");
        mesaggePage.userNameInput_z.sendKeys(credentials.get("username"));
        mesaggePage.userPasswordInput_z.sendKeys(credentials.get("password"));
        mesaggePage.loginButton_z.click();
    }

    @When("user clicks on the send message tab")
    public void user_clicks_on_the_send_message_tab() {
        mesaggePage.messageBox_z.click();
        BrowserUtils.sleep(5);
    }
    @When("user clicks on the uploadFile button")
    public void user_clicks_on_the_upload_file_button() {
        mesaggePage.uploadFileButton_z.click();
        BrowserUtils.sleep(1);
    }

    String filePath1_PDF = ConfigurationReader.getProperty("filePath1.pdf");
    String filePath2_PDF = ConfigurationReader.getProperty("filePath2.pdf");
    String filePath3_PDF = ConfigurationReader.getProperty("filePath3.pdf");
    String filePath_word = ConfigurationReader.getProperty("filePath.word");
    String filePath_zip = ConfigurationReader.getProperty("filePath.zip");
    String filePath_jpeg= ConfigurationReader.getProperty("filePath.jpeg");
    String filePath_png = ConfigurationReader.getProperty("filePath.png");


    @And("user uploads a file from upload files and images section")
    public void userUploadsAFileFromUploadFilesAndImagesSection() {
        actions.moveToElement(mesaggePage.uploadFilesAndImagesBox).perform();
        BrowserUtils.sleep(10);

        mesaggePage.uploadFilesAndImages.sendKeys(filePath1_PDF);
        BrowserUtils.sleep(6);
    }

    @Then("the uploaded file name should be displayed")
    public void theUploadedFileNameShouldBeDisplayed() {
     assertTrue(mesaggePage.displayedFileNameBox.isDisplayed());
    }

    @And("user uploads more than one file by using upload files and images section")
    public void userUploadsMoreThanOneFileByUsingUploadFilesAndImagesSection() {
        actions.moveToElement(mesaggePage.uploadFilesAndImagesBox).perform();
        BrowserUtils.sleep(2);

        mesaggePage.uploadFilesAndImages.sendKeys(filePath1_PDF);
        BrowserUtils.sleep(10);
        mesaggePage.uploadFilesAndImages.sendKeys(filePath2_PDF);
        BrowserUtils.sleep(3);
        mesaggePage.uploadFilesAndImages.sendKeys(filePath3_PDF);
        BrowserUtils.sleep(3);
    }

    @Then("the each file should be sucsessfully uploaded")
    public void theEachFileShouldBeSucsessfullyUploaded() {
        for (WebElement eachFileText : mesaggePage.listOfMultipleFileNameText) {
            assertTrue(eachFileText.isDisplayed());
        }
    }

    @And("user uploads a file in PDF format")
    public void userUploadsAFileInPDFFormat() {
        BrowserUtils.sleep(3);
        actions.moveToElement(mesaggePage.uploadFilesAndImages).perform();
        BrowserUtils.sleep(4);

        mesaggePage.uploadFilesAndImages.sendKeys(filePath2_PDF);

        BrowserUtils.sleep(3);

    }

    @And("user uploads a file in WORD format")
    public void userUploadsAFileInWORDFormat() {
        BrowserUtils.sleep(4);
        mesaggePage.uploadFilesAndImages.sendKeys(filePath_word);
        BrowserUtils.sleep(3);
    }

    @And("user uploads a file in ZIP format")
    public void userUploadsAFileInZIPFormat() {
        BrowserUtils.sleep(4);
        mesaggePage.uploadFilesAndImages.sendKeys(filePath_zip);
        BrowserUtils.sleep(3);
    }

    @Then("the files should be sucsessfully uploaded")
    public void theFilesShouldBeSucsessfullyUploaded() {
        assertTrue(mesaggePage.listOfMultipleFileNameText.size()==3);
        BrowserUtils.sleep(1);
        for (WebElement eachFileText : mesaggePage.listOfMultipleFileNameText) {
            assertTrue(eachFileText.isDisplayed());
        }
    }

    @And("user uploads a file in JPEG format")
    public void userUploadsAFileInJPEGFormat() {
        actions.moveToElement(mesaggePage.uploadFilesAndImagesBox).perform();
        BrowserUtils.sleep(3);
        mesaggePage.uploadFilesAndImages.sendKeys(filePath_jpeg);
        BrowserUtils.sleep(3);
    }
String imgName;
    @And("user uploads a file in PNG format")
    public void userUploadsAFileInPNGFormat() {
        BrowserUtils.sleep(3);
        mesaggePage.uploadFilesAndImages.sendKeys(filePath_png);
        BrowserUtils.sleep(3);
        imgName= mesaggePage.displayedFileNameText.getText();
        BrowserUtils.sleep(3);
    }

    @Then("user should be able to display the uploaded picture in Activity Stream")
    public void userShouldBeAbleToDisplayTheUploadedPicture() {
        BrowserUtils.sleep(5);
        assertTrue(mesaggePage.imageInActivityStream.getAttribute("data-bx-title").contains(imgName)
        || imgName.contains(mesaggePage.imageInActivityStream.getAttribute("data-bx-title")));

    }

    @And("user clicks on the insert to text button")
    public void userClicksOnTheInsertToTextButton() {
        mesaggePage.insertInTextButton.click();
        BrowserUtils.sleep(1);
    }

    @Then("user should see the file name inside the message box")
    public void userShouldSeeTheFileNameInsideTheMessageBox() {
        String fileName= mesaggePage.getDisplayedFileNameText_value.getAttribute("value");
        String expectedFileName = fileName.substring(0, fileName.indexOf(" "));
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.className("bx-editor-iframe")));
        BrowserUtils.sleep(2);
        String messageText= mesaggePage.insideTheMessageBox.getText();
        BrowserUtils.sleep(3);
        assertTrue(messageText.contains(expectedFileName));
    }

    @Then("user should be able to click and check the allow a recipient button")
    public void userShouldBeAbleToClickAndCheckTheAllowARecipientButton() {
        if(!mesaggePage.allowRecipientsCheckBox.isSelected()){
            mesaggePage.allowRecipientsCheckBox.click();
            assertTrue(mesaggePage.allowRecipientsCheckBox.isSelected());
        }else{
            mesaggePage.allowRecipientsCheckBox.click();
            assertFalse(mesaggePage.allowRecipientsCheckBox.isSelected());
        }
    }

    @Then("user should be able to click the delete button")
    public void userShouldBeAbleToClickTheDeleteButton() {
        assertTrue(mesaggePage.deleteButton_z.isDisplayed());
        mesaggePage.deleteButton_z.click();
    }

    @Then("the files should be removed after clicking the delete button")
    public void theFilesShouldBeRemovedAfterClickingTheDeleteButton() {
        assertEquals(false,mesaggePage.isElementPresent(mesaggePage.displayedFileNameBox));

    }

    @Then("user should click the rename button")
    public void userShouldClickTheRenameButton() {
        actions.moveToElement(mesaggePage.displayedFileNameBox).perform();
        BrowserUtils.sleep(1);
        mesaggePage.renameFileButton.click();
    }

    @Then("user should be able to rename the file by using the rename button")
    public void userShouldBeAbleToRenameTheFileByUsingTheRenameButton() {
        mesaggePage.renameFileEditBox.sendKeys(Keys.CONTROL +"a");
        mesaggePage.renameFileEditBox.sendKeys(Keys.DELETE);
        mesaggePage.renameFileEditBox.sendKeys("renaming_performed" + Keys.ENTER);
        BrowserUtils.sleep(2);
        String renamedFileName= mesaggePage.displayedFileNameText.getText();
        assertTrue(renamedFileName.contains("renaming_performed"));
    }


    @Then("message should be sent")
    public void messageShouldBeSent() {
        BrowserUtils.sleep(3);
        assertTrue(mesaggePage.fileNameDisplayedAfterSendingMessage.isDisplayed());
    }
    @And("user clicks the send button")
    public void userClicksTheSendButton() {
        mesaggePage.sendMessageButton_z.click();
    }


    @And("user chooses an employee in the employee list and clicks send button")
    public void userChoosesAnEmployeeInTheEmployeeList() {
        mesaggePage.addEmployeeButton_z.click();
        mesaggePage.listOfEmployees_z.get(0).click();
        BrowserUtils.sleep(2);
    }

    @Then("message should be sent to the selected employee")
    public void messageShouldBeSentToTheSelectedEmployee() {
        WebElement selectedEmployee= mesaggePage.listOfEmployees_z.get(0);
        BrowserUtils.sleep(2);

        mesaggePage.sendMessageButton_z.click();

        assertTrue(mesaggePage.fileNameDisplayedAfterSendingMessage.isDisplayed());
        assertEquals(selectedEmployee.getText(), mesaggePage.emailNameDisplayedAfterSendingMessage.getText());
    }


}
