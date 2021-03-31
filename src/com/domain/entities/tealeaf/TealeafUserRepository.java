package com.domain.entities.tealeaf;

public enum TealeafUserRepository {
    orgadmin1("anny_test@yopmail.com"),
    orgadmin1Pwd("Oktaid@1"),
    orgadmin2("guserorgadm1@gmail.com"),
    orgadmin2Pwd("KANNpKDvu373944!!"),
    orgadmin3("huilan.wei@acoustic.co"),
    orgadmin3Pwd("Oktaid@1");

    private final String value;

    TealeafUserRepository(String value) {
        this.value = value;
    }

    public String GetValue() {
        return value;
    }

}
