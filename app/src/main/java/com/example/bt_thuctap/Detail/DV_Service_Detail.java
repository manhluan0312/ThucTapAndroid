package com.example.bt_thuctap.Detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.bt_thuctap.R;
import com.example.bt_thuctap.model.Customer;
import com.example.bt_thuctap.model.DV_Service;

import static com.example.bt_thuctap.ActivityView.CustomerView.TITLE;
import static com.example.bt_thuctap.ActivityView.DV_ServiceView.TITLE2;

public class DV_Service_Detail extends AppCompatActivity {

    TextView tv_id,tv_ten,tv_gia,tv_ngay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dv_service_detail);
        AnhXa();

        DV_Service dv_service =new DV_Service();

        Intent intent =getIntent();
        int id=getIntent().getIntExtra("ID",0);
        String ten =getIntent().getStringExtra("Ten");
        String ngay =getIntent().getStringExtra("Ngay");
        String gia =getIntent().getStringExtra("Gia");

        tv_id.setText(""+id);
        tv_ten.setText(""+ten);
        tv_ngay.setText(""+ngay);
        tv_gia.setText(""+gia);

    }

    private void AnhXa()
    {
     tv_id=findViewById(R.id.tv_madv_detail);
     tv_ten=findViewById(R.id.tv_tendv_detail);
     tv_gia=findViewById(R.id.tv_giadv_detail);
     tv_ngay=findViewById(R.id.tv_ngaydv_detail);
    }
}