package com.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.exactTextCaseSensitive;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class IntelligentSearchPage {
    private final SelenideElement parent = $(".new-ss.sessions"),
            intelligentSearchSwitch = $$(".search-version-option").find(exactTextCaseSensitive("Search")),
            classicSearchSwitch = $$(".search-version-option").find(exactTextCaseSensitive("Class search")),
            searchBtn = parent.$(".search-button");
    //public final ConditionContainer<IntelligentSearchPage> conditionContainer = new ConditionContainer<>(parent.this);

    public IntelligentSearchPage switchToIntelligentSearch() {
        if (!intelligentSearchSwitch.has(cssClass("selected"))) {
            intelligentSearchSwitch.click();
        }
        return this;
    }

    public IntelligentSearchPage switchToClassicSearch() {
        if (!classicSearchSwitch.has(cssClass("selected"))) {
            classicSearchSwitch.click();
        }
        return this;
    }

    public IntelligentSearchPage search() {
        searchBtn.click();
        return this;
    }

    public IntelligentSearchPage waitForPageLoad() {

    }
}
