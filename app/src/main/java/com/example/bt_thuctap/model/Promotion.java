package com.example.bt_thuctap.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Promotion
{

    @SerializedName("id")
    private int id;

    @SerializedName("id_service")
    private int id_service;

    @SerializedName("tenkhuyenmai")
    private String TenKhuyenMai;

    @SerializedName("thoigianbatdaukm")
    private Date ThoiGianBatDauKM ;

    @SerializedName("thoigianketthuckhuyenmai")
    private Date ThoiGianKetThucKM;

    @SerializedName("giakm")
    private int GiaKM;

    @SerializedName("songaykm")
    private int SoNgayKM;

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

    public String getTenKhuyenMai() {
        return TenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        TenKhuyenMai = tenKhuyenMai;
    }

    public Date getThoiGianBatDauKM() {
        return ThoiGianBatDauKM;
    }

    public void setThoiGianBatDauKM(Date thoiGianBatDauKM) {
        ThoiGianBatDauKM = thoiGianBatDauKM;
    }

    public Date getThoiGianKetThucKM() {
        return ThoiGianKetThucKM;
    }

    public void setThoiGianKetThucKM(Date thoiGianKetThucKM) {
        ThoiGianKetThucKM = thoiGianKetThucKM;
    }

    public int getGiaKM() {
        return GiaKM;
    }

    public void setGiaKM(int giaKM) {
        GiaKM = giaKM;
    }

    public int getSoNgayKM() {
        return SoNgayKM;
    }

    public void setSoNgayKM(int soNgayKM) {
        SoNgayKM = soNgayKM;
    }
}
