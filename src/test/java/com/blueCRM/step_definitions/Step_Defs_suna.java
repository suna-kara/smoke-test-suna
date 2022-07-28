package com.blueCRM.step_definitions;

import com.blueCRM.pages.BasePage_Suna;
import com.blueCRM.utilities.ConfigurationReader;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Step_Defs_suna {
     BasePage_Suna page=new BasePage_Suna();
    @Given("user is on homepage")
    public void user_is_on_homepage() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       page.userNameBox.sendKeys(ConfigurationReader.getProperty("username")+ Keys.ENTER);
       page.passwordBox.sendKeys(ConfigurationReader.getProperty("password")+Keys.ENTER);
       page.loginButton.click();
    }
    @Given("user clicks on Task")
    public void user_clicks_on_task() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user clicks on the High Priority check box")
    public void the_user_clicks_on_the_high_priority_check_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the  High Priority check box should be selected")
    public void the_high_priority_check_box_should_be_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();

    }

    @When("HR  user adds first participant")
    public void hr_user_adds_first_participant() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR  user adds second participant")
    public void hr_user_adds_second_participant() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR  user adds third person")
    public void hr_user_adds_third_person() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("users should be seen in the participant box")
    public void users_should_be_seen_in_the_participant_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("HR user clicks on the Things  to do section after the TASK tab")
    public void hr_user_clicks_on_the_things_to_do_section_after_the_task_tab() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR user enters a Task name")
    public void hr_user_enters_a_task_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR user clicks on High Priority checkbox button")
    public void hr_user_clicks_on_high_priority_checkbox_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR user clicks on SEND button")
    public void hr_user_clicks_on_send_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Task\\(s) should be seen on the count under MY TASKS table")
    public void task_s_should_be_seen_on_the_count_under_my_tasks_table() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("HR user clicks on Checklist")
    public void hr_user_clicks_on_checklist() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR user adds Things to do section")
    public void hr_user_adds_things_to_do_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR user selects add button")
    public void hr_user_selects_add_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("HR should verify checklist add while creating a task")
    public void hr_should_verify_checklist_add_while_creating_a_task() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @When("HR users click on the Deadline İnputbox")
    public void hr_users_click_on_the_deadline_i̇nputbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR users  should be able to enter a valid deadline time after the current time and doubleclick or click select button")
    public void hr_users_should_be_able_to_enter_a_valid_deadline_time_after_the_current_time_and_doubleclick_or_click_select_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("HR user should verify that the provided deadline time is displayed on the deadline inputbox.")
    public void hr_user_should_verify_that_the_provided_deadline_time_is_displayed_on_the_deadline_inputbox() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @When("HR users click deadline section")
    public void hr_users_click_deadline_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR users click a valid date and time")
    public void hr_users_click_a_valid_date_and_time() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR users select the valid date and time")
    public void hr_users_select_the_valid_date_and_time() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR users Click on the Time planning section")
    public void hr_users_click_on_the_time_planning_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR users click Start task on")
    public void hr_users_click_start_task_on() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR users click valid date and time")
    public void hr_users_click_valid_date_and_time() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR users select valid date and time")
    public void hr_users_select_valid_date_and_time() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR users click Duration section")
    public void hr_users_click_duration_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("HR users add  {string} days")
    public void hr_users_add_days(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("HR users should see finish date automatically at Finish section")
    public void hr_users_should_see_finish_date_automatically_at_finish_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
