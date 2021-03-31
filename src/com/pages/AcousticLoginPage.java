package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import com.domain.entities.tealeaf.EndPoint;
import com.domain.entities.tealeaf.TealeafBase;
import com.domain.entities.tealeaf.TealeafUserRepository;
import com.domain.entities.tealeaf.WaitTime;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;


import static com.codeborne.selenide.Selenide.$;
import static com.domain.entities.tealeaf.TealeafBase.openTealeafLoginPage;

public class AcousticLoginPage {
    private final SelenideElement acceptBtn = $("#truste-consent-button");
    private final SelenideElement userNameInput = $("#username");
    private final SelenideElement passWordInput = $("#password");
    private final SelenideElement continueBtn = $("button.sign-in-form__button");
    private final String orgadmin1 = "anny_test@yopmail.com";
    private final String orgadmin1Pwd = "Oktaid@1";
   private final String orgadmin2 = "guserorgadm1@gmail.com";
    private final String orgadmin2Pwd = "KANNpKDvu373944!!";
    private final String searchOrg = "AutoTealeaf";
    private final SelenideElement orgSearchBtn = $("input#um-toolbar");
    private final SelenideElement clickSelectedOrg = $(".btn.btn-info.btn-xs.ng-binding");

  //  private final SelenideElement selectAutoTealeaf = $("#um-left-pane > div > table > tbody > tr:nth-child(2)");

    /*public AcousticLoginPage waitOrgListShowUp(WebDriver driver, By by, int timeOutInSeconds) {
        if(!orgList.is(Condition.visible)){
            Thread.sleep(5000);

        WebDriverWait waitOrgList = new WebDriverWait(driver, 5);
        WebElement orglist = waitOrgList.until(ExpectedConditions.elementToBeClickable(orgList));
        return new AcousticLoginPage();

    }
     */

   /* public void waitOrgListShowUp() {
        // System.setProperty("webdriver.chrome.driver", "")
        ChromeDriver chrome = new ChromeDriver();
        WebDriverWait waitOrgList = new WebDriverWait(chrome, 10, 100);
        waitOrgList.until(ExpectedConditions.elementToBeClickable(selectAutoTealeaf));
    }

    */

    public void inputAccount() {
        WaitTime.sleep(2000,"Wait for User name input page~");
        userNameInput.setValue(orgadmin2);
        acceptBtn.click();
        continueBtn.click();
        passWordInput.setValue(orgadmin2Pwd);
        continueBtn.click();
    }

    public AcousticLoginPage openTealeafPortal() {
       // openTealeafLoginPage();
        new TealeafLoginPage().ClickLogin();
        inputAccount();
        return new AcousticLoginPage();
        // AcousticLoginPage acousticLoginPage = new AcousticLoginPage();

    }



    public AcousticLoginPage selectAutoTealeaf() throws InterruptedException {
        //accessTealeafPortal();
        Thread.sleep(10000);
        //    waitOrgListShowUp();
       // selectAutoTealeaf.click();
        orgSearchBtn.setValue(searchOrg).sendKeys(Keys.ENTER);
        clickSelectedOrg.click();
        return this;
    }
}
