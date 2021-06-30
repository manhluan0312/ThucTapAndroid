package com.example.bt_thuctap.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Promotion
{
    @SerializedName("id")
    private int id;

    @SerializedName("service_id")
    private int id_service;

    @SerializedName("name")
    private String TenKhuyenMai;

    @SerializedName("timeBegin")
    private String ThoiGianBatDauKM ;

    @SerializedName("timeEnd")
    private String ThoiGianKetThucKM;

    @SerializedName("pricePromotion")
    private int GiaKM;

    @SerializedName("dayPromotion")
    private int SoNgayKM;

    public Promotion() {
    }

    public Promotion(int id, int id_service, String tenKhuyenMai, String thoiGianBatDauKM, String thoiGianKetThucKM, int giaKM, int soNgayKM) {
        this.id = id;
        this.id_service = id_service;
        TenKhuyenMai = tenKhuyenMai;
        ThoiGianBatDauKM = thoiGianBatDauKM;
        ThoiGianKetThucKM = thoiGianKetThucKM;
        GiaKM = giaKM;
        SoNgayKM = soNgayKM;
    }

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

    public String getThoiGianBatDauKM() {
        return ThoiGianBatDauKM;
    }

    public void setThoiGianBatDauKM(String thoiGianBatDauKM) {
        ThoiGianBatDauKM = thoiGianBatDauKM;
    }

    public String getThoiGianKetThucKM() {
        return ThoiGianKetThucKM;
    }

    public void setThoiGianKetThucKM(String thoiGianKetThucKM) {
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
