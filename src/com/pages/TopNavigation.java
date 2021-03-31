package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TopNavigation {
    private final SelenideElement orgNameIsPresent = $(".ng-scope.active.org-name.ng-scope");

    public TopNavigation verifyUserLoginSuccess() {
        String selectedOrg = "AutoTealeaf";
        orgNameIsPresent.should(Condition.matchesText(selectedOrg));
        return this;
    }
}
