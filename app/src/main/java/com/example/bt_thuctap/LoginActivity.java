package com.example.bt_thuctap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.app.VoiceInteractor;
import android.content.Intent;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.bt_thuctap.common.Constant;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.OutputKeys;


public class LoginActivity extends AppCompatActivity {

    EditText edit_user, edit_password;
    Button dangnhap;

    String url = "http://192.168.1.54/api/token/auth/";
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edit_user = (EditText) findViewById(R.id.editext_username);
        edit_password = (EditText) findViewById(R.id.editext_pass);
        dangnhap = (Button) findViewById(R.id.btn_dangnhap);



        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
                //CallLoginServer();
            }

        });
    }

    private void CallLoginServer() {
        final String user = edit_user.getText().toString().trim();
        final String pass = edit_password.getText().toString().trim();


        if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass))
        {
            Toast.makeText(LoginActivity.this,"Vui lòng nhập thông tin ",Toast.LENGTH_SHORT).show();
        }
        JsonObjectRequest jsonObjectRequest =new JsonObjectRequest(Request.Method.POST, url,
                null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response)
            {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("TEST", error.getMessage());
            }
        }) {
            @Override
            public Map<String, String> getHeaders() {
                HashMap<String, String> header = new HashMap<>();
                header.put("Accept", "*/*");
                header.put("Authorization", "Bearer " + Constant.TOKEN);
                return header;
            }
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("client_id", "EPS");
                params.put("client_secret", "b0udcdl8k80cqiyt63uq");
                params.put("grant_type", "password");
                params.put("username", "admin");
                return params;
            }

        };


        RequestQueue requestQueue =Volley.newRequestQueue(this);
        requestQueue.add(jsonObjectRequest);
    }
}




