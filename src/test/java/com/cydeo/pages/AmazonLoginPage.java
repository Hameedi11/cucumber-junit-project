package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
    public AmazonLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    public WebElement accountButton;

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElement signInButton;


    public void amazonLoginMethod(String userName, String password){

       accountButton.click();
       inputUsername.sendKeys(userName);
       continueButton.click();
       inputPassword.sendKeys(password);
       signInButton.click();

    }

}
