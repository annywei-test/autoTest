package com.domain.entities.tealeaf;

import com.pages.AcousticLoginPage;
import com.pages.IntelligentSearchPage;
import com.pages.TealeafLoginPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.domain.entities.tealeaf.EndPoint.INTELLIGENT_SEARCH;

public class TealeafBase {
    /*
    Open URL
     */
    private static final String tealeafUrl = "https://eaoc.qa.goacoustic.com";
    private static final String intelliSearch = "/webapp/home#/intelli-search";
    private static final String webAppUrl = "/webapp/login";
    private static final String orgList = "/webapp/home#/admin/orgs";


    public static void openTealeafLoginPage() {
        open(tealeafUrl);
        return;
    }

    public static void openOrgListPage() {
        open(tealeafUrl + orgList);
        WaitTime.sleep(2000, "Wait for Org list show up");
        //Thread.sleep(2000);
        return;
    }

    protected IntelligentSearchPage openItelligentSearch() {
        open(tealeafUrl + INTELLIGENT_SEARCH.GetValue());
        new TealeafLoginPage().ClickLogin();
        new AcousticLoginPage().inputAccount();
        new IntelligentSearchPage().switchToIntelligentSearch();
        return new IntelligentSearchPage();
    }


    // wait.Until(Duration.ofSeconds(5), Duration.ofSeconds(5), () -> assertThat(orgList.is(Condition.visible)).isTrue());

    @Test
    private void openUrl() {
        open(tealeafUrl + INTELLIGENT_SEARCH.GetValue());
    }
}
