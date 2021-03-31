package com.pages;

import com.codeborne.selenide.SelenideElement;
import com.domain.entities.tealeaf.TealeafBase;
import com.domain.entities.tealeaf.WaitTime;

import static com.codeborne.selenide.Selenide.$;

public class TealeafLoginPage {
     private final SelenideElement parent = $(".login-page"),
    welcomeText = parent.$(".welcome"),
    loginGreenBtn = parent.$("button.login-green-button-inside"),
    createAccountWhiteBtn = parent.$("button.login-white-button");

    public TealeafLoginPage ClickLogin() {
        loginGreenBtn.click();
        WaitTime.sleep(2000, "Wait for user name input page show up");
        //Thread.sleep(2000);
        //  acceptBtn();
        return this;
    }

    public TealeafLoginPage createNewAccount() {
        createAccountWhiteBtn.click();
        return new TealeafLoginPage();
    }

}
