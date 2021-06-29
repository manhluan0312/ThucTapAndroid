package com.example.bt_thuctap.API;

import com.example.bt_thuctap.model.Customer;
import com.example.bt_thuctap.model.Promotion;

import java.util.ArrayList;

public class APIResponePromotionModel
{
    private int currentPage;
    private int pageSize;
    private int totalRows;
    private ArrayList<Promotion> data;

    public APIResponePromotionModel() {
    }

    public APIResponePromotionModel(int currentPage, int pageSize, int totalRows, ArrayList<Promotion> data) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalRows = totalRows;
        this.data = data;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public ArrayList<Promotion> getData() {
        return data;
    }

    public void setData(ArrayList<Promotion> data) {
        this.data = data;
    }
}
