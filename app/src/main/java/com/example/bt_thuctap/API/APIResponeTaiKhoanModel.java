package com.example.bt_thuctap.API;

import com.example.bt_thuctap.model.DuLieuNhanVe;

import java.util.ArrayList;

public class APIResponeTaiKhoanModel
{
    private ArrayList<DuLieuNhanVe> data;

    public APIResponeTaiKhoanModel() {
    }

    public APIResponeTaiKhoanModel(ArrayList<DuLieuNhanVe> data) {
        this.data = data;
    }

    public ArrayList<DuLieuNhanVe> getData() {
        return data;
    }

    public void setData(ArrayList<DuLieuNhanVe> data) {
        this.data = data;
    }
}
