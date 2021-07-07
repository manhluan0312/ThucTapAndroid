package com.example.bt_thuctap.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class DangKiDV implements Serializable
{
    @SerializedName("id")
    private int  id;

    @SerializedName("service_id")
    private int  id_service;

    @SerializedName("promotion_id")
    private int  id_promtion;

    @SerializedName("customer_id")
    private int  id_customer;

    @SerializedName("timeRegister")
    private String ThoiGianDK;

    @SerializedName("timeActivated")
    private String ThoiGianKichHoat;

    @SerializedName("timeEnd")
    private String ThoiGianKetThuc;

    @SerializedName("day")
    private int SoNgayDK;

    @SerializedName("pay")
    private boolean Pay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_service() {
        return id_service;
    }

    public void setId_service(int id_service) {
        this.id_service = id_service;
    }

    public int getId_promtion() {
        return id_promtion;
    }

    public void setId_promtion(int id_promtion) {
        this.id_promtion = id_promtion;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getThoiGianDK() {
        return ThoiGianDK;
    }

    public void setThoiGianDK(String thoiGianDK) {
        ThoiGianDK = thoiGianDK;
    }

    public String getThoiGianKichHoat() {
        return ThoiGianKichHoat;
    }

    public void setThoiGianKichHoat(String thoiGianKichHoat) {
        ThoiGianKichHoat = thoiGianKichHoat;
    }

    public String getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        ThoiGianKetThuc = thoiGianKetThuc;
    }

    public int getSoNgayDK() {
        return SoNgayDK;
    }

    public void setSoNgayDK(int soNgayDK) {
        SoNgayDK = soNgayDK;
    }

    public boolean isPay() {
        return Pay;
    }

    public void setPay(boolean pay) {
        Pay = pay;
    }
}
