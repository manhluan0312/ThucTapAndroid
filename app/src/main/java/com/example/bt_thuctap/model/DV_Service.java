package com.example.bt_thuctap.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DV_Service implements Serializable
{
    @SerializedName("id")
    private int Id;
    @SerializedName("name")
    private String TenDV;
    @SerializedName("price")
    private int  Gia;
    @SerializedName("day")
    private int NgayDV;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String tenDV) {
        TenDV = tenDV;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public int getNgayDV() {
        return NgayDV;
    }

    public void setNgayDV(int ngayDV) {
        NgayDV = ngayDV;
    }
}
