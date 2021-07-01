package com.example.bt_thuctap.Detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.bt_thuctap.R;
import com.example.bt_thuctap.model.Customer;

import static com.example.bt_thuctap.ActivityView.CustomerView.TITLE;

public class Customer_Detail extends AppCompatActivity {
 TextView tv_mkh,tv_tenkh,tv_diachi,tv_gioitinh,tv_sdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_detail);
        AnhXa();

        Intent intent =getIntent();;
        Customer customer = (Customer)intent.getSerializableExtra(TITLE);

        tv_mkh.setText(""+customer.getMaKH());
        tv_tenkh.setText(""+customer.getTenKH());
        tv_diachi.setText(""+customer.getDiaChi());
        tv_gioitinh.setText(""+customer.isGioiTinh());
        tv_sdt.setText(""+customer.getSDT());

    }

    private void AnhXa()
    {
        tv_mkh=findViewById(R.id.tv_makh_detail);
        tv_tenkh=findViewById(R.id.tv_tenkh_detail);
        tv_diachi=findViewById(R.id.tv_DiaChikh_detail);
        tv_gioitinh=findViewById(R.id.tv_gtkh_detail);
        tv_sdt=findViewById(R.id.tv_sdtkh_dettail);

    }

}