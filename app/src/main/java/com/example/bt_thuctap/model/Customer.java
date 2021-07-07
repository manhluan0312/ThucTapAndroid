package com.example.bt_thuctap.model;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Customer implements Serializable {
    @SerializedName("id")
    private int MaKH;
    @SerializedName("name")
    private String TenKH;
    @SerializedName("address")
    private String DiaChi;
    @SerializedName("sex")
    private boolean GioiTinh;
    @SerializedName("phone")
    private int  SDT;

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int maKH) {
        MaKH = maKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String tenKH) {
        TenKH = tenKH;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
}


