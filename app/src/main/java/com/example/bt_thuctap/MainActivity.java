package com.example.bt_thuctap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.bt_thuctap.ActivityView.CustomerView;
import com.example.bt_thuctap.ActivityView.DV_ServiceView;
import com.example.bt_thuctap.ActivityView.DangKiDVView;
import com.example.bt_thuctap.ActivityView.PromotionView;
import com.example.bt_thuctap.model.Promotion;

public class
MainActivity extends AppCompatActivity  implements View.OnClickListener{
    Button bt_kh,bt_tb,bt_ctkm,bt_banggiadv,bt_dkgoidv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                 AnhXa();
                 bt_kh.setOnClickListener(this);
                 bt_ctkm.setOnClickListener(this);
                 bt_banggiadv.setOnClickListener(this);
                 bt_dkgoidv.setOnClickListener(this);
    }

    private void AnhXa()
    {
        bt_kh=findViewById(R.id.btn_khachhang);
        bt_ctkm=findViewById(R.id.btn_chuongtrinhkhuyenmai);
        bt_banggiadv=findViewById(R.id.btn_banggiadichvu);
        bt_dkgoidv=findViewById(R.id.btn_dangkigoidichvu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.caidat,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.dangxuat:
                DangXuat();
        }
        return super.onOptionsItemSelected(item);
    }

    private void DangXuat()
    {
        AlertDialog.Builder altBuilder =new AlertDialog.Builder(this);
        altBuilder.setMessage("Bạn có muốn đăng xuất khỏi hệ thống  không ?");
        altBuilder.setPositiveButton("Có ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                Intent intent =new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        altBuilder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });
        altBuilder.show();
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_khachhang:
                Intent intent =new Intent(MainActivity.this, CustomerView.class);
                startActivity(intent);
                break;

            case R.id.btn_chuongtrinhkhuyenmai:
                Intent intent3 =new Intent(MainActivity.this, PromotionView.class);
                startActivity(intent3);
                break;

            case R.id.btn_banggiadichvu:
                Intent intent1=new Intent(MainActivity.this, DV_ServiceView.class);
                startActivity(intent1);
                break;

            case R.id.btn_dangkigoidichvu:
                Intent intent2=new Intent(MainActivity.this, DangKiDVView.class);
                startActivity(intent2);
                break;

        }

    }

}