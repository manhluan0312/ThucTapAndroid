package com.example.bt_thuctap.API;

import com.example.bt_thuctap.model.DV_Service;

import java.util.ArrayList;

public class APIResponeDV_serviceModel
{
    private int currentPage;
    private int pageSize;
    private int totalRows;
    private ArrayList<DV_Service> data;

    public APIResponeDV_serviceModel() {

    }

    public APIResponeDV_serviceModel(int currentPage, int pageSize, int totalRows, ArrayList<DV_Service> data) {
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

    public ArrayList<DV_Service> getData() {
        return data;
    }

    public void setData(ArrayList<DV_Service> data) {
        this.data = data;
    }
}
