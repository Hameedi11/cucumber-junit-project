package com.cydeo.step_definitions;

import com.cydeo.pages.AmazonElementPage;
import com.cydeo.pages.AmazonLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_StepDef {

    AmazonLoginPage amazonLoginPage = new AmazonLoginPage();
    AmazonElementPage amazonElementPage = new AmazonElementPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user is on Amazon home page")
    public void user_is_on_amazon_home_page() {
        //Driver.getDriver().get("https://www.amazon.com/");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String userName, String password) {
        // the code below is moved to login page to call the method in one line
//        amazonLoginPage.accountButton.click();
//        amazonLoginPage.inputUsername.sendKeys(userName);
//        amazonLoginPage.continueButton.click();
//        amazonLoginPage.inputPassword.sendKeys(password);
//        amazonLoginPage.signInButton.click();

        amazonLoginPage.amazonLoginMethod(userName, password);
    }
    @When("user searches for {string} in the search box and enters")
    public void user_searches_for_in_the_search_box_and_enters(String searchItem) {

        amazonElementPage.searchBox.sendKeys(searchItem,  Keys.ENTER);

    }
    @When("user scroll down the page and selected' the {string}")
    public void user_scroll_down_the_page_and_selected_the(String item) {

        actions.moveToElement(amazonElementPage.item);
        amazonElementPage.item.click();

    }
    @When("user checks has the correct {string} selected Or not")
    public void user_checks_has_the_correct_selected_or_not(String expectedItem) {


       String actualItem = amazonElementPage.item.getText();

       Assert.assertTrue(actualItem.contains(expectedItem));



    }


}
