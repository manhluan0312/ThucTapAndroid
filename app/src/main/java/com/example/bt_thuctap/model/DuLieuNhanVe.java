package com.example.bt_thuctap.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DuLieuNhanVe
{
    private  String access_token;
    private  String expires;
    private  String refresh_token;
    private  String fullname;
    private  String username;
    private  String unitId;
    private ArrayList<String> privileges;

    public DuLieuNhanVe() {
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public ArrayList<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(ArrayList<String> privileges) {
        this.privileges = privileges;
    }
}
