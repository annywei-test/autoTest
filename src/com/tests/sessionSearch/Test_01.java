package com.tests.sessionSearch;

import com.codeborne.selenide.SelenideElement;
import com.domain.entities.tealeaf.TealeafBase;
import com.domain.entities.tealeaf.WaitTime;
import com.pages.AcousticLoginPage;
import com.pages.TealeafLoginPage;
import com.pages.TopNavigation;
import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.Keys.ENTER;

public class Test_01 extends TealeafBase {
    private final String searchOrg = "AutoTealeaf";
    private final SelenideElement orgSearchBtn = $("#um-toolbar");
   // private final SelenideElement orgSearchBtn = $(".form-control.search.ng-pristine.ng-valid.ng-empty.ng-touched");
    private final SelenideElement clickSelectedOrg = $(".btn.btn-info.btn-xs.ng-binding");

    @Test
    // @TmsLink("Test_01")
    @Description("Login to Tealeaf portal and select AutoTealeaf org")

    public void loginTl() {
        openOrgListPage();
        new TealeafLoginPage().ClickLogin();
        new AcousticLoginPage().inputAccount();
       // new AcousticLoginPage().loginToAutoTealeaf();
       // new AcousticLoginPage().openTealeafPortal();
        new TopNavigation().verifyUserLoginSuccess();
    }

}

