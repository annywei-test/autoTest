package com.domain.entities.tealeaf;

public enum EndPoint {
    WEBAPP_LOGIN("/webapp/login"),
    INTELLIGENT_SEARCH("/webapp/home#/intelli-search"),
    ORG_LIST("/webapp/home#/admin/orgs");

             private final String value;

                     EndPoint(String value) {
        this.value = value;
    }

    public String GetValue() {
        return value;
    }
}
