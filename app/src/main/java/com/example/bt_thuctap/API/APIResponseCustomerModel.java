package com.example.bt_thuctap.API;

import com.example.bt_thuctap.model.Customer;

import java.util.ArrayList;

public class APIResponseCustomerModel {
    private int currentPage;
    private int pageSize;
    private int totalRows;
    private ArrayList<Customer> data;

    public APIResponseCustomerModel() {
    }

    public APIResponseCustomerModel(int currentPage, int pageSize, int totalRows, ArrayList<Customer> data) {
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

    public ArrayList<Customer> getData() {
        return data;
    }

    public void setData(ArrayList<Customer> data) {
        this.data = data;
    }
}
