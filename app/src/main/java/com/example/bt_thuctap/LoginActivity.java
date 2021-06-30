package com.example.bt_thuctap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;


public class LoginActivity extends AppCompatActivity {


    String url = "http://192.168.1.54/api/token/auth/";
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText edit_user, edit_password;
        Button dangnhap;

        edit_user = (EditText) findViewById(R.id.editext_username);
        edit_password = (EditText) findViewById(R.id.editext_pass);
        dangnhap = (Button) findViewById(R.id.btn_dangnhap);

        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=edit_user.getText().toString().trim();
                String pass =edit_password.getText().toString().trim();


           /*
               if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
                {
                    Toast.makeText(LoginActivity.this,"Vui lòng nhập thông tin ",Toast.LENGTH_SHORT).show();
                }
           */
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                DangNhap();
           }

            private void DangNhap()
            {




            }

        });


    }
}


