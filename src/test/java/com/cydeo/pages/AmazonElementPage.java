package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonElementPage {
    public AmazonElementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[.='EOOUT 40 Pack A5 Kraft Notebooks Journals, 12 Colors Composition Cover with Rainbow Spines, 60 Pages Lined Paper for Kids, School Supplies, Office Supplies']")
    public WebElement item;


}
