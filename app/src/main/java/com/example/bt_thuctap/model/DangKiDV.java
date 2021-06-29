package com.example.bt_thuctap.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class DangKiDV
{
    @SerializedName("id")
    private int  id;

    @SerializedName("id_service")
    private int  id_service;

    @SerializedName("id_promotion")
    private int  id_promtion;

    @SerializedName("id_customer")
    private int  id_customer;

    @SerializedName("thoigiandk")
    private Date ThoiGianDK;

    @SerializedName("thoigiankichhoat")
    private Date ThoiGianKichHoat;

    @SerializedName("thoigiankethuc")
    private Date ThoiGianKetThuc;

    @SerializedName("songaydk")
    private int SoNgayDK;

    @SerializedName("gia")
    private float Gia;

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

    public Date getThoiGianDK() {
        return ThoiGianDK;
    }

    public void setThoiGianDK(Date thoiGianDK) {
        ThoiGianDK = thoiGianDK;
    }

    public Date getThoiGianKichHoat() {
        return ThoiGianKichHoat;
    }

    public void setThoiGianKichHoat(Date thoiGianKichHoat) {
        ThoiGianKichHoat = thoiGianKichHoat;
    }

    public Date getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date thoiGianKetThuc) {
        ThoiGianKetThuc = thoiGianKetThuc;
    }

    public int getSoNgayDK() {
        return SoNgayDK;
    }

    public void setSoNgayDK(int soNgayDK) {
        SoNgayDK = soNgayDK;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float gia) {
        Gia = gia;
    }

    public boolean isPay() {
        return Pay;
    }

    public void setPay(boolean pay) {
        Pay = pay;
    }
}
