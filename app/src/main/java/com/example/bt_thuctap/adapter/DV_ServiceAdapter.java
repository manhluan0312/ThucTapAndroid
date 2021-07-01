package com.example.bt_thuctap.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.example.bt_thuctap.R;
import com.example.bt_thuctap.model.Customer;
import com.example.bt_thuctap.model.DV_Service;

public class DV_ServiceAdapter extends BaseAdapter {

    Context myContext;
    int myLayout;
    ArrayList<DV_Service> arrayDV_Services;
    ArrayList<DV_Service> arrayDV_ServicesOld;

    public DV_ServiceAdapter(Context myContext, int myLayout, ArrayList<DV_Service> arrayDV_Services) {
        this.myContext = myContext;
        this.myLayout = myLayout;
        this.arrayDV_Services = arrayDV_Services;
        this.arrayDV_ServicesOld=new ArrayList<DV_Service>();
        this.arrayDV_ServicesOld.addAll(arrayDV_ServicesOld);
    }

    @Override
    public int getCount() {
        return arrayDV_Services.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayDV_Services.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(myLayout,null);

        TextView tv_iddv = convertView.findViewById(R.id.id_dv);
        TextView tv_tendv = convertView.findViewById(R.id.tv_ten_dv);
        TextView tv_gia = convertView.findViewById(R.id.Gia_dv);
        TextView tv_ngaydv = convertView.findViewById(R.id.tv_ngay_dv);


        DV_Service dv_service= arrayDV_Services.get(position);

        tv_iddv.setText("Mã dịch vụ :" + dv_service.getId());
        tv_tendv.setText("Tên dịch vụ :"+dv_service.getTenDV());
        tv_gia.setText("Giá dịch vụ :"+dv_service.getGia());
        tv_ngaydv.setText("Số ngày đăng kí dịch vụ :" +dv_service.getNgayDV());

        return convertView;

    }


    public void Filter(String chartext)
    {
        chartext=chartext.toLowerCase(Locale.getDefault());
        arrayDV_Services.clear();
        if(chartext.length()==0)
        {
            arrayDV_Services.addAll(arrayDV_ServicesOld);
        }
        else
        {
            for (DV_Service dv:arrayDV_ServicesOld)
            {
                 if(dv.getTenDV().toLowerCase(Locale.getDefault()).contains(chartext))
                 {
                     arrayDV_Services.add(dv);
                 }
            }
        }
        notifyDataSetChanged();
    }
}