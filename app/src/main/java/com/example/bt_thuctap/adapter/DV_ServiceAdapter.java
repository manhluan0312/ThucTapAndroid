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
        this.arrayDV_ServicesOld=arrayDV_Services;
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


    public Filter getFilter()
    {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String search =constraint.toString();//tu can search
                if(search.isEmpty())//tu tim kiem
                {
                    arrayDV_Services=arrayDV_ServicesOld;//danh sach moi bang ds ban dau
                }
                else
                {
                    ArrayList<DV_Service> list =new ArrayList<>();
                    for(DV_Service dv_service:arrayDV_ServicesOld)
                    {
                        if(dv_service.getTenDV().toLowerCase().contains(search.toLowerCase()))  //ep kieu tu can tim ve in thuong
                        {
                            list.add(dv_service);//tra ve list tu can tim phu hop
                        }
                    }

                    arrayDV_Services =list;
                }
                FilterResults filterResults=new FilterResults();
                filterResults.values=arrayDV_Services;//tra ve ket qua

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
               arrayDV_Services= (ArrayList<DV_Service>) results.values;
               notifyDataSetChanged();
            }
        };
    }
}