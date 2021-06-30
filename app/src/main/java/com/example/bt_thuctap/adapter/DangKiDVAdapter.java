package com.example.bt_thuctap.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.bt_thuctap.R;
import com.example.bt_thuctap.model.DangKiDV;

import java.util.List;

public class DangKiDVAdapter extends BaseAdapter
{
    Context myContext;
    int myLayout;
    List<DangKiDV> dangKiDVList;

    public DangKiDVAdapter(Context myContext, int myLayout, List<DangKiDV> dangKiDVList) {
        this.myContext = myContext;
        this.myLayout = myLayout;
        this.dangKiDVList = dangKiDVList;
    }

    @Override
    public int getCount() {
        return dangKiDVList.size();
    }

    @Override
    public Object getItem(int position) {
        return dangKiDVList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(myLayout,null);


        TextView tv_id_dk = convertView.findViewById(R.id.tv_id_dkdv);
        TextView tv_id_service = convertView.findViewById(R.id.tv_idservice_dkdv);
        TextView tv_id_promotion= convertView.findViewById(R.id.tv_id_pro_dkdv);
        TextView tv_id_customer = convertView.findViewById(R.id.tv_id_kh_dkdv);
        TextView tv_tgdk=convertView.findViewById(R.id.tv_tgdk_dkdv);
        TextView tv_tgkh=convertView.findViewById(R.id.tv_tgkh_dkdv);
        TextView tv_tgkt=convertView.findViewById(R.id.tv_tgkt_dkdv);
        TextView tv_ngay=convertView.findViewById(R.id.tv_ngay_dkdv);
        TextView tv_gia=convertView.findViewById(R.id.tv_gia_dkdv);
        TextView tv_pay=convertView.findViewById(R.id.tv_pay_dkdv);

        DangKiDV dangKiDV=dangKiDVList.get(position);


        tv_id_dk.setText(""+dangKiDV.getId());
        tv_id_service.setText(""+dangKiDV.getId_service());
        tv_id_promotion.setText(""+dangKiDV.getId_promtion());
        tv_id_customer.setText(""+dangKiDV.getId_customer());
        tv_tgdk.setText(""+dangKiDV.getThoiGianDK());
        tv_tgkh.setText(""+dangKiDV.getThoiGianKichHoat());
        tv_tgkt.setText("" +dangKiDV.getThoiGianKetThuc());
        tv_ngay.setText(""+dangKiDV.getSoNgayDK());
        tv_gia.setText(""+dangKiDV.getGia());

        if(dangKiDV.isPay()==true)
       {
           tv_pay.setText("1");
       }
       else{
           tv_pay.setText("0");
       }

        return convertView;
    }
}



