package com.example.bt_thuctap.ActivityView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bt_thuctap.R;
import com.example.bt_thuctap.model.Customer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Customer_Infor extends AppCompatActivity {

    TextView tv_ten,tv_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_infor);
        tv_id=findViewById(R.id.textView_id);
        tv_ten=findViewById(R.id.textView_ten);

        Customer customer =new Customer();
        String id =getIntent().getStringExtra("ID");
        String ten =getIntent().getStringExtra("Ten");

        tv_id.setText("ID");
        tv_ten.setText("Ten");
    }
}