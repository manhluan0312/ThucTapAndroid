package com.example.bt_thuctap.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.example.bt_thuctap.R;
import com.example.bt_thuctap.model.Promotion;

import java.util.Date;
import java.util.List;

public class PromotionAdapter extends BaseAdapter

{

    Context myContext;
    int myLayout;
    List<Promotion> arrayPromotion;

    public PromotionAdapter(Context myContext, int myLayout, List<Promotion> arrayPromotion) {
        this.myContext = myContext;
        this.myLayout = myLayout;
        this.arrayPromotion = arrayPromotion;
    }

    @Override
    public int getCount() {
        return arrayPromotion.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayPromotion.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(myLayout,null);

        TextView tv_id_pro = convertView.findViewById(R.id.tv_idkm);
        TextView tv_id_service = convertView.findViewById(R.id.tv_idservice_KM);
        TextView tv_tenkm= convertView.findViewById(R.id.TenKM);
        TextView tv_tgbd_km = convertView.findViewById(R.id.tv_tg_bdkm);
        TextView tv_tgkt_km=convertView.findViewById(R.id.tv_tg_ktkm);
        TextView tv_gia_km=convertView.findViewById(R.id.tv_giakm);
        TextView tv_ngaykm=convertView.findViewById(R.id.tv_songayKM);

        Promotion promotion=new Promotion();
        promotion =arrayPromotion.get(position);
        tv_id_pro.setText(""+promotion.getId());
        tv_id_service.setText(""+promotion.getId_service());
        tv_tenkm.setText(""+promotion.getTenKhuyenMai());
        tv_tgbd_km.setText(""+promotion.getThoiGianBatDauKM());
        tv_tgkt_km.setText(""+ promotion.getThoiGianKetThucKM());
        tv_gia_km.setText(""+promotion.getGiaKM());
        tv_ngaykm.setText(""+promotion.getSoNgayKM());


        return convertView;
    }
}



