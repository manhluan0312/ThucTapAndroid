package com.example.bt_thuctap.Detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.bt_thuctap.ActivityView.DangKiDVView;
import com.example.bt_thuctap.R;
import com.example.bt_thuctap.model.Customer;
import com.example.bt_thuctap.model.DangKiDV;

import static com.example.bt_thuctap.ActivityView.CustomerView.TITLE;

public class DangKiDV_Detail extends AppCompatActivity {

    TextView tv_id,tv_iddv,tv_km,tv_idkh,tv_tgdk,tv_tgkh,tv_tgkt,tv_songaydk,tv_gia,tv_pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki_dv_detail);
        AnhXa();

        Intent intent =getIntent();;

    }

    private void AnhXa()
    {
        tv_id=findViewById(R.id.tv_madkdv_dkdv_detail);
        tv_iddv=findViewById(R.id.tv_madv_dkgdv_detail);
        tv_km=findViewById(R.id.tv_makm_dkgdv_detail);
        tv_idkh=findViewById(R.id.tv_makh_dkgdv_detail);
        tv_tgdk=findViewById(R.id.tv_tgdk_dkgdv_dettail);
        tv_tgkh=findViewById(R.id.tv_tgkh_dkgdv_dettail);
        tv_tgkt=findViewById(R.id.tv_tgkt_dkgdv_dettail);
        tv_songaydk=findViewById(R.id.tv_day_dkgdv_dettail);
        //tv_pay=findViewById(R.id.tv_pay_dkgdv_dettail);
    }
}