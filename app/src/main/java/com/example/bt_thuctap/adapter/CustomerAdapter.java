package com.example.bt_thuctap.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import com.example.bt_thuctap.R;
import com.example.bt_thuctap.model.Customer;

public class CustomerAdapter extends BaseAdapter {

     Context myContext;
     int myLayout;
     ArrayList<Customer> arrayCustomer;

 public  CustomerAdapter(Context context,int layout,ArrayList<Customer> customerList) {
    myContext=context;
    myLayout=layout;
    arrayCustomer=customerList;
}

    @Override
    public int getCount() {
        return arrayCustomer.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayCustomer.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       convertView=inflater.inflate(myLayout,null);

        TextView tv_idkh = convertView.findViewById(R.id.tv_Makh);
        TextView tv_tenkh = convertView.findViewById(R.id.tv_tenkh);
        TextView tv_diachi = convertView.findViewById(R.id.DiaChikh);
        TextView tv_gioitinh = convertView.findViewById(R.id.tv_Gioitinhkh);
        TextView tv_sdt=convertView.findViewById(R.id.sdtkh);


        Customer customer=arrayCustomer.get(position);
        tv_idkh.setText("Mã khách hàng : "+customer.getMaKH());
        tv_tenkh.setText("Tên khách hàng : "+customer.getTenKH());
        if(customer.isGioiTinh()==true)
        {
            tv_gioitinh.setText(" Giới tính : Nam");
        }
        else
        {
            tv_gioitinh.setText(" Giới tính : Nữ");
        }
        tv_diachi.setText("Địa chỉ khách hàng :"+customer.getDiaChi());
        tv_sdt.setText("Số điện thoại khách hàng :"+customer.getSDT());

        return convertView;

    }

    }

