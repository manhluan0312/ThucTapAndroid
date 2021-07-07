package com.example.bt_thuctap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.bt_thuctap.common.Constant;
import com.example.bt_thuctap.model.DuLieuGuiDi;
import com.example.bt_thuctap.model.DuLieuNhanVe;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";

    EditText edit_user, edit_password;
    Button dangnhap;

    SharedPreferences sharedPreferences;
    private Gson gson = new Gson();
    ArrayList<DuLieuNhanVe> duLieuNhanVeArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);

        edit_user = (EditText) findViewById(R.id.editext_username);
        edit_password = (EditText) findViewById(R.id.editext_pass);
        dangnhap = (Button) findViewById(R.id.btn_dangnhap);

        sharedPreferences=getSharedPreferences("datatoken",MODE_PRIVATE);

        String user1 = edit_user.getText().toString().trim();
        String pass1 = edit_password.getText().toString().trim();
        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    CallLoginServer();
            }
        });
    }

    private void CallLoginServer() {

        String user = edit_user.getText().toString().trim();
        String pass = edit_password.getText().toString().trim();
        String url = "http://192.168.1.54/api/token/auth";

        DuLieuGuiDi loginInfo = new DuLieuGuiDi("EPS",
                "b0udcdl8k80cqiyt63uq",
                "password"
                ,user
                ,pass
                );

        try{
            doLogin(url, loginInfo);
        }catch (Exception ex){
            Log.e(TAG, ex.getMessage());
        }

      //  else {
            //Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            //startActivity(intent);
             //ResponeServer();
        //}

    }
    public void doLogin(String url, DuLieuGuiDi loginInfo) throws JSONException {
        String jsonData = gson.toJson(loginInfo);
        JSONObject jsonObject = new JSONObject(jsonData);

        JsonObjectRequest jsonObjectRequest =new JsonObjectRequest(Request.Method.POST, url,
                jsonObject, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                DuLieuNhanVe duLieuNhanVe = gson.fromJson(response.toString(), DuLieuNhanVe.class);

                //lay du lieu ra khoi share
                sharedPreferences.getString("token","");

                try {
                    String token=response.getString("access_token");

                    SharedPreferences.Editor editor=sharedPreferences.edit();

                    editor.putString("token",token);

                    editor.apply();
                    Log.d(TAG,token);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);

            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, error.getMessage());
            }
        }) {
            @Override
            public Map<String, String> getHeaders() {
                HashMap<String, String> header = new HashMap<>();
                header.put("Accept", "*/*");
                header.put("Authorization", "Bearer "+ sharedPreferences.getString("token",""));
                return header;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonObjectRequest);
    }
}




