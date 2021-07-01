package com.example.bt_thuctap.Detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.bt_thuctap.R;
import com.example.bt_thuctap.model.DV_Service;
import com.example.bt_thuctap.model.Promotion;

import static com.example.bt_thuctap.ActivityView.DV_ServiceView.TITLE2;
import static com.example.bt_thuctap.ActivityView.PromotionView.TITLE3;

public class Promotion_Detail extends AppCompatActivity {

    TextView tv_id,tv_dvid,tv_ten,tv_tgbd,tv_tgkt,tv_giakm,tv_ngaykm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion_detail);
        AnhXa();

        Intent intent =getIntent();;
        Promotion promotion = (Promotion) intent.getSerializableExtra(TITLE3);

        tv_id.setText(""+promotion.getId());
        tv_dvid.setText(""+promotion.getId_service());
        tv_ten.setText(""+promotion.getTenKhuyenMai());
        tv_tgbd.setText(""+promotion.getThoiGianBatDauKM());
        tv_tgkt.setText(""+promotion.getThoiGianKetThucKM());
        tv_giakm.setText(""+promotion.getGiaKM());
        tv_ngaykm.setText(""+promotion.getSoNgayKM());
    }

    private void AnhXa()
    {
        tv_id=findViewById(R.id.tv_makm_detail);
        tv_dvid=findViewById(R.id.tv_madv_detail);
        tv_ten=findViewById(R.id.tv_tenkm_detail);
        tv_tgbd=findViewById(R.id.tv_tgbdkm_detail);
        tv_tgkt=findViewById(R.id.tv_tgktkm_dettail);
        tv_giakm=findViewById(R.id.tv_giakm_dettail);
        tv_ngaykm=findViewById(R.id.tv_songaykm_dettail);
    }
}